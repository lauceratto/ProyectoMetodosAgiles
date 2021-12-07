package tp.gestores;

import javax.swing.JOptionPane;

import tp.dao.DAOCliente;
import tp.dominio.Cliente;


public class GestorCliente {
	private DAOCliente daoCliente = new DAOCliente();
	
	public void crearCliente(Cliente cliente) {
		
		// VALIDA QUE NO EXISTA UN CLIENTE EN LA BD CON EL MISMO DNI O CORREO ELECTRONICO
		if(daoCliente.existeCorreo(cliente.getCorreo()) == true || daoCliente.existeDNI(cliente.getDni()) == true) {
			JOptionPane.showMessageDialog(null, "No es posible dar de alta al cliente, ya se encuentra registrado!");
		}
		else {
			daoCliente.guardarVendedor(cliente);
		}		
	}
	// VALIDA QUE LOS CAMPOS OBLIGATORIOS ESTEN COMPLETOS
	public Boolean validarCampos(Cliente cliente) {
		if(cliente.getNombre().equals("") || cliente.getApellido().equals("") || cliente.getTelefono().equals("") 
				|| cliente.getDni().equals("")) {
			JOptionPane.showMessageDialog(null, "Los campos obligatorios no pueden ser nulos!");
			return true;
		}
		return false;
	}
	
	//  LE MANDA EL OBJETO CLIENTE AL DAOCLIENTE PARA QUE ACTUALICE LA BD CON LOS NUEVOS DATOS
	public void modificarCliente(Cliente cliente) {
		daoCliente.modificarCliente(cliente);
		
	}
}
