package tp.interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import tp.App.AppVendedor;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Dimension;

public class PanelInicioVendedor extends JPanel {

	
	public PanelInicioVendedor(Login login) {
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(160, 160, 160)), "Gestion Vendedor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(384, 27, 256, 88);
		add(panel);
		panel.setLayout(null);
		
		//setIconImage(Toolkit.getDefaultToolkit().getImage(PanelInicioVendedor.class.getResource("/tp/icons/Icon.png")));
		
		JButton btnBajaVendedor = new JButton("Baja");
		btnBajaVendedor.setBounds(24, 36, 89, 23);
		btnBajaVendedor.addActionListener(l -> {
			int n = JOptionPane.showConfirmDialog( null, "Desea eliminar su cuenta?", "Mensaje", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Su cuenta fue borrada con exito!");
				login.setVisible(false);
				login.setMinimumSize(new Dimension(300, 350));
				login.setLocation(600, 200);
				login.setContentPane(new AppVendedor());
				login.pack();
				login.revalidate();
				login.repaint();
				
			}
		});
		panel.add(btnBajaVendedor);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(146, 36, 89, 23);
		btnModificar.addActionListener(l -> {
			login.setMinimumSize(new Dimension(900, 620));
			login.setLocation(300, 70);
			login.setTitle("Modificar vendedor");
			login.setContentPane(new PanelModificacionVendedor(login));
			login.pack();
			login.revalidate();
			login.repaint();
			
		});
		panel.add(btnModificar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(160, 160, 160)), "Gestion Propietario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 27, 345, 88);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAltaPropietario = new JButton("Alta Propietario");
		btnAltaPropietario.setBounds(35, 39, 128, 23);
		btnAltaPropietario.addActionListener(l -> {
			login.setMinimumSize(new Dimension(900, 620));
			login.setLocation(300, 70);
			login.setTitle("Alta propietario");
			login.setContentPane(new PanelAltaPropietario(login));
			login.pack();
			login.revalidate();
			login.repaint();
			
		});
		panel_1.add(btnAltaPropietario);
		
		JButton btnModificarPropietario = new JButton("Lista Propietarios");
		btnModificarPropietario.setBounds(186, 39, 137, 23);
		btnModificarPropietario.addActionListener(l -> {
			login.setMinimumSize(new Dimension(900, 620));
			login.setLocation(300, 70);
			login.setTitle("Lista de propietarios");
			login.setContentPane(new PanelListaPropietario(login));
			login.pack();
			login.revalidate();
			login.repaint();
			
		});
		panel_1.add(btnModificarPropietario);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(160, 160, 160)), "Gestion Inmueble", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 150, 630, 88);
		add(panel_1_1);
		
		JButton btnAltaInmueble = new JButton("Alta Inmueble");
		btnAltaInmueble.setBounds(40, 39, 124, 23);
		btnAltaInmueble.addActionListener(l -> {
			login.setMinimumSize(new Dimension(900, 620));
			login.setLocation(300, 70);
			login.setTitle("Alta inmueble");
			login.setContentPane(new PanelAltaInmueble(login));
			login.pack();
			login.revalidate();
			login.repaint();
			
		});
		panel_1_1.add(btnAltaInmueble);
		
		JButton btnModificarInmueble = new JButton("Lista Inmuebles");
		btnModificarInmueble.setBounds(239, 39, 131, 23);
		btnModificarInmueble.addActionListener(l -> {
			login.setMinimumSize(new Dimension(600, 420));
			login.setLocation(300, 70);
			login.setTitle("Lista de inmuebles");
			login.setContentPane(new PanelListaInmueble(login));
			login.pack();
			login.revalidate();
			login.repaint();
			
		});
		panel_1_1.add(btnModificarInmueble);
		
		JButton btnConsulta = new JButton("Consulta Inmueble");
		btnConsulta.setBounds(446, 39, 143, 23);
		btnConsulta.addActionListener(l -> {
			login.setTitle("Consulta inmuebles");
			login.setContentPane(new PanelConsultaInmueble(login));
			login.pack();
			login.revalidate();
			login.repaint();
			
		});
		panel_1_1.add(btnConsulta);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(160, 160, 160)), "Gestion Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 271, 630, 88);
		add(panel_2);
		
		JButton btnListaClientes = new JButton("Lista Clientes");
		btnListaClientes.setBounds(240, 33, 125, 23);
		btnListaClientes.addActionListener(l -> {
			login.setMinimumSize(new Dimension(800, 600));
			login.setLocation(300, 70);
			login.setTitle("Lista de Clientes");
			login.setContentPane(new PanelListaCliente(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		panel_2.add(btnListaClientes);
	}
}
