package tp.gestores;

import tp.dao.DAOReserva;
import tp.dominio.Reserva;

public class GestorReserva {

	private DAOReserva daoReserva = new DAOReserva();
	
	public boolean validarCampos(Integer valor) {
		if(valor <= -1)
			return false;
		else
			return true;
	}

	public void crearReserva(Reserva reserva) {
		Reserva reserv = new Reserva();
		reserv.setCliente(reserva.getCliente());
		reserv.setInmueble(reserva.getInmueble());
		reserv.setFechaVigencia(reserva.getFechaVigencia());
		reserv.setImporte(reserva.getImporte());
		daoReserva.guardarReserva(reserv);
	}

	public double tiempoVigencia(Integer dia, double valorInmueble) {
		//index = 0 ->elige valor 5
		if(dia == 0) {
			return valorInmueble*3/100;
		}
		//index = 1 -> elige valor 10
		else if(dia == 1) {
			return valorInmueble*6/100;
		}
		//no elige valor 
		else
			return 0;
		
	}
}
