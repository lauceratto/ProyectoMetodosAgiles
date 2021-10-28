package tp.interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class PanelInicioVendedor extends JPanel {

	
	public PanelInicioVendedor(Login login) {
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Gestion Vendedor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(384, 27, 256, 88);
		add(panel);
		panel.setLayout(null);
		
		//setIconImage(Toolkit.getDefaultToolkit().getImage(PanelInicioVendedor.class.getResource("/tp/icons/Icon.png")));
		
		JButton btnBajaVendedor = new JButton("Baja");
		btnBajaVendedor.setBounds(24, 36, 89, 23);
		panel.add(btnBajaVendedor);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(146, 36, 89, 23);
		panel.add(btnModificar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Gestion Propietario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 27, 345, 88);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAltaPropietario = new JButton("Alta");
		btnAltaPropietario.setBounds(10, 39, 89, 23);
		panel_1.add(btnAltaPropietario);
		
		JButton btnBajaPropietario = new JButton("Baja");
		btnBajaPropietario.setBounds(122, 39, 89, 23);
		panel_1.add(btnBajaPropietario);
		
		JButton btnModificarPropietario = new JButton("Modificar");
		btnModificarPropietario.setBounds(234, 39, 89, 23);
		panel_1.add(btnModificarPropietario);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Gestion Inmueble", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 164, 345, 88);
		add(panel_1_1);
		
		JButton btnAltaInmueble = new JButton("Alta");
		btnAltaInmueble.setBounds(10, 39, 89, 23);
		panel_1_1.add(btnAltaInmueble);
		
		JButton btnBajaInmueble = new JButton("Baja");
		btnBajaInmueble.setBounds(122, 39, 89, 23);
		panel_1_1.add(btnBajaInmueble);
		
		JButton btnModificarInmueble = new JButton("Modificar");
		btnModificarInmueble.setBounds(234, 39, 89, 23);
		panel_1_1.add(btnModificarInmueble);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Gestion Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(384, 164, 256, 88);
		add(panel_2);
		
		JButton btnListaClientes = new JButton("Lista Clientes");
		btnListaClientes.setBounds(70, 38, 125, 23);
		panel_2.add(btnListaClientes);
	}
}
