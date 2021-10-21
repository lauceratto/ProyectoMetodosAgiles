package tp.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionDAO {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

	private ConexionDAO() {
		
	}
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}
}