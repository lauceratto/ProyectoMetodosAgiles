package tp.interfaces;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import tp.dominio.Cliente;
import tp.dominio.Inmueble;
import tp.dominio.Reserva;
import tp.gestores.GestorReserva;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PanelGenerarReserva extends JPanel {
	
	
	private GestorReserva gestorReserva = new GestorReserva();
	private JTextField txtValorsea;
	
	public PanelGenerarReserva(PanelConsultaInmueble panelConsultaInmueble, Inmueble inmueble, Cliente cliente) {
		
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Generar reserva", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(50, 21, 855, 594);
		add(panel);
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
		
		JLabel lblDatoDelInmueble = new JLabel("Dato del inmueble");
		lblDatoDelInmueble.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDatoDelInmueble.setBounds(174, 65, 115, 25);
		panel.add(lblDatoDelInmueble);
		
		JLabel lblUnaprovincia = new JLabel("Unaprovincia");
		lblUnaprovincia.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUnaprovincia.setBounds(173, 101, 90, 25);
		panel.add(lblUnaprovincia);
		
		JLabel lblUnalocalidad = new JLabel("unalocalidad");
		lblUnalocalidad.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUnalocalidad.setBounds(174, 137, 90, 25);
		panel.add(lblUnalocalidad);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y apellido prop");
		lblNombreYApellido.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombreYApellido.setBounds(509, 65, 157, 25);
		panel.add(lblNombreYApellido);
		
		JLabel lblNumerocalle = new JLabel("nombrecalle");
		lblNumerocalle.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumerocalle.setBounds(508, 101, 90, 25);
		panel.add(lblNumerocalle);
		
		JLabel lblBarrioinm = new JLabel("barrioinm");
		lblBarrioinm.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBarrioinm.setBounds(508, 137, 90, 25);
		panel.add(lblBarrioinm);
		
		JLabel lblNumeroinmueble = new JLabel("numeroinmueble");
		lblNumeroinmueble.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumeroinmueble.setBounds(733, 101, 112, 25);
		panel.add(lblNumeroinmueble);
		
		JLabel lblNumerooguion = new JLabel("numeroOguion");
		lblNumerooguion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumerooguion.setBounds(733, 137, 101, 25);
		panel.add(lblNumerooguion);
		
		JLabel lblValorventa = new JLabel("VALORVENTA");
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
		
		JLabel lblNombrecliente = new JLabel("nombrecliente");
		lblNombrecliente.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombrecliente.setBounds(174, 309, 115, 25);
		panel.add(lblNombrecliente);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellido.setBounds(49, 352, 115, 25);
		panel.add(lblApellido);
		
		JLabel lblApellidocliente = new JLabel("apellidoCliente");
		lblApellidocliente.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellidocliente.setBounds(174, 352, 115, 25);
		panel.add(lblApellidocliente);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDni.setBounds(450, 309, 115, 25);
		panel.add(lblDni);
		
		JLabel lblUnnrodni = new JLabel("unNroDni");
		lblUnnrodni.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUnnrodni.setBounds(575, 309, 115, 25);
		panel.add(lblUnnrodni);
		
		JLabel lblNrotelefono = new JLabel("nroTelefono");
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
		
		txtValorsea = new JTextField();
		txtValorsea.setText("Valorse\u00F1a");
		txtValorsea.setEditable(false);
		txtValorsea.setBounds(635, 450, 115, 20);
		panel.add(txtValorsea);
		txtValorsea.setColumns(10);
		
		JLabel lblImporteDeReserva = new JLabel("Importe de reserva:");
		lblImporteDeReserva.setFont(new Font("Arial", Font.PLAIN, 14));
		lblImporteDeReserva.setBounds(475, 447, 135, 25);
		panel.add(lblImporteDeReserva);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(269, 514, 89, 23);
		panel.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(492, 514, 89, 23);
		panel.add(btnCancelar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Seleccionar");
		comboBox.addItem("5");
		comboBox.addItem("10");
		comboBox.setBounds(243, 449, 115, 22);
		panel.add(comboBox);
		
		
		btnCancelar.addActionListener(l -> {	
		panelConsultaInmueble.setMinimumSize(new Dimension(670, 340));
		panelConsultaInmueble.setLocation(300, 70);
		panelConsultaInmueble.setTitle("Consulta inmueble");
		panelConsultaInmueble.setContentPane(new PanelConsultaInmueble());
		panelConsultaInmueble.pack();
		panelConsultaInmueble.revalidate();
		panelConsultaInmueble.repaint();
		
		});
		
		comboBox.addActionListener(l -> {
			Double valor = gestorReserva.tiempoVigencia(comboBox.getSelectedIndex(), inmueble.getPrecio());
			txtValorsea.setText(valor.toString());
		});
		
		btnConfirmar.addActionListener(e -> {
			//verifico que se seleccione una fecha de vigencia en la reserva
			if(gestorReserva.validarCampos(comboBox.getSelectedIndex())) {
			
				Reserva reserva = new Reserva(inmueble, cliente, comboBox.getSelectedIndex(), Float.parseFloat(txtValorsea.getText())); 
				gestorReserva.crearReserva(reserva);
			}
			
			String correo = "Se le ha enviado un email a su correo a lisandroPerez@gmail.com";
			JOptionPane.showMessageDialog(null, correo);
		});
		
	}
}
