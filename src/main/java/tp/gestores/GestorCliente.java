package tp.gestores;

import javax.swing.JOptionPane;

import tp.dao.DAOCliente;
import tp.dominio.Cliente;


public class GestorCliente {
	private DAOCliente daoCliente = new DAOCliente();
	
	public void crearCliente(Cliente cliente) {
		
		//valida que no exista un cliente en la bd con el mismo dni o correo
		if(daoCliente.existeCorreo(cliente.getCorreo()) == true || daoCliente.existeDNI(cliente.getDni()) == true) {
			JOptionPane.showMessageDialog(null, "No es posible dar de alta al cliente, ya se encuentra registrado!");
		}
		else {
			daoCliente.guardarVendedor(cliente);
		}		
	}
	//valida que los campos obligatorios esten completos
	public Boolean validarCampos(Cliente cliente) {
		if(cliente.getNombre().equals("") || cliente.getApellido().equals("") || cliente.getTelefono().equals("") 
				|| cliente.getDni().equals("")) {
			JOptionPane.showMessageDialog(null, "Los campos obligatorios no pueden ser nulos!");
			return true;
		}
		return false;
	}
	
	// Le manda el objeto cliente al DaoCliente para que actualiza la base de datos con los nuevos datos.
	public void modificarCliente(Cliente cliente) {
		daoCliente.modificarCliente(cliente);
		
	}
}
