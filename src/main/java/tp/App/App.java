package tp.App;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import tp.dao.ConexionDAO;

public class App {

	public static void main(String[] args) {
		 EntityManagerFactory emf = ConexionDAO.getInstance();
		 EntityManager man = emf.createEntityManager();
	
		 man.close();
	}

}
