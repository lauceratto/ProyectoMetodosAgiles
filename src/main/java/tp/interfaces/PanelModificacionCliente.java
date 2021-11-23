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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelModificacionCliente extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField textMatiasNombre;
	private JTextField textMatiasApellido;
	private JTextField textMatiasTelefono;
	private JTextField textMatiasDNI;
	private JTextField textMatiasMinimo;
	private JTextField textMatiasMaximo;
	private GestorCliente gestorCliente = new GestorCliente();
	
	public PanelModificacionCliente() {
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(new Rectangle(71, 60, 750, 451));
		panel.setBorder(new TitledBorder(null, "Modificación Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(70, 62, 750, 437);
		add(panel);
		panel.setLayout(null);
		
		textMatiasNombre = new JTextField();
		textMatiasNombre.setBounds(241, 54, 141, 20);
		textMatiasNombre.setColumns(10);
		textMatiasNombre.setText("MATIAS");
		panel.add(textMatiasNombre);
		
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
		
		textMatiasApellido = new JTextField();
		textMatiasApellido.setColumns(10);
		textMatiasApellido.setBounds(241, 113, 141, 20);
		textMatiasApellido.setText("Perez");
		panel.add(textMatiasApellido);
		
		textMatiasTelefono = new JTextField();
		textMatiasTelefono.setColumns(10);
		textMatiasTelefono.setBounds(562, 55, 141, 20);
		textMatiasTelefono.setText("4550465");
		panel.add(textMatiasTelefono);
		
		textMatiasDNI = new JTextField();
		textMatiasDNI.setColumns(10);
		textMatiasDNI.setBounds(562, 114, 141, 20);
		textMatiasDNI.setText("15024963");
		panel.add(textMatiasDNI);
		
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
		
		textMatiasMinimo = new JTextField();
		textMatiasMinimo.setColumns(10);
		textMatiasMinimo.setBounds(241, 246, 141, 20);
		textMatiasMinimo.setText("300000");
		panel.add(textMatiasMinimo);
		
		textMatiasMaximo = new JTextField();
		textMatiasMaximo.setColumns(10);
		textMatiasMaximo.setBounds(562, 246, 141, 20);
		textMatiasMaximo.setText("500000");
		panel.add(textMatiasMaximo);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("--------------------------------------------------------------------------");
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3_2_1.setBounds(177, 165, 387, 20);
		panel.add(lblNewLabel_3_2_1);
		
	
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(
			l -> {
				String nombre = this.textMatiasNombre.getText();
				String apellido = this.textMatiasApellido.getText();
				String telefono = this.textMatiasTelefono.getText();
				Integer dni = Integer.valueOf(this.textMatiasDNI.getText());
				Float minimo = Float.valueOf(this.textMatiasMinimo.getText());
				Float maximo = Float.valueOf(this.textMatiasMaximo.getText());
				
				Cliente cliente = new Cliente(nombre, apellido, telefono, dni, minimo, maximo);
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
}
