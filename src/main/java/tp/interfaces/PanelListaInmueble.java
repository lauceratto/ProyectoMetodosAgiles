package tp.interfaces;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import tp.App.AppVendedor;
import tp.dominio.Inmueble;
import tp.gestores.GestorInmueble;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;

public class PanelListaInmueble extends JPanel {
	
	private JComboBox listaInmuebles;
	private JLabel lblSeleccion;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private GestorInmueble gestorInmueble;
	
	public PanelListaInmueble(Login login) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista de Imuebles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(47, 31, 473, 239);
		add(panel);
		panel.setLayout(null);
		
		listaInmuebles = new JComboBox();
		listaInmuebles.setBounds(114, 85, 224, 21);
		this.listaInmuebles.addItem("Seleccionar");
		this.listaInmuebles.setSelectedItem("Seleccionar");
		panel.add(listaInmuebles);
		
		lblSeleccion = new JLabel("Seleccione un inmueble de la lista:");
		lblSeleccion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSeleccion.setBounds(114, 62, 224, 13);
		panel.add(lblSeleccion);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnModificar.setBounds(114, 175, 85, 21);
		btnModificar.addActionListener(l -> {	
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Modificar inmueble");
			login.setContentPane(new PanelModificacionInmueble(login));
			login.pack();
			login.revalidate();
			login.repaint();
		
		});
		panel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 12));
		btnEliminar.setBounds(253, 175, 85, 21);
		btnEliminar.addActionListener(l -> {
			int n = JOptionPane.showConfirmDialog( null, "Desea eliminar este inmueble?", "Mensaje", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "El inmueble fue eliminado con exito!");
				//this.gestorInmueble.eliminarInmueble((Inmueble)this.listaInmuebles.getSelectedItem());
				this.listaInmuebles.removeItem(listaInmuebles.getSelectedItem());
			}
		});
		panel.add(btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(427, 277, 85, 21);
		btnCancelar.addActionListener(l -> {	
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Inicio vendedor");
			login.setContentPane(new PanelInicioVendedor(login));
			login.pack();
			login.revalidate();
			login.repaint();
		
		});
		add(btnCancelar);
		
		//DATOS
		this.listaInmuebles.addItem("Jose Perez - Urquiza 1643");
		
		
		
	}
}
