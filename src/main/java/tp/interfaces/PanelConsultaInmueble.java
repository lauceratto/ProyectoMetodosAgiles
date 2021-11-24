package tp.interfaces;


import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import tp.gestores.GestorInmueble;
import tp.dominio.Inmueble;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class PanelConsultaInmueble extends JFrame {
	private JTextField textFieldBarrio;
	private JTextField textFieldPrecioMax;
	private JTextField textFieldPrecioMin;
	private JComboBox<String> comboBoxProvincia = new JComboBox<String>();
	private JComboBox<String> comboBoxLocalidad = new JComboBox<String>();
	private JComboBox<String> comboBoxTipoInmueble = new JComboBox<String>();
	private JComboBox<String> comboBoxOrdenar = new JComboBox<String>();
	private GestorInmueble gestorInmueble = new GestorInmueble();
	private List<Inmueble> inmuebles = new ArrayList<Inmueble>();
	
	public PanelConsultaInmueble() {
		setMinimumSize(new Dimension(720, 400));
		setLocation(300, 70);
		getContentPane().setLayout(null);
		setTitle("Consulta Inmueble");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PanelInicioVendedor.class.getResource("/tp/icons/Icon.png")));
		
//		comboBoxOrdenar.setFont(new Font("Arial", Font.PLAIN, 12));
//		comboBoxOrdenar.setModel(new DefaultComboBoxModel<String>(new String[] {"-Seleccionar-", "Valoracion", "Precio (Mayor a menor)", "Precio (Menor a mayor)", "Lo m\u00E1s nuevo"}));
//		comboBoxOrdenar.setBounds(526, 75, 161, 22);
//		getContentPane().add(comboBoxOrdenar);
//		
//		JLabel lblNewLabel = new JLabel("Ordenar por");
//		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
//		lblNewLabel.setBounds(526, 57, 107, 14);
//		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Consulta Inmueble");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(63, 40, 222, 22);
		getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Buscar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(26, 108, 661, 186);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Provincia");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 32, 97, 14);
		panel.add(lblNewLabel_2);
		
		comboBoxProvincia.setModel(new DefaultComboBoxModel<String>(new String[] {"-Seleccionar-"}));
		comboBoxProvincia.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxProvincia.setBounds(123, 29, 149, 22);
		panel.add(comboBoxProvincia);
		
		JLabel lblNewLabel_2_1 = new JLabel("Localidad");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 77, 97, 14);
		panel.add(lblNewLabel_2_1);
		
		
		comboBoxLocalidad.setModel(new DefaultComboBoxModel<String>(new String[] {"-Seleccionar-"}));
		comboBoxLocalidad.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxLocalidad.setBounds(123, 74, 149, 22);
		panel.add(comboBoxLocalidad);
		
		JLabel lblNewLabel_2_2 = new JLabel("Barrio");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(343, 32, 97, 14);
		panel.add(lblNewLabel_2_2);
		
		textFieldBarrio = new JTextField();
		textFieldBarrio.setBounds(449, 30, 149, 20);
		panel.add(textFieldBarrio);
		textFieldBarrio.setColumns(10);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Tipo Inmueble");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(343, 78, 115, 14);
		panel.add(lblNewLabel_2_2_1);
		
		
		comboBoxTipoInmueble.setModel(new DefaultComboBoxModel<String>(new String[] {"-Seleccionar-"}));
		comboBoxTipoInmueble.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxTipoInmueble.setBounds(449, 74, 149, 22);
		panel.add(comboBoxTipoInmueble);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cant. Dormitorios");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(10, 120, 138, 14);
		panel.add(lblNewLabel_2_1_1);
		
		JSpinner spinnerDorm = new JSpinner();
		spinnerDorm.setBounds(144, 118, 44, 20);
		panel.add(spinnerDorm);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Precio (m\u00E1x)");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(216, 120, 97, 14);
		panel.add(lblNewLabel_2_1_1_1);
		
		textFieldPrecioMax = new JTextField();
		textFieldPrecioMax.setColumns(10);
		textFieldPrecioMax.setBounds(309, 118, 76, 20);
		panel.add(textFieldPrecioMax);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Precio (min)");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1_1.setBounds(416, 120, 97, 14);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		textFieldPrecioMin = new JTextField();
		textFieldPrecioMin.setColumns(10);
		textFieldPrecioMin.setBounds(522, 118, 76, 20);
		panel.add(textFieldPrecioMin);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(532, 153, 97, 22);
		btnNewButton.addActionListener(l -> {
			String barrio = textFieldBarrio.getText();
			String precioMax = textFieldPrecioMax.getText();
			String precioMin = textFieldPrecioMin.getText();
			Integer dormitorios = (Integer)spinnerDorm.getValue();	
			String provincia = comboBoxProvincia.getSelectedItem().toString();
			String localidad = comboBoxLocalidad.getSelectedItem().toString();
			String tipoInmueble = comboBoxTipoInmueble.getSelectedItem().toString();
						
			inmuebles = gestorInmueble.buscarInmueble(barrio, precioMax, precioMin, dormitorios, provincia, localidad, tipoInmueble);
			
			gestorInmueble.ordenarInmuebles(inmuebles);
		});
		panel.add(btnNewButton);
		
		
	}
}
