package tp.interfaces;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import tp.dominio.Propietario;
import tp.gestores.GestorPropietario;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import java.awt.Dimension;

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
	private GestorPropietario gestorPropietario = new GestorPropietario();

	public PanelAltaPropietario(Login login) {
		setLayout(null);
		
		JPanel panelAltaPropietario = new JPanel();
		panelAltaPropietario.setBorder(new TitledBorder(null, "Alta Propietario", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelAltaPropietario.setBounds(51, 60, 770, 437);
		add(panelAltaPropietario);
		panelAltaPropietario.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNombre.setBounds(40, 37, 52, 14);
		panelAltaPropietario.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(102, 34, 200, 20);
		panelAltaPropietario.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(400, 37, 59, 14);
		panelAltaPropietario.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(469, 34, 200, 20);
		panelAltaPropietario.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(40, 82, 46, 14);
		panelAltaPropietario.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(102, 79, 200, 20);
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
		lblTelefono.setBounds(400, 82, 59, 14);
		panelAltaPropietario.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(469, 79, 200, 20);
		panelAltaPropietario.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JPanel panelDireccion = new JPanel();
		panelDireccion.setBorder(new TitledBorder(null, "Dirección", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelDireccion.setBounds(40, 200, 665, 173);
		panelAltaPropietario.add(panelDireccion);
		panelDireccion.setLayout(null);
		
		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setBounds(38, 93, 46, 14);
		panelDireccion.add(lblCalle);
		
		textCalle = new JTextField();
		textCalle.setBounds(111, 90, 162, 20);
		panelDireccion.add(textCalle);
		textCalle.setColumns(10);
		
		JLabel lblNumeroCalle = new JLabel("N\u00FAmero:");
		lblNumeroCalle.setBounds(306, 93, 64, 14);
		panelDireccion.add(lblNumeroCalle);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(380, 90, 227, 20);
		panelDireccion.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblDepto = new JLabel("Departamento:");
		lblDepto.setBounds(38, 137, 91, 14);
		panelDireccion.add(lblDepto);
		
		txtDepartamento = new JTextField();
		txtDepartamento.setBounds(139, 134, 134, 20);
		panelDireccion.add(txtDepartamento);
		txtDepartamento.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso:");
		lblPiso.setBounds(306, 137, 64, 14);
		panelDireccion.add(lblPiso);
		
		txtPiso = new JTextField();
		txtPiso.setBounds(380, 134, 227, 20);
		panelDireccion.add(txtPiso);
		txtPiso.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(38, 49, 63, 14);
		panelDireccion.add(lblProvincia);
		
		JComboBox comboProvincia = new JComboBox();
		comboProvincia.setModel(new DefaultComboBoxModel(new String[] {"Buenos Aires", "Capital Federal", "Catamarca", "Chaco", "Chubut", "C\u00F3rdoba", "Corrientes", "Entre R\u00EDos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuqu\u00E9n", "R\u00EDo Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucum\u00E1n"}));
		comboProvincia.setSelectedIndex(20);
		comboProvincia.setBounds(111, 45, 162, 22);
		panelDireccion.add(comboProvincia);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(306, 49, 64, 14);
		panelDireccion.add(lblLocalidad);
		
		JComboBox comboLocalidad = new JComboBox();
		comboLocalidad.setModel(new DefaultComboBoxModel(new String[] {"Santa Fe", "Santo Tom\u00E9", "Sauce Viejo", "Rinc\u00F3n", "Colastin\u00E9 Norte", "Colastin\u00E9 Sur"}));
		comboLocalidad.setBounds(380, 45, 227, 22);
		panelDireccion.add(comboLocalidad);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(txtDni.getText().equals("") || txtNumero.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Los campos obligatorios no pueden ser nulos");
				}
				else {
					String nombre = txtNombre.getText();
					String apellido = txtApellido.getText();
					Integer dni = Integer.valueOf(txtDni.getText());
					Integer numero = Integer.valueOf(txtNumero.getText());
					String email = txtEmail.getText();
					String telefono = txtTelefono.getText();
					String provincia = comboProvincia.getSelectedItem().toString();
					String localidad = comboProvincia.getSelectedItem().toString();
					String calle = textCalle.getText();
					String departamento = txtDepartamento.getText();
					String piso = txtPiso.getText();
					
					Propietario propietario = new Propietario(nombre, apellido, email, dni, telefono,
							calle, numero, departamento, piso, provincia,localidad);
					
					if(gestorPropietario.VerificacionCampos(propietario) == true) {
						gestorPropietario.altaPropietario(propietario);
						limpiarPanel();
						JOptionPane.showMessageDialog(null, "El propietario fue dado de alta correctamente");
					}
				}

				
			}

		});
		btnGuardar.setBounds(667, 497, 89, 23);
		add(btnGuardar);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(568, 497, 89, 23);
		btnAtras.addActionListener(l -> {	
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Inicio vendedor");
			login.setContentPane(new PanelInicioVendedor(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		add(btnAtras);
		
	}

	public void limpiarPanel() {
		this.txtNombre.setText("");
		this.txtApellido.setText("");
		this.txtDni.setText("");
		this.txtEmail.setText("");
		this.txtTelefono.setText("");
		this.textCalle.setText("");
		this.txtNumero.setText("");
		this.txtDepartamento.setText("");
		this.txtPiso.setText("");
	}
}
