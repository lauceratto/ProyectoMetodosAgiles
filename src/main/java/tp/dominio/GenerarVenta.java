package tp.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")
public class GenerarVenta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//DATOS DEL INMUEBLE Y DEL CLIENTE?
	@Id @GeneratedValue
	@Column(name = "Id")
	private Integer id;
}
