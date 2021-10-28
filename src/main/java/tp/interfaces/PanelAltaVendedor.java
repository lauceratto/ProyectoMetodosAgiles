package tp.interfaces;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import javax.swing.JButton;

public class PanelAltaVendedor extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	
	public PanelAltaVendedor(Login login) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Alta Vendedor", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(71, 60, 750, 437);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel2 = new JLabel("Nombre (*)");
		lblNewLabel2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel2.setBounds(41, 53, 91, 23);
		panel.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Correo electronico (*)");
		lblNewLabel3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel3.setBounds(41, 190, 148, 23);
		panel.add(lblNewLabel3);
		
		JLabel lblNewLabe4 = new JLabel("Tel\u00E9fono (*)");
		lblNewLabe4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabe4.setBounds(406, 124, 91, 23);
		panel.add(lblNewLabe4);
		
		JLabel lblNewLabe5 = new JLabel("DNI (*)");
		lblNewLabe5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabe5.setBounds(41, 124, 91, 23);
		panel.add(lblNewLabe5);
		
		textField = new JTextField();
		textField.setBounds(186, 55, 201, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 126, 201, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 192, 520, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel1 = new JLabel("Apellido (*)");
		lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel1.setBounds(406, 53, 91, 23);
		panel.add(lblNewLabel1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(507, 55, 201, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(507, 126, 201, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Direcci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(24, 301, 696, 126);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabelDir = new JLabel("Calle (*)");
		lblNewLabelDir.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabelDir.setBounds(32, 48, 50, 14);
		panel_1.add(lblNewLabelDir);
		
		JLabel lblNro = new JLabel("Nro. (*)");
		lblNro.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNro.setBounds(280, 48, 50, 14);
		panel_1.add(lblNro);
		
		JLabel lblDpto = new JLabel("Dpto.");
		lblDpto.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDpto.setBounds(411, 48, 29, 14);
		panel_1.add(lblDpto);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPiso.setBounds(551, 48, 25, 14);
		panel_1.add(lblPiso);
		
		textField_5 = new JTextField();
		textField_5.setBounds(82, 45, 188, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(329, 45, 72, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(450, 45, 86, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(586, 45, 86, 20);
		panel_1.add(textField_8);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a (*)");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(41, 249, 132, 14);
		panel.add(lblNewLabel);
		
		textField_9 = new JTextField();
		textField_9.setBounds(186, 247, 171, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Confirmar contrase\u00F1a (*)");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(367, 249, 165, 14);
		panel.add(lblNewLabel_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(542, 247, 171, 20);
		panel.add(textField_10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBounds(488, 513, 89, 23);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(613, 513, 89, 23);
		btnCancelar.addActionListener(l -> {
		
		});
		add(btnCancelar);
		
	

	}
}
