package tp.gestores;

import javax.swing.JOptionPane;

import tp.dao.DAOCliente;
import tp.dominio.Cliente;


public class GestorCliente {
	private DAOCliente daoCliente = new DAOCliente();
	
	public void crearCliente(Cliente cliente) {
		
		if(daoCliente.existeDNI(cliente.getNombre()) == true) {
			JOptionPane.showMessageDialog(null, "El nombre de la competencia ya existe, elija otro");
		}
		else {
			daoCliente.guardarVendedor(cliente);
		}		
	}
	
	public Boolean validarCampos(Cliente cliente) {
		if(cliente.getNombre().equals("") || cliente.getApellido().equals("") || cliente.getTelefono().equals("") 
				|| cliente.getDni().equals("")) {
			JOptionPane.showMessageDialog(null, "Los campos obligatorios no pueden ser nulos!");
			return true;
		}
		return false;
	}
}
