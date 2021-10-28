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

public class AppVendedor extends JFrame{
	/*
	 *  hacer un login para el vendedor, entra con un correo y contraseña, en caso de no existir se puede dar de alta.
	 *  despues de darse de alta el vendedor puede modificar sus datos, darse da baja, ABM propietario, ABM inmueble, 
	 *  el vendedor puede modificar o dar de baja a un cliente
	 *  
	 *  En la pantalla de inicio el cliente podra consultar los inmuebles y a partir de los datos ingresados se genera el catalogo
	 *  en la lista de catalogo podra reservar o comprar un inmueble. ACA SE CREA EL CLIENTE CON LOS DATOS DEL INMUEBLE Y LOS SUYOS
	 *  
	 */
	public AppVendedor() {
	
	}

	public static void main(String[] args) {
//		 EntityManagerFactory emf = ConexionDAO.getInstance();
//		 EntityManager man = emf.createEntityManager();

		 Login login = new Login();
		 login.setVisible(true);

		// man.close();
	}

}
