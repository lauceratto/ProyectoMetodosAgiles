package tp.interfaces;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import tp.dominio.Cliente;


public class ClienteTableModel extends AbstractTableModel {
	
//	public ClienteTableModel(List<Cliente> object) {
//		this.datosTransp =  object;
//	}
	public ClienteTableModel() {
	
	}
	private String[] nombreColumnas = {"Nombre", "Apellido", "DNI", "Telefono"};
	public List<Cliente> datosTransp;
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
//		Cliente t = datosTransp.get(rowIndex);
//		
//		switch(columnIndex) {
//		case 0: 
//			return t.getNombre();
//		case 1: 
//			return t.getApellido();
//		case 2:
//			return t.getDni();
//		case 3:
//			return t.getTelefono();
//		}
		return null;
	}

}