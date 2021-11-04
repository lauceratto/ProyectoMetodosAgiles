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

public class PanelAltaCliente extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textDNI;

	
	private GestorCliente gestorCliente = new GestorCliente();
	
	public PanelAltaCliente(Inmueble inmueble, Float montoMinimo, Float montoMaximo) {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(new Rectangle(71, 60, 750, 451));
		panel.setBorder(new TitledBorder(null, "Alta Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(71, 60, 750, 437);
		add(panel);
		panel.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(392, 76, 141, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre (*)");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(203, 74, 91, 23);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido (*)");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(203, 141, 155, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono (*)");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(203, 201, 155, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DNI (*)");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(203, 267, 155, 20);
		panel.add(lblNewLabel_3);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(392, 141, 141, 20);
		panel.add(textApellido);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(392, 201, 141, 20);
		panel.add(textTelefono);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(392, 267, 141, 20);
		panel.add(textDNI);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(
			l -> {
				String nombre = this.textNombre.getText();
				String apellido = this.textApellido.getText();
				String telefono = this.textTelefono.getText();
				Integer dni = Integer.valueOf(this.textDNI.getText());
	//			Se deja para la siguiente iteración
				Cliente cliente = new Cliente(nombre, apellido, telefono, dni, montoMinimo, montoMaximo);
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
		
		
		
	}
	
	public Rectangle getPanelBounds() {
		return panel.getBounds();
	}
	public void setPanelBounds(Rectangle bounds) {
		panel.setBounds(bounds);
	}
}
