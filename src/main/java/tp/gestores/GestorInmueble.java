package tp.gestores;

import java.util.List;

import javax.swing.JOptionPane;

import tp.dao.DAOInmueble;
import tp.dominio.Inmueble;

public class GestorInmueble {
	
	private DAOInmueble daoInmueble = new DAOInmueble();
	//VALIDA QUE LOS CAMPOS ESTEN COMPLETOS
	public Boolean validarCampos(Inmueble inmueble) {
		
		if(inmueble.getPropietario() == null || inmueble.getProvincia().equals("Seleccionar") || inmueble.getLocalidad().equals("Seleccioanr") ||
		   inmueble.getCalle().equals("Seleccionar") || inmueble.getNumero().equals("") || inmueble.getPiso().equals("") || 
		   inmueble.getPiso().equals("") || inmueble.getBarrio().equals("Seleccionar") || inmueble.getTipo().equals("Seleccionar") ||
		   inmueble.getPrecio().equals("")) {
			JOptionPane.showMessageDialog(null, "Los campos obligatorios no pueden ser nulos!");
			return false;
		}
		
		return true;
	}
	// SE CREA EL INMUEBLE
	public void crearInmueble(Inmueble unInmueble) {
		Inmueble inmueble = new Inmueble();
		
		inmueble.setPropietario(unInmueble.getPropietario());
		inmueble.setProvincia(unInmueble.getProvincia());
		inmueble.setLocalidad(unInmueble.getLocalidad());
		inmueble.setCalle(unInmueble.getCalle());
		inmueble.setNumero(unInmueble.getNumero());
		inmueble.setPiso(unInmueble.getPiso());
		inmueble.setBarrio(unInmueble.getBarrio());
		inmueble.setTipo(unInmueble.getTipo());
		inmueble.setPrecio(unInmueble.getPrecio());
		inmueble.setOrientacion(unInmueble.getOrientacion());
		inmueble.setLongFrente(unInmueble.getLongFrente());
		inmueble.setLongFondo(unInmueble.getLongFondo());
		inmueble.setSuperficie(unInmueble.getSuperficie());
		inmueble.setAntiguedad(unInmueble.getAntiguedad());
		inmueble.setDormitorios(unInmueble.getDormitorios());
		inmueble.setHorizontal(unInmueble.getHorizontal());
		inmueble.setGaraje(unInmueble.getGaraje());
		inmueble.setPatio(unInmueble.getPatio());
		inmueble.setPiscina(unInmueble.getPiscina());
		inmueble.setAguaCorriente(unInmueble.getAguaCorriente());
		inmueble.setGas(unInmueble.getGas());
		inmueble.setTelefono(unInmueble.getTelefono());
		inmueble.setLavadero(unInmueble.getLavadero());
		inmueble.setPavimento(unInmueble.getPavimento());
		inmueble.setCloaca(unInmueble.getCloaca());
		inmueble.setAguaCaliente(unInmueble.getAguaCaliente());
		inmueble.setObservaciones(unInmueble.getObservaciones());
		inmueble.setFechaDeCarga(unInmueble.getFechaDeCarga());
		inmueble.setEstado(unInmueble.getEstado());
		
		daoInmueble.guardarInmueble(inmueble);
	}
	// OBTIENE EL INMUEBLE POR EL ID
	public Inmueble getById(Integer idInmueble) {
		return daoInmueble.getById(idInmueble);
	}
	//  MODIFICA LOS DATOS DEL INMUEBLE Y SE ACTUALIZA EN LA BASE DE DATOS
	public void modificarInmueble(Integer idInmueble) {
		Inmueble inmueble = this.getById(idInmueble);

		daoInmueble.modificarInmueble(inmueble);
	}
	
	//SE BUSCA EL INMUEBLE SEGUN LOS DATOS PASADOS POR PARAMETRO
	public List<Inmueble> buscarInmueble(String barrio, String precioMax, String precioMin, Integer dormitorios,
			String provincia, String localidad, String tipoInmueble) {
		
		return daoInmueble.buscarInmuebles(barrio,precioMax, precioMin, dormitorios, provincia, localidad, tipoInmueble);
	}

	public void ordenarInmuebles(List<Inmueble> inmuebles) {
	
	}
	// SE ELIMINA EL INMUEBLE DE LA BASE DE DATOS
	public void eliminarInmueble(Inmueble inmueble){
		daoInmueble.eliminarInmueble(inmueble);
	}
	
	//	VERIFICA LONGITUD DE LOS CAMPOS
	public Boolean verificarLongitudCampos(Inmueble inmueble) {
		
		if(inmueble.getNumero().length() > 15 || inmueble.getPiso().length() > 15 ) {
			return false;
		}
		
		return true;
		
	}
	
	public Boolean verificarValoresNegativos(Inmueble inmueble) {
		
		if(inmueble.getAntiguedad()>=0 && inmueble.getDormitorios() >= 0 && 
		   inmueble.getLongFondo()>0 && inmueble.getLongFrente()>0 && 
		   inmueble.getPrecio()>0 && inmueble.getSuperficie()>0  && 
		   inmueble.getBanio()>=0) { 
			return true;
		}
		return false;
	}

}
