package tp.gestores;

import javax.swing.JOptionPane;

import tp.dao.DAOPropietario;
import tp.dominio.Propietario;

public class GestorPropietario {
private DAOPropietario daoPropietario = new DAOPropietario();
	
	public void altaPropietario(Propietario propietario) {
		
		if (daoPropietario.verificacionUnico(propietario.getNombre()) == true) {
			JOptionPane.showMessageDialog(null, "Ya existe un propietario con ese DNI");
			
		}
		else {
			Propietario prop = new Propietario();
			prop.setNombre(propietario.getNombre());
			prop.setApellido(propietario.getApellido());
			prop.setEmail(propietario.getEmail());
			prop.setDni(propietario.getDni());
			prop.setTelefono(propietario.getTelefono());
			prop.setCalle(propietario.getCalle());
			prop.setNumeroCalle(propietario.getNumeroCalle());
			prop.setDepto(propietario.getDepto());//PUEDE SER NULO
			prop.setPiso(propietario.getPiso());//PUEDE SER NULO
			prop.setProvincia(propietario.getProvincia());
			prop.setLocalidad(propietario.getLocalidad());
			
			daoPropietario.guardarPropietario(prop);
		}

	}
	
	public boolean VerificacionCampos(Propietario prop) {
		
		if(prop.getNombre().equals("") || prop.getApellido().equals("") || prop.getEmail().equals("") ||
			prop.getDni().equals("") || prop.getTelefono().equals("") || prop.getCalle().equals("") ||
			 prop.getNumeroCalle().equals("") || prop.getLocalidad().equals("")) {
			
			JOptionPane.showMessageDialog(null, "Los campos obligatorios no pueden ser nulos!");
			
			return false;
		}
		return true;
	}
}
