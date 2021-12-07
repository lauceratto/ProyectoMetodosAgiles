package tp.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class Cliente implements Serializable {
	
	
	
/*
 *  Hasta la iteración 2 donde se realiza la historia 2 no se utilizará este metodo
	public Cliente(String nombre, String apellido, String telefono, Integer dni, Inmueble inmueble, Integer minimo, Integer maximo) {
		Cliente cliente = new Cliente();
		cliente.montoMinimo = minimo;
		cliente.montoMaximo = maximo;
		cliente.nombre = nombre;
		cliente.apellido = apellido;
		cliente.dni = dni;
		cliente.inmueble = inmueble;
		cliente.telefono = telefono;
	}
*/	
	public Cliente(String nombre, String apellido, String telefono, Integer dni, Double montoMinimo, Double montoMaximo, String correo, String contra, String confContra) {
		Cliente cliente = new Cliente();
		cliente.nombre = nombre;
		cliente.apellido = apellido;
		cliente.dni = dni;
		cliente.telefono = telefono;
		cliente.confContra = confContra;
		cliente.contra = contra;
		cliente.correo = correo;
		cliente.montoMinimo = montoMinimo;
		cliente.montoMaximo = montoMaximo;
	}
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	private Integer dni;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private Inmueble inmueble;
	private String contra;
	private Double montoMinimo;
	private String confContra;
	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getContra() {
		return contra;
	}


	public void setContra(String contra) {
		this.contra = contra;
	}


	public String getConfContra() {
		return confContra;
	}


	public void setConfContra(String confContra) {
		this.confContra = confContra;
	}

	private Double montoMaximo;

	
	
	public Double getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(Double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

	public Double getMontoMaximo() {
		return montoMaximo;
	}

	public void setMontoMaximo(Double montoMaximo) {
		this.montoMaximo = montoMaximo;
	}



	public Inmueble getInmueble() {
		return inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	
	
}
