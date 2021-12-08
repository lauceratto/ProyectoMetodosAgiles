package tp.gestores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestorReservaTest {

	@Test
	void testImporteSegunTiempoVigencia() {
		GestorReserva reserva = new GestorReserva();
		Double resultado = reserva.importeSegunTiempoVigencia(1, 3000000);
		assertEquals(90000.0, resultado);
	}

}
