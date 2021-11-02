package tp.interfaces;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JButton;

public class PanelAltaPropietario extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField textCalle;
	private JTextField txtNumero;
	private JTextField txtDepartamento;
	private JTextField txtPiso;
	private JTextField txtEmail;
	private JTextField txtTelefono;

	public PanelAltaPropietario() {
		setLayout(null);
		
		JPanel panelAltaPropietario = new JPanel();
		panelAltaPropietario.setBorder(new TitledBorder(null, "Alta Propietario", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelAltaPropietario.setBounds(71, 60, 750, 437);
		add(panelAltaPropietario);
		panelAltaPropietario.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombre.setBounds(40, 37, 46, 14);
		panelAltaPropietario.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(96, 34, 200, 20);
		panelAltaPropietario.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(400, 37, 46, 14);
		panelAltaPropietario.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(456, 34, 200, 20);
		panelAltaPropietario.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(40, 82, 28, 14);
		panelAltaPropietario.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(96, 79, 200, 20);
		panelAltaPropietario.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblEmail = new JLabel("Correo Electr\u00F3nico:");
		lblEmail.setBounds(40, 127, 100, 14);
		panelAltaPropietario.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(150, 124, 296, 20);
		panelAltaPropietario.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setBounds(40, 172, 46, 14);
		panelAltaPropietario.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(96, 169, 86, 20);
		panelAltaPropietario.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JPanel panelDireccion = new JPanel();
		panelDireccion.setBorder(new TitledBorder(null, "Dirección", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelDireccion.setBounds(40, 206, 616, 101);
		panelAltaPropietario.add(panelDireccion);
		panelDireccion.setLayout(null);
		
		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setBounds(38, 30, 46, 14);
		panelDireccion.add(lblCalle);
		
		textCalle = new JTextField();
		textCalle.setBounds(94, 27, 158, 20);
		panelDireccion.add(textCalle);
		textCalle.setColumns(10);
		
		JLabel lblNumeroCalle = new JLabel("N\u00FAmero:");
		lblNumeroCalle.setBounds(306, 30, 46, 14);
		panelDireccion.add(lblNumeroCalle);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(362, 27, 158, 20);
		panelDireccion.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblDepto = new JLabel("Departamento:");
		lblDepto.setBounds(38, 65, 91, 14);
		panelDireccion.add(lblDepto);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setBounds(139, 62, 113, 20);
		panelDireccion.add(txtDepartamento);
		txtDepartamento.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso:");
		lblPiso.setBounds(306, 65, 46, 14);
		panelDireccion.add(lblPiso);
		
		txtPiso = new JTextField();
		txtPiso.setBounds(362, 62, 158, 20);
		panelDireccion.add(txtPiso);
		txtPiso.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(732, 541, 89, 23);
		add(btnGuardar);
		
	}
}
