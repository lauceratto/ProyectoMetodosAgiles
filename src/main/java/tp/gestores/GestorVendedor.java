package tp.gestores;

import javax.swing.JOptionPane;

import tp.dao.DAOVendedor;
import tp.dominio.Vendedor;

public class GestorVendedor {

	private DAOVendedor daoVendedor = new DAOVendedor();
	
	//CREA EL VENDEDOR Y SE GUARDA EN LA BASE DE DATOS, VERIFICA QUE NO EXISTA PREVIAMENTE UN VENDEDOR CON EL MISMO DNI
	public void crearVendedor(Vendedor vendedor) {
		
		if(daoVendedor.existeDNI(vendedor.getDni()) == true) {
			JOptionPane.showMessageDialog(null, "No es posible dar de alta al vendedor ya que el mismo se encuentra registrado");
		}
		else {
			Vendedor vend = new Vendedor();
			vend.setNombre(vendedor.getNombre());
			vend.setApellido(vendedor.getApellido());
			vend.setCalle(vendedor.getCalle());
			vend.setConfContra(vendedor.getConfContra());
			vend.setContrasenia(vendedor.getContrasenia());
			vend.setDepto(vendedor.getDepto());
			vend.setDni(vendedor.getDni());
			vend.setEmail(vendedor.getEmail());
			vend.setNro(vendedor.getNro());
			vend.setPiso(vendedor.getPiso());
			vend.setTelefono(vendedor.getTelefono());
			
			daoVendedor.guardarVendedor(vend);
		}
	}
	
	//VALIDA QUE LOS CAMPOS NO ESTEN NULOS
	public Boolean validarCampos(Vendedor vendedor) {
		if(vendedor.getNombre().equals("") || vendedor.getApellido().equals("") || vendedor.getCalle().equals("") 
				|| vendedor.getTelefono().equals("")|| vendedor.getConfContra().equals("") || vendedor.getContrasenia().equals("") 
				|| vendedor.getEmail().equals("") || vendedor.getDni().equals("") || vendedor.getNro().equals("")) {
			JOptionPane.showMessageDialog(null, "Los campos obligatorios no pueden ser nulos!");
			return true;
		}
		return false;
	}
	
	//SE MANDA A ACTUALIZAR LOS DATOS DEL VENDEDOR A LA BASE DE DATOS.
	public void actualizarDatos(Vendedor vendedor) {
		daoVendedor.actualizarVendedor(vendedor);
		
	}
}
