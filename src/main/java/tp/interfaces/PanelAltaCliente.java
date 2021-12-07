package tp.interfaces;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import tp.dominio.Cliente;
import tp.dominio.Inmueble;
import tp.gestores.GestorCliente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;


public class PanelAltaCliente extends JPanel{
	/**
	 * 
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
	private JTextField textField;
	private JTextField textCorreo;
	private JTextField textContra;
	private JTextField textContra1;
	
	
	
	public PanelAltaCliente(LoginCliente log) {
		
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(new Rectangle(71, 60, 750, 451));
		panel.setBorder(new TitledBorder(null, "Alta Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(62, 49, 750, 403);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre *");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(88, 52, 91, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido *");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(88, 112, 155, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono *");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(409, 54, 155, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mínimo: (*)");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(88, 339, 155, 20);
		panel.add(lblNewLabel_3);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(241, 113, 141, 20);
		panel.add(textApellido);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(562, 55, 141, 20);
		
		panel.add(textTelefono);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(562, 114, 141, 20);
		panel.add(textDNI);
		
		JLabel lblNewLabel_3_1 = new JLabel("DNI *");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(409, 112, 155, 20);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Máximo (*)");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(409, 339, 155, 20);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Presupuesto de inmueble");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(88, 308, 199, 20);
		panel.add(lblNewLabel_3_2);
		
		textMinimo = new JTextField();
		textMinimo.setColumns(10);
		textMinimo.setBounds(241, 340, 141, 20);
		panel.add(textMinimo);
		
		textMaximo = new JTextField();
		textMaximo.setColumns(10);
		textMaximo.setBounds(562, 340, 141, 20);
		panel.add(textMaximo);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("----------------------------------------------------------------------------");
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2_1.setBounds(177, 277, 387, 20);
		panel.add(lblNewLabel_3_2_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(241, 54, 141, 20);
		panel.add(textField);
		
		JLabel lblNewLabel_4 = new JLabel("Correo Electronico");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(88, 180, 155, 14);
		panel.add(lblNewLabel_4);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(241, 178, 462, 20);
		panel.add(textCorreo);
		
		JLabel lblNewLabel_4_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(88, 229, 155, 14);
		panel.add(lblNewLabel_4_1);
		
		textContra = new JTextField();
		textContra.setColumns(10);
		textContra.setBounds(241, 229, 141, 20);
		panel.add(textContra);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Confirmar contrase\u00F1a");
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4_1_1.setBounds(409, 230, 155, 14);
		panel.add(lblNewLabel_4_1_1);
		
		textContra1 = new JTextField();
		textContra1.setColumns(10);
		textContra1.setBounds(562, 227, 141, 20);
		panel.add(textContra1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(484, 498, 89, 23);
		add(btnCancelar);
		
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(296, 498, 89, 23);
		add(btnGuardar);
		btnGuardar.addActionListener(
			l -> {
				String nombre = this.textNombre.getText();
				String apellido = this.textApellido.getText();
				String telefono = this.textTelefono.getText();
				Integer dni = Integer.valueOf(this.textDNI.getText());
				String correo = this.textCorreo.getText();
				String contra = this.textContra.getText();
				String confContra = this.textContra1.getText();
				Double minimo = Double.valueOf(this.textMinimo.getText());
				Double maximo = Double.valueOf(this.textMaximo.getText());

				Cliente cliente = new Cliente(nombre, apellido, telefono, dni, minimo, maximo,correo,contra,confContra);

	//			Se deja para la siguiente iteraciÃ³n
		//		Cliente cliente = new Cliente(nombre, apellido, telefono, dni, montoMinimo, montoMaximo);

	//			Cliente cliente = new Cliente(nombre, apellido, telefono, dni, inmueble, montoMinimo, montoMaximo);
				
				if(gestorCliente.validarCampos(cliente).equals(false)) {
					gestorCliente.crearCliente(cliente);
				}
				
			});
		btnCancelar.addActionListener(l -> {

		});
		
		
		
	}
	
	public Rectangle getPanelBounds() {
		return panel.getBounds();
	}
	public void setPanelBounds(Rectangle bounds) {
		panel.setBounds(bounds);
	}
}
