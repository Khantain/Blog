package fr.formation.blog.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.blog.metier.Article;
import fr.formation.blog.metier.ArticleService;

public class IndexServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Article> articles = ArticleService.getInstance().getAll();
		req.setAttribute("articles", articles);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);

	}

}
