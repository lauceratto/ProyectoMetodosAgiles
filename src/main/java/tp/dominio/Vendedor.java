package tp.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vendedor")
public class Vendedor  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;

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
}
