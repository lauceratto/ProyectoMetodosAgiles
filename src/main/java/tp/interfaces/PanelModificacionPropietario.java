package tp.interfaces;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;

import tp.dominio.Propietario;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class PanelModificacionPropietario extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JTextField txtTelefono;
	private JTextField txtEmail;
	private JTextField txtCalle;
	private JTextField txtNumero;
	private JTextField txtDepartamento;
	private JTextField txtPiso;

	public PanelModificacionPropietario(Login login) {
		
		JPanel panelModificacionPropietario = new JPanel();
		panelModificacionPropietario.setBorder(new TitledBorder(null, "Modificación Propietario", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = JOptionPane.showConfirmDialog( null, "¿Desea modificar los datos del Propietario?", "Mensaje", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					//PREGUNTAR METODO ELIMINAR PROPIETARIO.
					JOptionPane.showMessageDialog(null, "El propietario fue modificado con exito!");
					login.setMinimumSize(new Dimension(670, 340));
					login.setLocation(300, 70);
					login.setTitle("Lista de propietarios");
					login.setContentPane(new PanelPropietarioLista(login));
					login.pack();
					login.revalidate();
					login.repaint();
				}
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(l -> {	
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Lista de propietarios");
			login.setContentPane(new PanelPropietarioLista(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCancelar)
							.addGap(18)
							.addComponent(btnGuardar))
						.addComponent(panelModificacionPropietario, GroupLayout.PREFERRED_SIZE, 663, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(panelModificacionPropietario, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGuardar)
						.addComponent(btnCancelar))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setText("Omar");
		
		JLabel lblApellido = new JLabel("Apellido:");
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setText("Varela");
		
		JLabel lblDni = new JLabel("DNI:");
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setText("12123123");
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setText("42563623");
		
		JLabel lblCorreo = new JLabel("Correo electr\u00F3nico:");
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setText("omarvarela@gmail.com");
		
		JPanel panelDireccion = new JPanel();
		panelDireccion.setBorder(new TitledBorder(null, "Dirección", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		GroupLayout gl_panelModificacionPropietario = new GroupLayout(panelModificacionPropietario);
		gl_panelModificacionPropietario.setHorizontalGroup(
			gl_panelModificacionPropietario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelModificacionPropietario.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_panelModificacionPropietario.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panelDireccion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panelModificacionPropietario.createSequentialGroup()
							.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtEmail))
						.addGroup(gl_panelModificacionPropietario.createSequentialGroup()
							.addGroup(gl_panelModificacionPropietario.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblDni, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelModificacionPropietario.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
								.addComponent(txtDni, Alignment.TRAILING))
							.addGap(36)
							.addGroup(gl_panelModificacionPropietario.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblApellido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblTelefono, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelModificacionPropietario.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtTelefono)
								.addComponent(txtApellido, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panelModificacionPropietario.setVerticalGroup(
			gl_panelModificacionPropietario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelModificacionPropietario.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_panelModificacionPropietario.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido)
						.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panelModificacionPropietario.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni)
						.addComponent(txtDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefono)
						.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panelModificacionPropietario.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCorreo)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelDireccion, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		
		JComboBox comboProvincia = new JComboBox();
		comboProvincia.setModel(new DefaultComboBoxModel(new String[] {"Buenos Aires", "Capital Federal", "Catamarca", "Chaco", "Chubut", "C\u00F3rdoba", "Corrientes", "Entre R\u00EDos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuqu\u00E9n", "R\u00EDo Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucum\u00E1n"}));
		comboProvincia.setSelectedIndex(20);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		
		JComboBox comboLocalidad = new JComboBox();
		comboLocalidad.setModel(new DefaultComboBoxModel(new String[] {"Santa Fe", "Santo Tom\u00E9", "Sauce Viejo", "Rinc\u00F3n", "Colastin\u00E9 Norte", "Colastin\u00E9 Sur"}));
		
		JLabel lblCalle = new JLabel("Calle:");
		
		txtCalle = new JTextField();
		txtCalle.setColumns(10);
		txtCalle.setText("Hernandarias");
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setText("412");
		
		JLabel lblDepartamento = new JLabel("Departamento:");
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		
		JLabel lblPiso = new JLabel("Piso:");
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		GroupLayout gl_panelDireccion = new GroupLayout(panelDireccion);
		gl_panelDireccion.setHorizontalGroup(
			gl_panelDireccion.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDireccion.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDireccion.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelDireccion.createSequentialGroup()
							.addComponent(lblDepartamento, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDepartamento))
						.addGroup(gl_panelDireccion.createSequentialGroup()
							.addGroup(gl_panelDireccion.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblCalle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblProvincia, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelDireccion.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtCalle)
								.addComponent(comboProvincia, 0, 183, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addGroup(gl_panelDireccion.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblPiso, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNumero, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblLocalidad, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelDireccion.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtPiso)
						.addComponent(txtNumero)
						.addComponent(comboLocalidad, 0, 215, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelDireccion.setVerticalGroup(
			gl_panelDireccion.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDireccion.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDireccion.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProvincia)
						.addComponent(comboProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLocalidad)
						.addComponent(comboLocalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panelDireccion.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCalle)
						.addComponent(txtCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumero)
						.addComponent(txtNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panelDireccion.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDepartamento)
						.addComponent(txtDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPiso)
						.addComponent(txtPiso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panelDireccion.setLayout(gl_panelDireccion);
		panelModificacionPropietario.setLayout(gl_panelModificacionPropietario);
		setLayout(groupLayout);

	}
}
