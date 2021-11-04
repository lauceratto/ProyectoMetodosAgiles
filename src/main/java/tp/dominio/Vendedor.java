package tp.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//@Entity
@Table(name = "Vendedor")
public class Vendedor  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	
public Vendedor(String nombre, String apellido, String email, Integer dni, String telefono, String calle,
			Integer nro, String depto, String piso, String contrasenia, String confContra) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.telefono = telefono;
		this.calle = calle;
		this.nro = nro;
		this.depto = depto;
		this.piso = piso;
		this.contrasenia = contrasenia;
		this.confContra = confContra;
	}

//	@Id	@GeneratedValue
//	@Column(name = "id")
//	private Integer id;
	
public Vendedor() {
	// TODO Auto-generated constructor stub
}

	//	@Column(name = "nombre")
	private String nombre;
	
	//	@Column(name = "apellido")
	private String apellido;
	
	private String contrasenia;
	private String confContra;
	
//	@Column(name = "email")
	private String email;

//	@Column(name = "DNI")
	private Integer dni;
	
//	@Column(name = "telefono")
	private String telefono;
	
//	@Column(name = "calle")
	private String calle;
	
//	@Column(name = "nro")
	private Integer nro;
	
//	@Column(name = "depto")
	private String depto;
	
//	@Column(name = "piso")
	private String piso;
	
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

	public Integer getNro() {
		return nro;
	}

	public void setNro(Integer nro) {
		this.nro = nro;
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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getConfContra() {
		return confContra;
	}

	public void setConfContra(String confContra) {
		this.confContra = confContra;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
}
