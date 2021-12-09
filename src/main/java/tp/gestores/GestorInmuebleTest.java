package tp.gestores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp.dominio.Inmueble;

class GestorInmuebleTest {

	@Test
	void testLongitudCamposInmueble() {
		
		GestorInmueble gestorInmueble = new GestorInmueble();
		Inmueble inmueble = new Inmueble();
		inmueble.setPiso("1234567890123456");
		inmueble.setNumero("3518");
		
		assertTrue(gestorInmueble.verificarLongitudCampos(inmueble));
	}

	@Test
	void testVerificarValoresNegativos() {
		Inmueble inmueble = new Inmueble();
		GestorInmueble gestor = new GestorInmueble();
		inmueble.setBanio(1);
		inmueble.setDormitorios(2);
		inmueble.setLongFondo(7.0);
		inmueble.setLongFrente(5.0);
		inmueble.setAntiguedad(1);
		inmueble.setPrecio(5000000.0);
		inmueble.setSuperficie(-35.0);		
		assertTrue(gestor.verificarValoresNegativos(inmueble));
		
	}
}
