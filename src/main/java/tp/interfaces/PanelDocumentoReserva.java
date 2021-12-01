package tp.interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import tp.dominio.Cliente;
import tp.dominio.Inmueble;
import tp.dominio.Reserva;
import tp.gestores.GestorReserva;

public class PanelDocumentoReserva extends JFrame {
	
	
	private GestorReserva gestorReserva = new GestorReserva();
	
	private JTextField txtValorsea;

	public PanelDocumentoReserva(Reserva reserva) {
	
	setMinimumSize(new Dimension(1000, 700));
	setLocation(300, 70);
	getContentPane().setLayout(null);
	setTitle("Reserva de inmueble");
	
	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(null, "Documento de reserva de inmueble", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	panel.setBounds(45, 74, 859, 599);
	getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel lblPropietario = new JLabel("Propietario:");
	lblPropietario.setFont(new Font("Arial", Font.PLAIN, 14));
	lblPropietario.setBounds(409, 65, 90, 25);
	panel.add(lblPropietario);
	
	JLabel lblProvincia = new JLabel("Provincia:");
	lblProvincia.setFont(new Font("Arial", Font.PLAIN, 14));
	lblProvincia.setBounds(49, 101, 90, 25);
	panel.add(lblProvincia);
	
	JLabel lblLocalidad = new JLabel("Localidad:");
	lblLocalidad.setFont(new Font("Arial", Font.PLAIN, 14));
	lblLocalidad.setBounds(49, 137, 90, 25);
	panel.add(lblLocalidad);
	
	JLabel lblCalle = new JLabel("Calle:");
	lblCalle.setFont(new Font("Arial", Font.PLAIN, 14));
	lblCalle.setBounds(409, 101, 90, 25);
	panel.add(lblCalle);
	
	JLabel lblNumero = new JLabel("N\u00FAmero:");
	lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
	lblNumero.setBounds(637, 101, 90, 25);
	panel.add(lblNumero);
	
	JLabel lblPiso = new JLabel("Piso/Depto:");
	lblPiso.setFont(new Font("Arial", Font.PLAIN, 14));
	lblPiso.setBounds(637, 137, 90, 25);
	panel.add(lblPiso);
	
	JLabel lblBarrio = new JLabel("Barrio:");
	lblBarrio.setFont(new Font("Arial", Font.PLAIN, 14));
	lblBarrio.setBounds(409, 137, 90, 25);
	panel.add(lblBarrio);
	
	JLabel lblTipo = new JLabel("Tipo inmueble:");
	lblTipo.setFont(new Font("Arial", Font.PLAIN, 14));
	lblTipo.setBounds(49, 65, 115, 25);
	panel.add(lblTipo);
	
	JLabel lblPrecio = new JLabel("Precio de venta:");
	lblPrecio.setFont(new Font("Arial", Font.PLAIN, 14));
	lblPrecio.setBounds(49, 187, 115, 25);
	panel.add(lblPrecio);
	
	JLabel lblDatosDelInmueble = new JLabel("Datos del inmueble:");
	lblDatosDelInmueble.setFont(new Font("Arial", Font.PLAIN, 14));
	lblDatosDelInmueble.setBounds(49, 21, 135, 25);
	panel.add(lblDatosDelInmueble);
	
	JLabel lblDatoDelInmueble = new JLabel("VER");
	lblDatoDelInmueble.setFont(new Font("Arial", Font.PLAIN, 14));
	lblDatoDelInmueble.setBounds(174, 65, 115, 25);
	panel.add(lblDatoDelInmueble);
	
	JLabel lblUnaprovincia = new JLabel("Santa Fe");
	lblUnaprovincia.setFont(new Font("Arial", Font.PLAIN, 14));
	lblUnaprovincia.setBounds(173, 101, 90, 25);
	panel.add(lblUnaprovincia);
	
	JLabel lblUnalocalidad = new JLabel("Santa Fe");
	lblUnalocalidad.setFont(new Font("Arial", Font.PLAIN, 14));
	lblUnalocalidad.setBounds(174, 137, 90, 25);
	panel.add(lblUnalocalidad);
	
	JLabel lblNombreYApellido = new JLabel("Martin Guzm\u00E1n");
	lblNombreYApellido.setFont(new Font("Arial", Font.PLAIN, 14));
	lblNombreYApellido.setBounds(509, 65, 157, 25);
	panel.add(lblNombreYApellido);
	
	JLabel lblNumerocalle = new JLabel("Sarmiento");
	lblNumerocalle.setFont(new Font("Arial", Font.PLAIN, 14));
	lblNumerocalle.setBounds(508, 101, 90, 25);
	panel.add(lblNumerocalle);
	
	JLabel lblBarrioinm = new JLabel("Candiotti");
	lblBarrioinm.setFont(new Font("Arial", Font.PLAIN, 14));
	lblBarrioinm.setBounds(508, 137, 90, 25);
	panel.add(lblBarrioinm);
	
	JLabel lblNumeroinmueble = new JLabel("3050");
	lblNumeroinmueble.setFont(new Font("Arial", Font.PLAIN, 14));
	lblNumeroinmueble.setBounds(733, 101, 112, 25);
	panel.add(lblNumeroinmueble);
	
	JLabel lblNumerooguion = new JLabel("-");
	lblNumerooguion.setFont(new Font("Arial", Font.PLAIN, 14));
	lblNumerooguion.setBounds(733, 137, 101, 25);
	panel.add(lblNumerooguion);
	
	JLabel lblValorventa = new JLabel("3000000");
	lblValorventa.setFont(new Font("Arial", Font.PLAIN, 14));
	lblValorventa.setBounds(174, 187, 115, 25);
	panel.add(lblValorventa);
	
	JLabel lblPrecio_1 = new JLabel("--------------------------------------------------------------------------------");
	lblPrecio_1.setFont(new Font("Arial", Font.PLAIN, 14));
	lblPrecio_1.setBounds(225, 223, 413, 25);
	panel.add(lblPrecio_1);
	
	JLabel lblDatosDelCliente = new JLabel("Datos del cliente:");
	lblDatosDelCliente.setFont(new Font("Arial", Font.PLAIN, 14));
	lblDatosDelCliente.setBounds(49, 263, 135, 25);
	panel.add(lblDatosDelCliente);
	
	JLabel lblNombre = new JLabel("Nombre:");
	lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
	lblNombre.setBounds(49, 309, 115, 25);
	panel.add(lblNombre);
	
	JLabel lblNombrecliente = new JLabel("Lisandro");
	lblNombrecliente.setFont(new Font("Arial", Font.PLAIN, 14));
	lblNombrecliente.setBounds(174, 309, 115, 25);
	panel.add(lblNombrecliente);
	
	JLabel lblApellido = new JLabel("Apellido:");
	lblApellido.setFont(new Font("Arial", Font.PLAIN, 14));
	lblApellido.setBounds(49, 352, 115, 25);
	panel.add(lblApellido);
	
	JLabel lblApellidocliente = new JLabel("Perez");
	lblApellidocliente.setFont(new Font("Arial", Font.PLAIN, 14));
	lblApellidocliente.setBounds(174, 352, 115, 25);
	panel.add(lblApellidocliente);
	
	JLabel lblDni = new JLabel("DNI:");
	lblDni.setFont(new Font("Arial", Font.PLAIN, 14));
	lblDni.setBounds(450, 309, 115, 25);
	panel.add(lblDni);
	
	JLabel lblUnnrodni = new JLabel("10531447");
	lblUnnrodni.setFont(new Font("Arial", Font.PLAIN, 14));
	lblUnnrodni.setBounds(575, 309, 115, 25);
	panel.add(lblUnnrodni);
	
	JLabel lblNrotelefono = new JLabel("4557059");
	lblNrotelefono.setFont(new Font("Arial", Font.PLAIN, 14));
	lblNrotelefono.setBounds(575, 352, 115, 25);
	panel.add(lblNrotelefono);
	
	JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
	lblTelfono.setFont(new Font("Arial", Font.PLAIN, 14));
	lblTelfono.setBounds(450, 352, 115, 25);
	panel.add(lblTelfono);
	
	JLabel lblPrecio_1_1 = new JLabel("--------------------------------------------------------------------------------");
	lblPrecio_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
	lblPrecio_1_1.setBounds(225, 388, 413, 25);
	panel.add(lblPrecio_1_1);
	
	JLabel lblTiempoDeVigencia = new JLabel("Tiempo de vigencia:");
	lblTiempoDeVigencia.setFont(new Font("Arial", Font.PLAIN, 14));
	lblTiempoDeVigencia.setBounds(81, 447, 135, 25);
	panel.add(lblTiempoDeVigencia);
	
//	JLabel lblValorsea= new JLabel(reserva.getImporte().toString());
	JLabel lblValorsea= new JLabel("30000");
	lblValorsea.setFont(new Font("Arial", Font.PLAIN, 14));
	lblValorsea.setBounds(635, 450, 115, 20);
	panel.add(lblValorsea);
	
	JLabel lblImporteDeReserva = new JLabel("Importe de reserva:");
	lblImporteDeReserva.setFont(new Font("Arial", Font.PLAIN, 14));
	lblImporteDeReserva.setBounds(475, 447, 135, 25);
	panel.add(lblImporteDeReserva);
	
	JButton btnDescargar = new JButton("Descargar");
	btnDescargar.setBounds(269, 514, 89, 23);
	panel.add(btnDescargar);
	
	JButton btnCancelar = new JButton("Cancelar");
	btnCancelar.setBounds(492, 514, 89, 23);
	panel.add(btnCancelar);
	
//	JLabel comboBox = new JLabel(reserva.getFechaVigencia().toString());
	JLabel comboBox = new JLabel("5");
	comboBox.setBounds(225, 449, 115, 22);
	panel.add(comboBox);
	
	
	btnCancelar.addActionListener(l -> {	
			panel.setVisible(false);
	});
	
	
	btnDescargar.addActionListener(e -> {
		
	});
	
}
}
