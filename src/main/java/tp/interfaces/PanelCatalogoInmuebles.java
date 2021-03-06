package tp.interfaces;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;

public class PanelCatalogoInmuebles extends JPanel {

	private JButton btnCancelar;
	private JButton btnComprar;
	private JTable table;
	private TableModel model;
	private InmuebleTableModel modeloTabla;
	
	String[] columnNames = {"Precio"};
	
	public PanelCatalogoInmuebles(LoginCliente login) {

		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cat?logo de Imuebles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(47, 31, 710, 305);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 33, 662, 227);
		panel.add(scrollPane);
		
		modeloTabla = new InmuebleTableModel(); 
		table = new JTable();
		table.setModel(modeloTabla);
		scrollPane.setViewportView(table);
		
		TableRowSorter<TableModel> ordenaPrecio = new TableRowSorter<TableModel>(modeloTabla);
		table.setRowSorter(ordenaPrecio);

		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(444, 357, 85, 21);
		/*btnCancelar.addActionListener(l -> {	
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Inicio vendedor");
			login.setContentPane(new PanelInicioVendedor(login));
			login.pack();
			login.revalidate();
			login.repaint();
		
		});*/
		add(btnCancelar);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setFont(new Font("Arial", Font.BOLD, 12));
		btnComprar.setBounds(315, 357, 85, 21);
		btnComprar.addActionListener(l -> {
//			login.setMinimumSize(new Dimension(670, 340));
//			login.setLocation(300, 70);
			login.setTitle("Comprobante de compra");
			login.setContentPane(new PanelVentaInmueble(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		add(btnComprar);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.setFont(new Font("Arial", Font.BOLD, 12));
		btnReservar.setBounds(189, 356, 96, 21);
		btnReservar.addActionListener(l -> {
			login.setTitle("Reserva de Inmueble");
			login.setContentPane(new PanelGenerarReserva(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		add(btnReservar);
		
	}
	
	public void set_table() {
		
	}
}
