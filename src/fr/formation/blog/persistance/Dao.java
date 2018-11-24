package fr.formation.blog.persistance;

import java.util.List;

/**Defition des 4 methodes du CRUD + la methode readAll.
 * @author Adminl
 *
 * @param <T> classe qui  represente le type de donnees manipule par le DAO.
 */
public interface Dao<T> {

	/** Crée une nouvelle entité en BDD.
	 * @param entity l'entite à créer
	 * @return T l'entité créée avec son id rempli.
	 */
	public T create(T entity);
	
	/** Lit les informations d'une entite en BDD.
	 * @param id l'identitfiant unique de l'entite
	 * @return T l'entite construite à partir des informations recuperees
	 */
	public T read(Integer id);
	
	/** Recupere toutes les entites d'une table.
	 * @return List<T> la liste de toutes les entites de la table.
	 */
	public List<T> readAll();
	
	/**Met à jour l'entite donnee dans la BDD.
	 * @param entity L'entite à mettre à jour.
	 * @return T l'entité mise à jour.
	 */
	public T update(T entity);
	
	
	/** Supprime définitivement une entite de la BDD.
	 * @param id L'id unique de l'entyite à supprimée
	 * @return true si la suppression a bien eu lieu, false sinon.
	 */
	public boolean delete(Integer id);
	
	
}
