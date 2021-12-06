package tp.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reserva")
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	private Integer fechaVigencia;
	
	
	public Reserva(Inmueble inmueble2, Cliente cliente2, int selectedIndex, float parseFloat) {
		super();
		this.inmueble = inmueble2;
		this.cliente = cliente2;
		this.Importe = parseFloat;
		switch(selectedIndex) {
			case 0: this.fechaVigencia = 5;
			break;
			case 1: this.fechaVigencia = 10;
			break;
			default: this.fechaVigencia = -1;
		}
	}

	public Reserva() {
		
	}

	public Integer getFechaVigencia() {
		return fechaVigencia;
	}

	public void setFechaVigencia(Integer fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}

	public Float getImporte() {
		return Importe;
	}

	public void setImporte(Float importe) {
		Importe = importe;
	}

	public Inmueble getInmueble() {
		return inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private Float Importe;
	
	private Inmueble inmueble;
	
	private Cliente cliente;
}
