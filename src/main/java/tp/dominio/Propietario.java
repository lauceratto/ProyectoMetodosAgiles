package tp.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Propietario")
public class Propietario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "tipoDocumento")
	private String tipoDoc;
	
	@Id
	@Column(name = "DNI")
	private Integer DNI;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "calle")
	private String calle;
	
	@Column(name = "nro")
	private Integer Nro;
	
	@Column(name = "depto")
	private String depto;
	
	@Column(name = "piso")
	private String piso;
	
	@Column(name = "provincia")
	private String provincia;
	
	@Column(name = "localidad")
	private String localidad;
	

}
