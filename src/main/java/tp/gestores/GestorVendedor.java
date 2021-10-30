package tp.gestores;

import javax.swing.JOptionPane;

import tp.dao.DAOVendedor;
import tp.dominio.Vendedor;

public class GestorVendedor {

	private DAOVendedor daoVendedor = new DAOVendedor();
	
	public void crearVendedor(Vendedor vendedor) {
		
		if(daoVendedor.existeDNI(vendedor.getNombre()) == true) {
			JOptionPane.showMessageDialog(null, "El nombre de la competencia ya existe, elija otro");
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
	
	public Boolean validarCampos(Vendedor vendedor) {
		if(vendedor.getNombre().equals("") || vendedor.getApellido().equals("") || vendedor.getCalle().equals("") 
				|| vendedor.getTelefono().equals("")|| vendedor.getConfContra().equals("") || vendedor.getContrasenia().equals("") 
				|| vendedor.getEmail().equals("") || vendedor.getDni().equals("") || vendedor.getNro().equals("")) {
			JOptionPane.showMessageDialog(null, "Los campos obligatorios no pueden ser nulos!");
			return true;
		}
		return false;
	}
}
