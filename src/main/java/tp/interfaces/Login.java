package tp.interfaces;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import javax.swing.JButton;


public class Login extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtCorreoElectronico;
	private JTextField textField_2;

	public Login() {
		
		armarLogin();
	}
	public void armarLogin() {
		setMinimumSize(new Dimension(300, 350));
		setLocation(600, 200);
		setTitle("Login Vendedor");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PanelInicioVendedor.class.getResource("/tp/icons/Icon.png")));
	
		getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(30, 48, 46, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(30, 73, 206, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(30, 110, 97, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(30, 133, 206, 20);
		getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setBounds(92, 172, 89, 23);
		btnNewButton.addActionListener(e -> {
			this.setMinimumSize(new Dimension(670, 340));
			this.setLocation(300, 70);
			this.setTitle("Inicio vendedor");
			this.setContentPane(new PanelInicioVendedor(this));
			this.pack();
			this.revalidate();
			this.repaint();
			
		});
		getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Registrarse");
		btnCancelar.setBounds(81, 254, 115, 23);
		btnCancelar.addActionListener(l -> {
			this.setMinimumSize(new Dimension(900, 620));
			this.setLocation(300, 70);
			this.setTitle("Alta vendedor");
			this.setContentPane(new PanelAltaVendedor(this));
			this.pack();
			this.revalidate();
			this.repaint();
		
		});
		
		getContentPane().add(btnCancelar);
		
		
	}
}
