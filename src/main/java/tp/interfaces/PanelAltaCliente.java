package tp.interfaces;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import tp.dominio.Cliente;
import tp.dominio.Inmueble;
import tp.gestores.GestorCliente;

import java.awt.Color;
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
	
	
	
	public PanelAltaCliente() {
		
		
		
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(new Rectangle(71, 60, 750, 451));
		panel.setBorder(new TitledBorder(null, "Alta Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(71, 60, 750, 437);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre (*)");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(88, 52, 91, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido (*)");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(88, 112, 155, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono (*)");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(409, 54, 155, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("M�nimo: (*)");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(88, 245, 155, 20);
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
		
		JLabel lblNewLabel_3_1 = new JLabel("DNI (*)");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(409, 112, 155, 20);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("M�ximo (*)");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(409, 245, 155, 20);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Presupuesto de inmueble");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(88, 200, 199, 20);
		panel.add(lblNewLabel_3_2);
		
		textMinimo = new JTextField();
		textMinimo.setColumns(10);
		textMinimo.setBounds(241, 246, 141, 20);
		panel.add(textMinimo);
		
		textMaximo = new JTextField();
		textMaximo.setColumns(10);
		textMaximo.setBounds(562, 246, 141, 20);
		panel.add(textMaximo);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("--------------------------------------------------------------------------");
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2_1.setBounds(177, 165, 387, 20);
		panel.add(lblNewLabel_3_2_1);
		
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(
			l -> {
				String nombre = this.textNombre.getText();
				String apellido = this.textApellido.getText();
				String telefono = this.textTelefono.getText();
				Integer dni = Integer.valueOf(this.textDNI.getText());

				Double minimo = Double.valueOf(this.textMinimo.getText());
				Double maximo = Double.valueOf(this.textMaximo.getText());

				Cliente cliente = new Cliente(nombre, apellido, telefono, dni, minimo, maximo);

	//			Se deja para la siguiente iteración
		//		Cliente cliente = new Cliente(nombre, apellido, telefono, dni, montoMinimo, montoMaximo);

	//			Cliente cliente = new Cliente(nombre, apellido, telefono, dni, inmueble, montoMinimo, montoMaximo);
				
				if(gestorCliente.validarCampos(cliente).equals(false)) {
					gestorCliente.crearCliente(cliente);
				}
				
			});
		btnGuardar.setBounds(409, 339, 89, 23);
		panel.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(234, 339, 89, 23);
		btnCancelar.addActionListener(l -> {
			panel.setVisible(false);
	//		panel.setContentPane(new PanelGenerarReserva());
	//		panel.pack();
			panel.revalidate();
			panel.repaint();
		});
		panel.add(btnCancelar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(241, 54, 141, 20);
		panel.add(textField);
		
		
		
	}
	
	public Rectangle getPanelBounds() {
		return panel.getBounds();
	}
	public void setPanelBounds(Rectangle bounds) {
		panel.setBounds(bounds);
	}
}
