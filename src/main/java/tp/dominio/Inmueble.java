package tp.dominio;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inmueble")
public class Inmueble implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "fechaDeCarga")
	private LocalDate fechaDeCarga;
	
	@Column(name = "estado")
	private Boolean estado;
}
