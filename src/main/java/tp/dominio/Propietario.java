package tp.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "Propietario")
public class Propietario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String email;
	private String tipoDoc;
	private Integer dni;
	private String telefono;
	private String calle;
	private Integer numeroCalle;
	private String depto;
	private String piso;
	private String provincia;
	private String localidad;
	
	//CONSTRUCTORES
	public Propietario() {
	}
	
	public Propietario(String nombre, String apellido, String email, String tipoDoc, Integer dNI, String telefono,
			String calle, Integer nro, String depto, String piso, String provincia, String localidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.tipoDoc = tipoDoc;
		this.dni = dNI;
		this.telefono = telefono;
		this.calle = calle;
		this.numeroCalle = nro;
		this.depto = depto;
		this.piso = piso;
		this.provincia = provincia;
		this.localidad = localidad;
	}

	
	//GETTERS Y SETTERS.
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumeroCalle() {
		return numeroCalle;
	}

	public void setNumeroCalle(Integer numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	

}
