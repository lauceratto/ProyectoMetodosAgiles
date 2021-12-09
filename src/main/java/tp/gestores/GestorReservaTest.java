package tp.gestores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp.dominio.EstadoInmueble;
import tp.dominio.Inmueble;

class GestorReservaTest {

	@Test
	void testCambiarEstadoInmueble() {
		Inmueble inmueble = new Inmueble();
		inmueble.setEstado(EstadoInmueble.DISPONIBLE);
		inmueble.cambiarEstadoInmueble();
		EstadoInmueble estado = inmueble.getEstado();
		assertEquals(estado, EstadoInmueble.VENDIDO);
	}

	@Test
	void testImporteSegunTiempoVigencia() {
		GestorReserva reserva = new GestorReserva();
		Double resultado = reserva.importeSegunTiempoVigencia(1, 3000000);
		assertEquals(90000.0, resultado);
	}
}
