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
	public Cliente(String nombre, String apellido, String telefono, Integer dni, Float montoMinimo, Float montoMaximo) {
		Cliente cliente = new Cliente();
		cliente.nombre = nombre;
		cliente.apellido = apellido;
		cliente.dni = dni;
		cliente.telefono = telefono;
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


	private Inmueble inmueble;

	private Float montoMinimo;

	private float montoMaximo;

	
	
	public Float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(Float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

	public Float getMontoMaximo() {
		return montoMaximo;
	}

	public void setMontoMaximo(Float montoMaximo) {
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
