package fr.formation.blog.persistance;

public class SqlQueries {
	
	public static final String READ_ALL_ARTICLE = "SELECT * FROM article;";
	public static final String CREATE_ARTICLE = "INSERT INTO article VALUES (null, '%s', '%s');";
	public static final String DELETE_ARTICLE = "DELETE FROM article where id = %s;";

}
