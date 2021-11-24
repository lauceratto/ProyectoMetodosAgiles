package tp.interfaces;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import tp.dominio.Cliente;
import tp.dominio.Propietario;

public class PropietarioTableModel extends AbstractTableModel{
	public PropietarioTableModel() {
		
	}

	private String[] nombreColumnas = {"Nombre", "Apellido", "DNI", "Telefono","Email", "Provincia", "Localidad", "Calle","Nro", "Dpto", "Piso"};
	public List<Propietario> datos;
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.nombreColumnas.length;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getColumnName(int col) {
       
		return nombreColumnas[col];
    }
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return null;
	}
}
