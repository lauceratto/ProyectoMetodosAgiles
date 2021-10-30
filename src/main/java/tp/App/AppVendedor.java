package tp.App;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import tp.dao.ConexionDAO;
import tp.interfaces.Login;
import tp.interfaces.PanelAltaVendedor;
import tp.interfaces.PanelInicioVendedor;

public class AppVendedor extends JPanel{

	public AppVendedor() {
		main(null);
	}

	public static void main(String[] args) {
//		 EntityManagerFactory emf = ConexionDAO.getInstance();
//		 EntityManager man = emf.createEntityManager();
		 Login login = new Login();
		 login.setVisible(true);

		// man.close();
	}

}
