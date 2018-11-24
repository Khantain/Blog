package fr.formation.blog.metier;

/** Classe POJO (Plain Old Java Object) : classe qui respecte les contraintes suivantes : 
 * <ul>
 * <li>Des attributs uniquement privés</li>
 * <li>Un constructeur par defaut</li>
 * <li>Pas de methode de traitement !!!</li>
 * <li>Des accesseurs pour chaque attribut</li>
 *</ul>
 */
public class Article {
	
	private String title;
	private String content;
	private Integer id;

	
	
	public Article() {
	}

	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	

	public Article(String title, String content, Integer id) {
		this(title, content);
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
