package tp.dao;

import tp.dominio.Propietario;

public class DAOPropietario {

	//Metodo que verifica si el DNI y el email del propietario no existan previamente
	public boolean verificacionUnico(String nombre) {
		return false;
	}
	
	//Metodo que verifica si los campos ingresados por el propietario no sean nulos.
	public boolean verificacionCampos() {
		return true;
	}
	
	//Metodo que persiste un propietario.
	public void guardarPropietario(Propietario unPropietario) {
	}

	
}
