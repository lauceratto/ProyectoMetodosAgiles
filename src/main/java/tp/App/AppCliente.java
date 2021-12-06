package tp.App;

import tp.dominio.Inmueble;
import tp.interfaces.PanelAltaCliente;
import tp.interfaces.PanelConsultaInmueble;

public class AppCliente {

	public static void main(String[] args) {
		PanelConsultaInmueble consulta = new PanelConsultaInmueble();
		consulta.setVisible(true);
	}

}
