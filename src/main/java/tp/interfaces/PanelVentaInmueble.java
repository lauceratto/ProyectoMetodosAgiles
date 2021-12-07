package tp.interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class PanelVentaInmueble extends JPanel {

	private JPanel frameCompra;
	public PanelVentaInmueble(LoginCliente login) {
		setLayout(null);
////		setTitle("Comprobante de venta");
////		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 764, 502);
//		frameCompra = new JPanel();
//		frameCompra.setBorder(new EmptyBorder(5, 5, 5, 5));
////		setContentPane(frameCompra);
//		add(frameCompra);
//		frameCompra.setLayout(null);
//		
		JPanel panelCliente = new JPanel();
		panelCliente.setBackground(Color.WHITE);
		panelCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del cliente: ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCliente.setBounds(10, 11, 711, 129);
		add(panelCliente);
		panelCliente.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:       Alfonso");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(30, 33, 130, 14);
		panelCliente.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:       Perez");
		lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido.setBounds(445, 33, 130, 14);
		panelCliente.add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI:       23897657");
		lblDni.setHorizontalAlignment(SwingConstants.CENTER);
		lblDni.setBounds(30, 82, 130, 14);
		panelCliente.add(lblDni);
		
		JLabel lblTelefono = new JLabel("Telefono:       342-5789567");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setBounds(234, 82, 149, 14);
		panelCliente.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email:       alfonsoperez@gmail.com");
		lblEmail.setBounds(453, 82, 230, 14);
		panelCliente.add(lblEmail);
		
//		panelCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del cliente: ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
//		panelCliente.setBounds(10, 11, 711, 129);
//		add(panelCliente);
//		panelCliente.setLayout(null);
		
		JLabel lblSegNombre = new JLabel("Segundo nombre:       Javier");
		lblSegNombre.setBackground(Color.WHITE);
		lblSegNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegNombre.setBounds(225, 33, 170, 14);
		panelCliente.add(lblSegNombre);
		
		JPanel panelInmueble = new JPanel();
		panelInmueble.setBackground(Color.WHITE);
		panelInmueble.setBorder(new TitledBorder(null, "Datos del inmueble:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInmueble.setBounds(10, 164, 711, 260);
		add(panelInmueble);
		panelInmueble.setLayout(null);
		
		JLabel lblLocalidad = new JLabel("Localidad:       Santa Fe");
		lblLocalidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblLocalidad.setBounds(170, 30, 140, 14);
		panelInmueble.add(lblLocalidad);
		
		JLabel lblProvincia = new JLabel("Provincia:       Santa Fe");
		lblProvincia.setHorizontalAlignment(SwingConstants.CENTER);
		lblProvincia.setBounds(20, 30, 140, 14);
		panelInmueble.add(lblProvincia);
		
		JLabel lblCalle = new JLabel("Calle:       9 de Julio");
		lblCalle.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalle.setBounds(320, 30, 115, 14);
		panelInmueble.add(lblCalle);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:       2300");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setBounds(445, 30, 100, 14);
		panelInmueble.add(lblNumero);
		
		JLabel lblPiso = new JLabel("Piso/Depto:       3");
		lblPiso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiso.setBounds(566, 30, 100, 14);
		panelInmueble.add(lblPiso);
		
		JLabel lblBarrio = new JLabel("Barrio:   Centro    ");
		lblBarrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarrio.setBounds(20, 71, 140, 14);
		panelInmueble.add(lblBarrio);
		
		JLabel lblTipo = new JLabel("Tipo de inmueble:       Casa");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setBounds(170, 71, 140, 14);
		panelInmueble.add(lblTipo);
		
		JLabel lblPrecio = new JLabel("Precio:       $5.000.000");
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setBounds(350, 71, 115, 14);
		panelInmueble.add(lblPrecio);
		
		JLabel lblOrientacion = new JLabel("Orientaci\u00F3n:       Norte");
		lblOrientacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrientacion.setBounds(504, 71, 140, 14);
		panelInmueble.add(lblOrientacion);
		
		JLabel lblFrente = new JLabel("Longitud del frente:       30mts");
		lblFrente.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrente.setBounds(77, 113, 162, 14);
		panelInmueble.add(lblFrente);
		
		JLabel lblFondo = new JLabel("Longitud de fondo:       30mts");
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setBounds(269, 113, 162, 14);
		panelInmueble.add(lblFondo);
		
		JLabel lblSuperficie = new JLabel("Superficie:       900m2");
		lblSuperficie.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuperficie.setBounds(449, 113, 140, 14);
		panelInmueble.add(lblSuperficie);
		
		JLabel lblAntiguedad = new JLabel("Antig\u00FCedad:       1 a\u00F1o");
		lblAntiguedad.setHorizontalAlignment(SwingConstants.CENTER);
		lblAntiguedad.setBounds(87, 155, 162, 14);
		panelInmueble.add(lblAntiguedad);
		
		JLabel lblDormitorios = new JLabel("Dormitorios:       3");
		lblDormitorios.setHorizontalAlignment(SwingConstants.CENTER);
		lblDormitorios.setBounds(269, 155, 166, 14);
		panelInmueble.add(lblDormitorios);
		
		JLabel lblBanio = new JLabel("Ba\u00F1os:       2");
		lblBanio.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanio.setBounds(450, 155, 139, 14);
		panelInmueble.add(lblBanio);
		
		JCheckBox checkPropiedadHorizontal = new JCheckBox("Propiedad Horizontal");
		checkPropiedadHorizontal.setBackground(Color.WHITE);
		checkPropiedadHorizontal.setHorizontalAlignment(SwingConstants.CENTER);
		checkPropiedadHorizontal.setBounds(59, 192, 134, 23);
		panelInmueble.add(checkPropiedadHorizontal);
		
		JCheckBox checkGaraje = new JCheckBox("Cochera");
		checkGaraje.setSelected(true);
		checkGaraje.setHorizontalAlignment(SwingConstants.CENTER);
		checkGaraje.setBackground(Color.WHITE);
		checkGaraje.setBounds(213, 192, 97, 23);
		panelInmueble.add(checkGaraje);
		
		JCheckBox checkPiscina = new JCheckBox("Piscina");
		checkPiscina.setSelected(true);
		checkPiscina.setBackground(Color.WHITE);
		checkPiscina.setHorizontalAlignment(SwingConstants.CENTER);
		checkPiscina.setBounds(312, 192, 97, 23);
		panelInmueble.add(checkPiscina);
		
		JCheckBox checkLavadero = new JCheckBox("Lavadero");
		checkLavadero.setHorizontalAlignment(SwingConstants.CENTER);
		checkLavadero.setBackground(Color.WHITE);
		checkLavadero.setSelected(true);
		checkLavadero.setBounds(424, 192, 97, 23);
		panelInmueble.add(checkLavadero);
		
		JCheckBox checkAgua = new JCheckBox("Agua corriente");
		checkAgua.setHorizontalAlignment(SwingConstants.CENTER);
		checkAgua.setBackground(Color.WHITE);
		checkAgua.setBounds(59, 218, 105, 23);
		panelInmueble.add(checkAgua);
		
		JCheckBox checkPatio = new JCheckBox("Patio");
		checkPatio.setSelected(true);
		checkPatio.setHorizontalAlignment(SwingConstants.CENTER);
		checkPatio.setBackground(Color.WHITE);
		checkPatio.setBounds(424, 218, 75, 23);
		panelInmueble.add(checkPatio);
		
		JCheckBox checkCloacas = new JCheckBox("Cloacas");
		checkCloacas.setSelected(true);
		checkCloacas.setHorizontalAlignment(SwingConstants.CENTER);
		checkCloacas.setBackground(Color.WHITE);
		checkCloacas.setBounds(213, 218, 97, 23);
		panelInmueble.add(checkCloacas);
		
		JCheckBox checkGas = new JCheckBox("Gas natural");
		checkGas.setSelected(true);
		checkGas.setHorizontalAlignment(SwingConstants.CENTER);
		checkGas.setBackground(Color.WHITE);
		checkGas.setBounds(309, 218, 122, 23);
		panelInmueble.add(checkGas);
		
		JCheckBox checkTelefono = new JCheckBox("Tel\u00E9fono");
		checkTelefono.setBackground(Color.WHITE);
		checkTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		checkTelefono.setBounds(547, 192, 97, 23);
		panelInmueble.add(checkTelefono);
		
		JCheckBox checkPavimento = new JCheckBox("Pavimento");
		checkPavimento.setSelected(true);
		checkPavimento.setHorizontalAlignment(SwingConstants.CENTER);
		checkPavimento.setBackground(Color.WHITE);
		checkPavimento.setBounds(547, 218, 105, 23);
		panelInmueble.add(checkPavimento);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog( null, "¿Desea imprimir el documento?", "Mensaje", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "El documento ha sido impreso con exito.");	
					System.exit(WIDTH);
				}
			}
		});
		btnImprimir.setBounds(502, 429, 89, 23);
		add(btnImprimir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(612, 429, 89, 23);
		add(btnCancelar);
		
	}

}
