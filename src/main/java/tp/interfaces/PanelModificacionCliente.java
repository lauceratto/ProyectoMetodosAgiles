package tp.interfaces;

import java.awt.Color;
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

public class PanelModificacionCliente extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textDNI;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	private GestorCliente gestorCliente = new GestorCliente();
	private JTextField textField_4;
	private JTextField textField_5;
	
	public PanelModificacionCliente() {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(new Rectangle(71, 60, 750, 451));
		panel.setBorder(new TitledBorder(null, "Modificación Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(70, 62, 750, 437);
		add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(241, 54, 141, 20);
		panel.add(textField);
		textField.setColumns(10);
		
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
		
		JLabel lblNewLabel_3 = new JLabel("Mínimo: (*)");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(88, 245, 155, 20);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(241, 113, 141, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(562, 55, 141, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(562, 114, 141, 20);
		panel.add(textField_3);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(
			l -> {
				String nombre = this.textNombre.getText();
				String apellido = this.textApellido.getText();
				String telefono = this.textTelefono.getText();
				Integer dni = Integer.valueOf(this.textDNI.getText());
			//	Float minimo = Float.valueOf(this..getText());
				//Float maximo = Float.valueOf(this.t.getText());
				
		//		Cliente cliente = new Cliente(nombre, apellido, telefono, dni, minimo, maximo);
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
		
		JLabel lblNewLabel_3_1 = new JLabel("DNI (*)");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(409, 112, 155, 20);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Máximo (*)");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(409, 245, 155, 20);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Presupuesto de inmueble");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(88, 200, 199, 20);
		panel.add(lblNewLabel_3_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(241, 246, 141, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(562, 246, 141, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("--------------------------------------------------------------------------");
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2_1.setBounds(177, 165, 387, 20);
		panel.add(lblNewLabel_3_2_1);
		
	
	}
}
