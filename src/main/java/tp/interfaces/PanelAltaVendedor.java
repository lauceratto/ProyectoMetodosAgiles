package tp.interfaces;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import tp.App.AppVendedor;
import tp.dominio.Vendedor;
import tp.gestores.GestorVendedor;

import javax.swing.JButton;

public class PanelAltaVendedor extends JPanel {
	private JTextField textNombre;
	private JTextField textDNI;
	private JTextField textCorreo;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textCalle;
	private JTextField textNro;
	private JTextField textDpto;
	private JTextField textPiso;
	private JTextField textContra;
	private JTextField textContraConf;
	private GestorVendedor gestorVendedor = new GestorVendedor();

	
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
		
		textNombre = new JTextField();
		textNombre.setBounds(186, 55, 201, 20);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		textDNI = new JTextField();
		textDNI.setBounds(186, 126, 201, 20);
		panel.add(textDNI);
		textDNI.setColumns(10);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(186, 192, 520, 20);
		panel.add(textCorreo);
		textCorreo.setColumns(10);
		
		JLabel lblNewLabel1 = new JLabel("Apellido (*)");
		lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel1.setBounds(406, 53, 91, 23);
		panel.add(lblNewLabel1);
		
		textApellido = new JTextField();
		textApellido.setBounds(507, 55, 201, 20);
		panel.add(textApellido);
		textApellido.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(507, 126, 201, 20);
		panel.add(textTelefono);
		textTelefono.setColumns(10);
		
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
		
		textCalle = new JTextField();
		textCalle.setBounds(82, 45, 188, 20);
		panel_1.add(textCalle);
		textCalle.setColumns(10);
		
		textNro = new JTextField();
		textNro.setBounds(329, 45, 72, 20);
		panel_1.add(textNro);
		textNro.setColumns(10);
		
		textDpto = new JTextField();
		textDpto.setColumns(10);
		textDpto.setBounds(450, 45, 86, 20);
		panel_1.add(textDpto);
		
		textPiso = new JTextField();
		textPiso.setColumns(10);
		textPiso.setBounds(586, 45, 86, 20);
		panel_1.add(textPiso);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a (*)");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(41, 249, 132, 14);
		panel.add(lblNewLabel);
		
		textContra = new JTextField();
		textContra.setBounds(186, 247, 171, 20);
		panel.add(textContra);
		textContra.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Confirmar contrase\u00F1a (*)");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(367, 249, 165, 14);
		panel.add(lblNewLabel_1);
		
		textContraConf = new JTextField();
		textContraConf.setColumns(10);
		textContraConf.setBounds(542, 247, 171, 20);
		panel.add(textContraConf);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBounds(488, 513, 89, 23);
		btnGuardar.addActionListener(l -> {
			String nombre = this.textNombre.getText();
			Integer dni = Integer.valueOf(this.textDNI.getText());
			String correo = this.textCorreo.getText();
			String apellido = this.textApellido.getText();
			String telefono = this.textTelefono.getText();
			String calle = this.textCalle.getText();
			Integer nro =  Integer.valueOf(this.textNro.getText());
			String dpto = this.textDpto.getText();
			String piso = this.textPiso.getText();
			String contra = this.textContra.getText();
			String confContra = this.textContraConf.getText();
			
			Vendedor vendedor = new Vendedor(nombre, apellido, correo, dni, telefono, calle, nro, dpto, piso, contra, confContra);
			if(gestorVendedor.validarCampos(vendedor).equals(false)) {
				gestorVendedor.crearVendedor(vendedor);
			}
			
		});
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(613, 513, 89, 23);
		btnCancelar.addActionListener(l -> {
			login.setVisible(false);
			login.setMinimumSize(new Dimension(300, 350));
			login.setLocation(600, 200);
			login.setContentPane(new AppVendedor());
			login.pack();
			login.revalidate();
			login.repaint();
		});
		add(btnCancelar);
		
	

	}
}
