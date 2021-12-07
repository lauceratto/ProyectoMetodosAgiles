package tp.gestores;

import tp.dao.DAOReserva;
import tp.dominio.Reserva;

public class GestorReserva {

	private DAOReserva daoReserva = new DAOReserva();
	// SE VALIDA QUE SE HAYA SELECCIONADO LA VIGENCIA DE LA RESERVA
	public boolean validarCampos(Integer valor) {
		if(valor <= -1)
			return false;
		else
			return true;
	}
	//	SE CREA LA RESERVA
	public void crearReserva(Reserva reserva) {
		Reserva reserv = new Reserva();
		reserv.setCliente(reserva.getCliente());
		reserv.setInmueble(reserva.getInmueble());
		reserv.setFechaVigencia(reserva.getFechaVigencia());
		reserv.setImporte(reserva.getImporte());
		daoReserva.guardarReserva(reserv);
	}
	
	//	CALCULA EL VALOR DE LA RESERVA SEGUN LOS DIAS DE VIGENCIA QUE ELIGIO EL CLIENTE 
	public double importeSegunTiempoVigencia(Integer dia, double valorInmueble) {
		//index = 0 ->ELIGE EL VALOR 5
		if(dia == 0) {
			return valorInmueble*3/100;
		}
		//index = 1 -> ELIGE EL VALOR 10
		else if(dia == 1) {
			return valorInmueble*6/100;
		}
		//NO ELIGE VALOR 
		else
			return 0;
		
	}
}
