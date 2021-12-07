package tp.interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import tp.dominio.Cliente;
import tp.dominio.Inmueble;
import tp.gestores.GestorCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PanelModificacionCliente extends JPanel{
	
	/**
	 * tipo de inmueble, localidad, barrio, características, y monto disponible
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textDNI;
	private JTextField textMinimo;
	private JTextField textMaximo;
	private GestorCliente gestorCliente = new GestorCliente();
	private JTextField txtMatiasloveragmailcom;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public PanelModificacionCliente(LoginCliente login) {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(new Rectangle(71, 60, 750, 451));
		panel.setBorder(new TitledBorder(null, "Modificación Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(43, 54, 750, 496);
		add(panel);
		panel.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(241, 54, 141, 20);
		textNombre.setColumns(10);
		textNombre.setText("Matias");
		panel.add(textNombre);
		
		JLabel lblNewLabel = new JLabel("Nombre ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(88, 52, 91, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(88, 112, 155, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono ");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(409, 54, 155, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mínimo ");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(88, 455, 155, 20);
		panel.add(lblNewLabel_3);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(241, 113, 141, 20);
		textApellido.setText("Lovera");
		panel.add(textApellido);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(562, 55, 141, 20);
		textTelefono.setText("4550465");
		panel.add(textTelefono);
		
		textDNI = new JTextField();
		textDNI.setEnabled(false);
		textDNI.setColumns(10);
		textDNI.setBounds(562, 114, 141, 20);
		textDNI.setText("15024963");
		panel.add(textDNI);
		
		JLabel lblNewLabel_3_1 = new JLabel("DNI ");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(409, 112, 155, 20);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Máximo ");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(409, 455, 155, 20);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Presupuesto de inmueble");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(88, 424, 199, 20);
		panel.add(lblNewLabel_3_2);
		
		textMinimo = new JTextField();
		textMinimo.setColumns(10);
		textMinimo.setBounds(241, 456, 141, 20);
		textMinimo.setText("300000");
		panel.add(textMinimo);
		
		textMaximo = new JTextField();
		textMaximo.setColumns(10);
		textMaximo.setBounds(562, 456, 141, 20);
		textMaximo.setText("500000");
		panel.add(textMaximo);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("--------------------------------------------------------------------------");
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2_1.setBounds(178, 259, 387, 20);
		panel.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("Correo Electronico");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(88, 179, 155, 14);
		panel.add(lblNewLabel_4);
		
		txtMatiasloveragmailcom = new JTextField();
		txtMatiasloveragmailcom.setEnabled(false);
		txtMatiasloveragmailcom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMatiasloveragmailcom.setText("Matiaslovera99@gmail.com");
		txtMatiasloveragmailcom.setColumns(10);
		txtMatiasloveragmailcom.setBounds(241, 177, 462, 20);
		panel.add(txtMatiasloveragmailcom);
		
		JLabel lblNewLabel_4_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(88, 228, 155, 14);
		panel.add(lblNewLabel_4_1);
		
		textField_1 = new JTextField();
		textField_1.setText("***************");
		textField_1.setColumns(10);
		textField_1.setBounds(241, 228, 141, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Confirmar contrase\u00F1a");
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4_1_1.setBounds(409, 229, 155, 14);
		panel.add(lblNewLabel_4_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText("***************");
		textField_2.setColumns(10);
		textField_2.setBounds(562, 226, 141, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Tipo de inmueble");
		lblNewLabel_3_2_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2_2.setBounds(88, 291, 141, 20);
		panel.add(lblNewLabel_3_2_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"               QUINTA"}));
		comboBox.setBounds(241, 291, 141, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("Localidad");
		lblNewLabel_3_2_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2_2_1.setBounds(409, 290, 141, 20);
		panel.add(lblNewLabel_3_2_2_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"       ARROYO LEYES"}));
		comboBox_1.setBounds(562, 291, 141, 22);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_3_2_2_2 = new JLabel("Barrio");
		lblNewLabel_3_2_2_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2_2_2.setBounds(88, 358, 141, 20);
		panel.add(lblNewLabel_3_2_2_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(241, 358, 141, 22);
		panel.add(comboBox_2);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(482, 567, 89, 23);
		add(btnCancelar);
		
	
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(296, 567, 89, 23);
		add(btnGuardar);
		btnGuardar.addActionListener(
			l -> {
				String nombre = this.textNombre.getText();
				String apellido = this.textApellido.getText();
				String telefono = this.textTelefono.getText();
				Integer dni = Integer.valueOf(this.textDNI.getText());
				String correo = this.txtMatiasloveragmailcom.getText();
				String contra = this.textField_1.getText();
				String confContra = this.textField_2.getText();
				Double minimo = Double.valueOf(this.textMinimo.getText());
				Double maximo = Double.valueOf(this.textMaximo.getText());

				Cliente cliente = new Cliente(nombre, apellido, telefono, dni, minimo, maximo,correo,contra,confContra);
				if(gestorCliente.validarCampos(cliente).equals(false)) {
					gestorCliente.crearCliente(cliente);
				}
				
			});
		btnCancelar.addActionListener(l -> {
			login.setTitle("Inicio cliente");
			login.setContentPane(new PanelInicioCliente(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		
	}
}
