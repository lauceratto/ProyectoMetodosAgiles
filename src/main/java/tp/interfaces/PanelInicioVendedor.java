package tp.interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import tp.App.AppVendedor;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelInicioVendedor extends JPanel {

	
	public PanelInicioVendedor(Login login) {
		
		setLayout(null);
		
		//PANEL GESTION VENDEDOR.
		JPanel panelGestionVendedor = new JPanel();
		panelGestionVendedor.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), new Color(160, 160, 160)), "Gestion Vendedor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelGestionVendedor.setBounds(384, 27, 256, 88);
		add(panelGestionVendedor);
		panelGestionVendedor.setLayout(null);
		
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
		panelGestionVendedor.add(btnBajaVendedor);
		
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
		panelGestionVendedor.add(btnModificar);
		
		//PANEL GESTION PROPIETARIO.
		JPanel panelGestionPropietario = new JPanel();
		panelGestionPropietario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(160, 160, 160)), "Gestion Propietario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelGestionPropietario.setBounds(10, 27, 345, 88);
		add(panelGestionPropietario);
		panelGestionPropietario.setLayout(null);
		
		JButton btnAltaPropietario = new JButton("Alta Propietario");
		btnAltaPropietario.setBounds(35, 39, 128, 23);
		btnAltaPropietario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login.setMinimumSize(new Dimension(1000, 600));
				login.setLocation(300, 70);
				login.setTitle("Alta propietario");
				login.setContentPane(new PanelAltaPropietario(login));
				login.pack();
				login.revalidate();
				login.repaint();
			}
		});
		panelGestionPropietario.add(btnAltaPropietario);
		
		JButton btnListaPropietarios = new JButton("Lista Propietarios");
		btnListaPropietarios.setBounds(186, 39, 137, 23);
		btnListaPropietarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login.setMinimumSize(new Dimension(670, 340));
				login.setLocation(300, 70);
				login.setTitle("Lista propietarios");
				login.setContentPane(new PanelPropietarioLista(login));
				login.pack();
				login.revalidate();
				login.repaint();
			}
		});
		panelGestionPropietario.add(btnListaPropietarios);
		
		//PANEL GESTION DE INMUEBLE.
		JPanel panelGestionInmueble = new JPanel();
		panelGestionInmueble.setLayout(null);
		panelGestionInmueble.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 255), new Color(160, 160, 160)), "Gestion Inmueble", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelGestionInmueble.setBounds(10, 164, 345, 88);
		add(panelGestionInmueble);
		
		JButton btnAltaInmueble = new JButton("Alta Inmueble");
		btnAltaInmueble.setBounds(40, 39, 124, 23);
		panelGestionInmueble.add(btnAltaInmueble);
		
		JButton btnModificarInmueble = new JButton("Lista Inmuebles");
		btnModificarInmueble.setBounds(191, 39, 131, 23);
		panelGestionInmueble.add(btnModificarInmueble);
		
		//PANEL GESTION CLIENTE.
		JPanel panelGestionCliente = new JPanel();
		panelGestionCliente.setLayout(null);
		panelGestionCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(160, 160, 160)), "Gestion Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelGestionCliente.setBounds(384, 164, 256, 88);
		add(panelGestionCliente);
		
		JButton btnListaClientes = new JButton("Lista Clientes");
		btnListaClientes.setBounds(70, 38, 125, 23);
		panelGestionCliente.add(btnListaClientes);
	}
}
