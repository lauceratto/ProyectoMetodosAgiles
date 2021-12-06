package tp.interfaces;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import tp.dominio.Inmueble;

public class InmuebleTableModel extends AbstractTableModel {

	public InmuebleTableModel() {
		
	}
	
	private String[] nombreColumnas = {"Foto", "C�digo", "Tipo", "Ubicaci�n", "Ba�os", "Dormitorios", "Garaje", "Patio", "Superficie", "Precio"};
	
	public List<Inmueble> datos;
	
	@Override
	public int getRowCount() {
		return 0;
	}

	@Override
	public int getColumnCount() {
		return this.nombreColumnas.length;
	}

	public String getColumnName(int col) { 
		return nombreColumnas[col];
    }
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}

}
