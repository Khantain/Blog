package fr.formation.blog.persistance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.formation.blog.metier.Article;

public class ArticleDao implements Dao<Article> {

	private final MySQLConnection mySqlConn;

	public ArticleDao() {
		this.mySqlConn = MySQLConnection.getInstance();
	}

	@Override
	public Article create(Article entity) {
		try {
			Statement st = this.mySqlConn.getConn().createStatement();
			String query = String.format(SqlQueries.CREATE_ARTICLE, entity.getTitle(), entity.getContent());
			boolean success = st.execute(query, Statement.RETURN_GENERATED_KEYS);

			if (success) {
				ResultSet rs = st.getGeneratedKeys();

				entity.setId(rs.getInt("GENERATED_KEY"));
			}

		} catch (SQLException e) {
		}
		return entity;

	}

	@Override
	public Article read(Integer id) {
		return null;
	}

	@Override
	public List<Article> readAll() {
		List<Article> result = new ArrayList<>();

		try {
			Statement st = this.mySqlConn.getConn().createStatement();
			ResultSet rs = st.executeQuery(SqlQueries.READ_ALL_ARTICLE);
			while (rs.next()) {
				Integer i = rs.getInt("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				result.add(new Article(title, content, i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Article update(Article entity) {
		return null;
	}

	@Override
	public boolean delete(Integer id) {
		boolean result = false;

		try {
			Statement st = this.mySqlConn.getConn().createStatement();
			int i = st.executeUpdate(String.format(SqlQueries.DELETE_ARTICLE, id));
			if (i == 1) {
				result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

}
