package tp.interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import tp.App.AppVendedor;
import tp.dominio.Vendedor;
import tp.gestores.GestorVendedor;

import javax.swing.SwingConstants;

public class PanelModificacionVendedor extends JPanel {
	private JTextField txtNombre;
	private JTextField textDni;
	private JTextField txtCorreo;
	private JTextField txtApellido;
	private JTextField textTelefono;
	private JTextField txtCalle;
	private JTextField textNro;
	private JTextField textDpto;
	private JTextField textPiso;
	private JTextField textContra;
	private JTextField textConfContra;
	private GestorVendedor gestorVendedor = new GestorVendedor();
	
	public PanelModificacionVendedor(Login login) {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Modificación Vendedor", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(71, 60, 750, 437);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel2 = new JLabel("Nombre");
		lblNewLabel2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel2.setBounds(41, 53, 91, 23);
		panel.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Correo electronico");
		lblNewLabel3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel3.setBounds(41, 190, 148, 23);
		panel.add(lblNewLabel3);
		
		JLabel lblNewLabe4 = new JLabel("Tel\u00E9fono");
		lblNewLabe4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabe4.setBounds(406, 124, 91, 23);
		panel.add(lblNewLabe4);
		
		JLabel lblNewLabe5 = new JLabel("DNI");
		lblNewLabe5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabe5.setBounds(41, 124, 91, 23);
		panel.add(lblNewLabe5);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.BOLD, 14));
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setText("PEDRO");
		txtNombre.setBounds(186, 55, 201, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		textDni = new JTextField();
		textDni.setEnabled(false);
		textDni.setText("20384245");
		textDni.setFont(new Font("Arial", Font.BOLD, 14));
		textDni.setHorizontalAlignment(SwingConstants.CENTER);
		textDni.setBounds(186, 126, 201, 20);
		panel.add(textDni);
		textDni.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("PEDROP23@GMAIL.COM");
		txtCorreo.setFont(new Font("Arial", Font.BOLD, 14));
		txtCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorreo.setBounds(186, 192, 520, 20);
		panel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNewLabel1 = new JLabel("Apellido");
		lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel1.setBounds(406, 53, 91, 23);
		panel.add(lblNewLabel1);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Arial", Font.BOLD, 14));
		txtApellido.setText("PINTOS");
		txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellido.setBounds(507, 55, 201, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setText("3425201852");
		textTelefono.setFont(new Font("Arial", Font.BOLD, 14));
		textTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		textTelefono.setBounds(507, 126, 201, 20);
		panel.add(textTelefono);
		textTelefono.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Direcci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(24, 301, 696, 126);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabelDir = new JLabel("Calle");
		lblNewLabelDir.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabelDir.setBounds(32, 48, 50, 14);
		panel_1.add(lblNewLabelDir);
		
		JLabel lblNro = new JLabel("Nro.");
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
		
		txtCalle = new JTextField();
		txtCalle.setText("SAAVEDRA");
		txtCalle.setFont(new Font("Arial", Font.BOLD, 14));
		txtCalle.setHorizontalAlignment(SwingConstants.CENTER);
		txtCalle.setBounds(82, 45, 188, 20);
		panel_1.add(txtCalle);
		txtCalle.setColumns(10);
		
		textNro = new JTextField();
		textNro.setText("2075");
		textNro.setFont(new Font("Arial", Font.BOLD, 14));
		textNro.setHorizontalAlignment(SwingConstants.CENTER);
		textNro.setBounds(329, 45, 72, 20);
		panel_1.add(textNro);
		textNro.setColumns(10);
		
		textDpto = new JTextField();
		textDpto.setHorizontalAlignment(SwingConstants.CENTER);
		textDpto.setColumns(10);
		textDpto.setBounds(450, 45, 86, 20);
		panel_1.add(textDpto);
		
		textPiso = new JTextField();
		textPiso.setHorizontalAlignment(SwingConstants.CENTER);
		textPiso.setColumns(10);
		textPiso.setBounds(586, 45, 86, 20);
		panel_1.add(textPiso);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(41, 249, 132, 14);
		panel.add(lblNewLabel);
		
		textContra = new JTextField();
		textContra.setFont(new Font("Arial", Font.BOLD, 14));
		textContra.setText("***************");
		textContra.setHorizontalAlignment(SwingConstants.CENTER);
		textContra.setBounds(186, 247, 171, 20);
		panel.add(textContra);
		textContra.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Confirmar contrase\u00F1a");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(367, 249, 165, 14);
		panel.add(lblNewLabel_1);
		
		textConfContra = new JTextField();
		textConfContra.setFont(new Font("Arial", Font.BOLD, 14));
		textConfContra.setText("***************");
		textConfContra.setHorizontalAlignment(SwingConstants.CENTER);
		textConfContra.setColumns(10);
		textConfContra.setBounds(542, 247, 171, 20);
		panel.add(textConfContra);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBounds(488, 513, 89, 23);
		btnGuardar.addActionListener(l -> {
			String nombre = this.txtNombre.getText();
			Integer dni = Integer.valueOf(this.textDni.getText());
			String correo = this.txtCorreo.getText();
			String apellido = this.txtApellido.getText();
			String telefono = this.textTelefono.getText();
			String calle = this.txtCalle.getText();
			Integer nro =  Integer.valueOf(this.textNro.getText());
			String dpto = this.textDpto.getText();
			String piso = this.textPiso.getText();
			String contra = this.textContra.getText();
			String confContra = this.textConfContra.getText();
			
			Vendedor vendedor = new Vendedor(nombre, apellido, correo, dni, telefono, calle, nro, dpto, piso, contra, confContra);
			
			gestorVendedor.actualizarEstacion(vendedor);
			
			JOptionPane.showMessageDialog(null, "Sus datos fueron actualizados con exito!");
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Inicio vendedor");
			login.setContentPane(new PanelInicioVendedor(login));
			login.pack();
			login.revalidate();
			login.repaint();
			
		});
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(613, 513, 89, 23);
		btnCancelar.addActionListener(l -> {	
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Inicio vendedor");
			login.setContentPane(new PanelInicioVendedor(login));
			login.pack();
			login.revalidate();
			login.repaint();
		
		});
		add(btnCancelar);
		
	}

}
