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
	
	private Propietario propietario;
	
	private String provincia;
	
	private String localidad;
	
	private String calle;
	
	private String numero;
	
	private String piso;
	
	private String barrio;
	
	private String tipo;
	
	private Double precio;
	
	private String orientacion;
	
	private Double longFrente;
	
	private Double longFondo;
	
	private Double superficie;
	
	private Integer antiguedad;
	
	private Integer dormitorios;
	
	private Boolean horizontal;
	
	private Boolean garaje;
	
	private Boolean patio;
	
	private Boolean piscina;
	
	private Boolean aguaCorriente;
	
	private Boolean gas;
	
	private Boolean telefono;
	
	private Boolean lavadero;
	
	private Boolean pavimento;
	
	private Boolean cloaca;
	
	private Boolean aguaCaliente;
	
	private String observaciones;
	
	@Column(name = "fechaDeCarga")
	private LocalDate fechaDeCarga;
	
	@Column(name = "estado")
	private Boolean estado;
	
	

	public Inmueble(Propietario propietario, String provincia, String localidad, String calle, String numero,
			String piso, String barrio, String tipo, Double precio, String orientacion, Double longFrente,
			Double longFondo, Double superficie, Integer antiguedad, Integer dormitorios, Boolean horizontal,
			Boolean garaje, Boolean patio, Boolean piscina, Boolean aguaCorriente, Boolean gas, Boolean telefono,
			Boolean lavadero, Boolean pavimento, Boolean cloaca, Boolean aguaCaliente, String observaciones,
			LocalDate fechaDeCarga, Boolean estado) {
		super();
		this.propietario = propietario;
		this.provincia = provincia;
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.barrio = barrio;
		this.tipo = tipo;
		this.precio = precio;
		this.orientacion = orientacion;
		this.longFrente = longFrente;
		this.longFondo = longFondo;
		this.superficie = superficie;
		this.antiguedad = antiguedad;
		this.dormitorios = dormitorios;
		this.horizontal = horizontal;
		this.garaje = garaje;
		this.patio = patio;
		this.piscina = piscina;
		this.aguaCorriente = aguaCorriente;
		this.gas = gas;
		this.telefono = telefono;
		this.lavadero = lavadero;
		this.pavimento = pavimento;
		this.cloaca = cloaca;
		this.aguaCaliente = aguaCaliente;
		this.observaciones = observaciones;
		this.fechaDeCarga = fechaDeCarga;
		this.estado = estado;
	}

	public Inmueble() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
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

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	public Double getLongFrente() {
		return longFrente;
	}

	public void setLongFrente(Double longFrente) {
		this.longFrente = longFrente;
	}

	public Double getLongFondo() {
		return longFondo;
	}

	public void setLongFondo(Double longFondo) {
		this.longFondo = longFondo;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Integer getDormitorios() {
		return dormitorios;
	}

	public void setDormitorios(Integer dormitorios) {
		this.dormitorios = dormitorios;
	}

	public Boolean getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(Boolean horizontal) {
		this.horizontal = horizontal;
	}

	public Boolean getGaraje() {
		return garaje;
	}

	public void setGaraje(Boolean garaje) {
		this.garaje = garaje;
	}

	public Boolean getPatio() {
		return patio;
	}

	public void setPatio(Boolean patio) {
		this.patio = patio;
	}

	public Boolean getPiscina() {
		return piscina;
	}

	public void setPiscina(Boolean piscina) {
		this.piscina = piscina;
	}

	public Boolean getAguaCorriente() {
		return aguaCorriente;
	}

	public void setAguaCorriente(Boolean aguaCorriente) {
		this.aguaCorriente = aguaCorriente;
	}

	public Boolean getGas() {
		return gas;
	}

	public void setGas(Boolean gas) {
		this.gas = gas;
	}

	public Boolean getTelefono() {
		return telefono;
	}

	public void setTelefono(Boolean telefono) {
		this.telefono = telefono;
	}

	public Boolean getLavadero() {
		return lavadero;
	}

	public void setLavadero(Boolean lavadero) {
		this.lavadero = lavadero;
	}

	public Boolean getPavimento() {
		return pavimento;
	}

	public void setPavimento(Boolean pavimento) {
		this.pavimento = pavimento;
	}

	public Boolean getCloaca() {
		return cloaca;
	}

	public void setCloaca(Boolean cloaca) {
		this.cloaca = cloaca;
	}

	public Boolean getAguaCaliente() {
		return aguaCaliente;
	}

	public void setAguaCaliente(Boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public LocalDate getFechaDeCarga() {
		return fechaDeCarga;
	}

	public void setFechaDeCarga(LocalDate fechaDeCarga) {
		this.fechaDeCarga = fechaDeCarga;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
