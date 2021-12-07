package tp.interfaces;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class PanelInicioCliente extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelInicioCliente(LoginCliente login) {
		setLayout(null);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 0, 0), new Color(160, 160, 160)), "Gestion Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(84, 27, 186, 206);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCatalogo = new JButton("Generar Catalogo");
		btnCatalogo.setBounds(27, 128, 131, 23);
		btnCatalogo.addActionListener(l -> {
//			login.setMinimumSize(new Dimension(670, 340));
//			login.setLocation(300, 70);
			login.setTitle("Catalogo de inmuebles");
			login.setContentPane(new PanelCatalogoInmuebles(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		panel_1.add(btnCatalogo);
		
		JButton btnModificarDatos = new JButton("Modificar datos");
		btnModificarDatos.setBounds(27, 59, 131, 23);
		btnModificarDatos.addActionListener(l -> {
			setMinimumSize(new Dimension(900, 620));
			setLocation(300, 70);
			login.setTitle("Modificar cliente");
			login.setContentPane(new PanelModificacionCliente(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		panel_1.add(btnModificarDatos);
	}

}
