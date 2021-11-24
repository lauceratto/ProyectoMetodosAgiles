package tp.App;

import tp.dominio.Inmueble;
import tp.interfaces.PanelAltaCliente;
import tp.interfaces.PanelConsultaInmueble;

public class AppCliente {

	public static void main(String[] args) {
		PanelConsultaInmueble consulta = new PanelConsultaInmueble();
		Inmueble a = new Inmueble();
		PanelAltaCliente panel = new PanelAltaCliente(a, 0, 200);
		consulta.setVisible(true);
	}

}
