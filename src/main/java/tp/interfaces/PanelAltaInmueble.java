package tp.interfaces;

import java.awt.Color;
import java.awt.event.*;
import java.time.LocalDate;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import tp.dominio.Inmueble;
import tp.dominio.Propietario;
import tp.gestores.GestorInmueble;

import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class PanelAltaInmueble extends JPanel{
	private JTextField txtNumero;
	private JTextField txtPiso;
	private JTextField txtPrecio;
	private JTextField txtNuevaLocalidad;
	private JTextField txtNuevaCalle;
	private JTextField txtNuevoBarrio;
	private JComboBox listaLocalidad;
	private JLabel lblNuevaLocalidad;
	private JTextField txtLongitudFrente;
	private JTextField txtAntiguedad;
	private JTextField txtLongitudFondo;
	private JTextField txtDormitorios;
	private JTextField txtSuperficie;
	private JComboBox listaPropietario;
	private JComboBox listaProvincia;
	private JComboBox listaCalle;
	private JComboBox listaBarrio;
	private JComboBox listaTipo;
	private JComboBox listaOrientacion;
	private JCheckBox checkHorizontal;
	private JCheckBox checkGaraje;
	private JCheckBox checkPatio;
	private JCheckBox checkPiscina;
	private JCheckBox checkAguaCorriente;
	private JCheckBox checkGas;
	private JCheckBox checkTelefono;
	private JCheckBox checkLavadero;
	private JCheckBox checkPavimento;
	private JCheckBox checkCloacas;
	private JCheckBox checkAguaCaliente;
	private JTextArea textArea;
	
	private GestorInmueble gestorInmueble = new GestorInmueble();
	
	public PanelAltaInmueble() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Alta Imueble", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(47, 46, 1167, 608);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblPropietario = new JLabel("Propietario*");
		lblPropietario.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPropietario.setBounds(25, 38, 90, 25);
		panel.add(lblPropietario);
		
		JLabel lblProvincia = new JLabel("Provincia*");
		lblProvincia.setFont(new Font("Arial", Font.PLAIN, 14));
		lblProvincia.setBounds(25, 73, 90, 25);
		panel.add(lblProvincia);
		
		JLabel lblLocalidad = new JLabel("Localidad*");
		lblLocalidad.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLocalidad.setBounds(25, 108, 90, 25);
		panel.add(lblLocalidad);
		
		JLabel lblCalle = new JLabel("Calle*");
		lblCalle.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCalle.setBounds(25, 143, 90, 25);
		panel.add(lblCalle);
		
		JLabel lblNumero = new JLabel("N\u00FAmero*");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNumero.setBounds(25, 178, 90, 25);
		panel.add(lblNumero);
		
		JLabel lblPiso = new JLabel("Piso/Depto.*");
		lblPiso.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPiso.setBounds(25, 213, 90, 25);
		panel.add(lblPiso);
		
		JLabel lblBarrio = new JLabel("Barrio*");
		lblBarrio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBarrio.setBounds(25, 248, 90, 25);
		panel.add(lblBarrio);
		
		JLabel lblTipo = new JLabel("Tipo inmueble*");
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTipo.setBounds(25, 283, 115, 25);
		panel.add(lblTipo);
		
		JLabel lblPrecio = new JLabel("Precio de venta*");
		lblPrecio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPrecio.setBounds(25, 318, 115, 25);
		panel.add(lblPrecio);
		
		JLabel lblOrientacion = new JLabel("Orientaci\u00F3n");
		lblOrientacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblOrientacion.setBounds(25, 353, 90, 25);
		panel.add(lblOrientacion);
		
		listaPropietario = new JComboBox();
		listaPropietario.setBounds(140, 41, 167, 21);	
		listaPropietario.addItem("Seleccionar");
		panel.add(listaPropietario);
		
		listaProvincia = new JComboBox();
		listaProvincia.setBounds(140, 76, 167, 21);
		listaProvincia.addItem("Santa Fe");
		panel.add(listaProvincia);
		
		lblNuevaLocalidad = new JLabel("Ingrese una nueva localidad");
		lblNuevaLocalidad.setForeground(Color.GRAY);
		lblNuevaLocalidad.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNuevaLocalidad.setBounds(385, 108, 200, 25);
		panel.add(lblNuevaLocalidad);
		
		txtNuevaLocalidad = new JTextField();
		txtNuevaLocalidad.setEnabled(false);
		txtNuevaLocalidad.setColumns(10);
		txtNuevaLocalidad.setBounds(580, 112, 155, 19);
		panel.add(txtNuevaLocalidad);
		
		listaLocalidad = new JComboBox();
		listaLocalidad.setBounds(140, 111, 167, 21);
		listaLocalidad.addItem("Seleccionar");
		listaLocalidad.addItem("Santa Fe");
		listaLocalidad.addItem("Santo Tome");
		listaLocalidad.addItem("Otra");

		panel.add(listaLocalidad);
		
		listaCalle = new JComboBox();
		listaCalle.setBounds(140, 146, 167, 21);
		listaCalle.addItem("Seleccionar");
		panel.add(listaCalle);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(140, 182, 74, 19);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtPiso = new JTextField();
		txtPiso.setColumns(10);
		txtPiso.setBounds(140, 217, 74, 19);
		panel.add(txtPiso);
		
		listaBarrio = new JComboBox();
		listaBarrio.setBounds(140, 251, 167, 21);
		listaBarrio.addItem("Seleccionar");
		panel.add(listaBarrio);
		
		listaTipo = new JComboBox();
		listaTipo.setBounds(140, 286, 167, 21);
		listaTipo.addItem("Seleccionar");
		panel.add(listaTipo);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(140, 322, 167, 19);
		panel.add(txtPrecio);
		
		JLabel lblPrecioFinal = new JLabel("pesos");
		lblPrecioFinal.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPrecioFinal.setBounds(315, 318, 115, 25);
		panel.add(lblPrecioFinal);
		
		listaOrientacion = new JComboBox();
		listaOrientacion.setBounds(140, 356, 167, 21);
		listaOrientacion.addItem("Seleccionar");
		panel.add(listaOrientacion);
		
		
		
		JLabel lblNuevaCalle = new JLabel("Ingrese una nueva calle");
		lblNuevaCalle.setForeground(Color.GRAY);
		lblNuevaCalle.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNuevaCalle.setBounds(385, 143, 200, 25);
		panel.add(lblNuevaCalle);
		
		txtNuevaCalle = new JTextField();
		txtNuevaCalle.setEnabled(false);
		txtNuevaCalle.setColumns(10);
		txtNuevaCalle.setBounds(580, 147, 155, 19);
		panel.add(txtNuevaCalle);
		
		JLabel lblNuevoBarrio = new JLabel("Ingrese un nuevo barrio");
		lblNuevoBarrio.setForeground(Color.GRAY);
		lblNuevoBarrio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNuevoBarrio.setBounds(385, 248, 200, 25);
		panel.add(lblNuevoBarrio);
		
		txtNuevoBarrio = new JTextField();
		txtNuevoBarrio.setEnabled(false);
		txtNuevoBarrio.setColumns(10);
		txtNuevoBarrio.setBounds(580, 252, 155, 19);
		panel.add(txtNuevoBarrio);
		
		JLabel lblLongitudFrente = new JLabel("Longitud frente");
		lblLongitudFrente.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLongitudFrente.setBounds(385, 353, 105, 25);
		panel.add(lblLongitudFrente);
		
		txtLongitudFrente = new JTextField();
		txtLongitudFrente.setColumns(10);
		txtLongitudFrente.setBounds(500, 357, 74, 19);
		panel.add(txtLongitudFrente);
		
		JLabel lblMts = new JLabel("mts.");
		lblMts.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMts.setBounds(580, 353, 36, 25);
		panel.add(lblMts);
		
		JLabel lblAntiguedad = new JLabel("Antig\u00FCedad");
		lblAntiguedad.setFont(new Font("Arial", Font.PLAIN, 14));
		lblAntiguedad.setBounds(385, 388, 105, 25);
		panel.add(lblAntiguedad);
		
		txtAntiguedad = new JTextField();
		txtAntiguedad.setColumns(10);
		txtAntiguedad.setBounds(500, 392, 74, 19);
		panel.add(txtAntiguedad);
		
		JLabel lblAntiguedad_2 = new JLabel("a\u00F1os");
		lblAntiguedad_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblAntiguedad_2.setBounds(580, 388, 36, 25);
		panel.add(lblAntiguedad_2);
		
		JLabel lblLongitudFondo = new JLabel("Longitud fondo");
		lblLongitudFondo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLongitudFondo.setBounds(663, 353, 105, 25);
		panel.add(lblLongitudFondo);
		
		txtLongitudFondo = new JTextField();
		txtLongitudFondo.setColumns(10);
		txtLongitudFondo.setBounds(788, 357, 74, 19);
		panel.add(txtLongitudFondo);
		
		JLabel lblLongitudFondo_2 = new JLabel("mts.");
		lblLongitudFondo_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLongitudFondo_2.setBounds(872, 353, 36, 25);
		panel.add(lblLongitudFondo_2);
		
		JLabel lblDormitorios = new JLabel("Cant. dormitorios");
		lblDormitorios.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDormitorios.setBounds(663, 388, 122, 25);
		panel.add(lblDormitorios);
		
		txtDormitorios = new JTextField();
		txtDormitorios.setColumns(10);
		txtDormitorios.setBounds(788, 392, 74, 19);
		panel.add(txtDormitorios);
		
		JLabel lblSuperficie = new JLabel("Superficie");
		lblSuperficie.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSuperficie.setBounds(950, 353, 74, 25);
		panel.add(lblSuperficie);
		
		txtSuperficie = new JTextField();
		txtSuperficie.setColumns(10);
		txtSuperficie.setBounds(1034, 357, 74, 19);
		panel.add(txtSuperficie);
		
		JLabel lblSuperficie_2 = new JLabel("m2");
		lblSuperficie_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSuperficie_2.setBounds(1118, 353, 36, 25);
		panel.add(lblSuperficie_2);
		
		checkHorizontal = new JCheckBox("Propiedad horizontal");
		checkHorizontal.setFont(new Font("Arial", Font.PLAIN, 14));
		checkHorizontal.setBounds(25, 390, 161, 21);
		panel.add(checkHorizontal);
		
		checkGaraje = new JCheckBox("Garaje/Cochera");
		checkGaraje.setFont(new Font("Arial", Font.PLAIN, 14));
		checkGaraje.setBounds(25, 428, 161, 21);
		panel.add(checkGaraje);
		
		checkPatio = new JCheckBox("Patio");
		checkPatio.setFont(new Font("Arial", Font.PLAIN, 14));
		checkPatio.setBounds(297, 428, 74, 21);
		panel.add(checkPatio);
		
		checkPiscina = new JCheckBox("Piscina");
		checkPiscina.setFont(new Font("Arial", Font.PLAIN, 14));
		checkPiscina.setBounds(514, 428, 161, 21);
		panel.add(checkPiscina);
		
		checkAguaCorriente = new JCheckBox("Agua corriente");
		checkAguaCorriente.setFont(new Font("Arial", Font.PLAIN, 14));
		checkAguaCorriente.setBounds(747, 428, 161, 21);
		panel.add(checkAguaCorriente);
		
		checkGas = new JCheckBox("Gas natural");
		checkGas.setFont(new Font("Arial", Font.PLAIN, 14));
		checkGas.setBounds(1003, 428, 105, 21);
		panel.add(checkGas);
		
		checkTelefono = new JCheckBox("Tel\u00E9fono");
		checkTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		checkTelefono.setBounds(25, 467, 161, 21);
		panel.add(checkTelefono);
		
		checkLavadero = new JCheckBox("Lavadero");
		checkLavadero.setFont(new Font("Arial", Font.PLAIN, 14));
		checkLavadero.setBounds(297, 468, 161, 21);
		panel.add(checkLavadero);
		
		checkPavimento = new JCheckBox("Pavimento");
		checkPavimento.setFont(new Font("Arial", Font.PLAIN, 14));
		checkPavimento.setBounds(514, 468, 161, 21);
		panel.add(checkPavimento);
		
		checkCloacas = new JCheckBox("Cloacas");
		checkCloacas.setFont(new Font("Arial", Font.PLAIN, 14));
		checkCloacas.setBounds(747, 468, 161, 21);
		panel.add(checkCloacas);
		
		checkAguaCaliente = new JCheckBox("Agua caliente");
		checkAguaCaliente.setFont(new Font("Arial", Font.PLAIN, 14));
		checkAguaCaliente.setBounds(1003, 468, 122, 21);
		panel.add(checkAguaCaliente);
		
		JButton btnImagen = new JButton("Subir imagen");
		btnImagen.setBackground(Color.WHITE);
		btnImagen.setFont(new Font("Arial", Font.PLAIN, 14));
		btnImagen.setBounds(25, 510, 122, 21);
		panel.add(btnImagen);
		
		JLabel lblObservaciones = new JLabel("Observaciones");
		lblObservaciones.setFont(new Font("Arial", Font.PLAIN, 14));
		lblObservaciones.setBounds(385, 506, 105, 25);
		panel.add(lblObservaciones);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textArea.setBounds(514, 509, 594, 75);
		panel.add(textArea);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(1129, 664, 85, 21);
		add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBounds(1019, 664, 85, 21);
		
		btnGuardar.addActionListener(e -> {
			Propietario prop = new Propietario(); //Sacar
			//Propietario propietario = this.listaPropietario.getSelectedItem()
			String provincia = this.listaProvincia.getSelectedItem().toString();
			String localidad = this.listaLocalidad.getSelectedItem().toString();
			String calle = this.listaCalle.getSelectedItem().toString();
			String numero = this.txtNumero.getText();
			String piso = this.txtPiso.getText();
			String barrio = this.listaBarrio.getSelectedItem().toString();
			String tipo = this.listaTipo.getSelectedItem().toString();
			Double precio = Double.parseDouble( this.txtPrecio.getText());
			String orientacion = this.listaOrientacion.getSelectedItem().toString();
			Double longFrente = Double.parseDouble(this.txtLongitudFrente.getText());
			Double longFondo = Double.parseDouble(this.txtLongitudFondo.getText());
			Double superficie = Double.parseDouble(this.txtSuperficie.getText());
			Integer antiguedad = Integer.parseInt(this.txtAntiguedad.getText());
			Integer dormitorios = Integer.parseInt(this.txtDormitorios.getText());
			Boolean horizontal = this.checkHorizontal.isSelected();
			Boolean garaje = this.checkGaraje.isSelected();
			Boolean patio = this.checkPatio.isSelected();
			Boolean piscina = this.checkPiscina.isSelected();
			Boolean aguaCorriente = this.checkAguaCorriente.isSelected();
			Boolean gas = this.checkGas.isSelected();
			Boolean telefono = this.checkTelefono.isSelected();
			Boolean lavadero = this.checkLavadero.isSelected();
			Boolean pavimento = this.checkPavimento.isSelected();
			Boolean cloaca = this.checkCloacas.isSelected();
			Boolean aguaCaliente = this.checkAguaCaliente.isSelected();
			String observaciones = this.textArea.getText();
			
			Inmueble inmueble = new Inmueble(prop, provincia, localidad, calle, numero, piso, barrio, tipo, precio, orientacion, longFrente,
						                     longFondo, superficie, antiguedad, dormitorios, horizontal, garaje, patio, piscina, aguaCorriente,
						                     gas, telefono, lavadero, pavimento, cloaca, aguaCaliente, observaciones, LocalDate.now(), true);
			
			if(gestorInmueble.validarCampos(inmueble)) {
				gestorInmueble.crearInmueble(inmueble);
			}
		});
		
		add(btnGuardar);

	}
	
	
}
