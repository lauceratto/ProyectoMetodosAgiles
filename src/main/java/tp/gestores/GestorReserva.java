package tp.gestores;

import java.time.LocalDate;

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
		reserv.setFechaInicio(LocalDate.now());
		daoReserva.guardarReserva(reserv);
	}
	
	//	CALCULA EL VALOR DE LA RESERVA SEGUN LOS DIAS DE VIGENCIA QUE ELIGIO EL CLIENTE 
	public double importeSegunTiempoVigencia(Integer index, double valorInmueble) {
		//index = 1 ->ELIGE EL VALOR 5
		if(index == 1) {
			return (valorInmueble*3)/100;
		}
		//index = 2 -> ELIGE EL VALOR 7
		if(index == 2) {
			return (valorInmueble*5)/100;
		}
		//index = 3 -> ELIGE EL VALOR 10
		if(index == 3) {
			return (valorInmueble*8)/100;
		}
		return 0.0;
		
	}
}
