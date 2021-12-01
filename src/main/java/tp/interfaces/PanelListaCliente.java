package tp.interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import tp.App.AppVendedor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class PanelListaCliente extends JPanel {

	private JTable table;
	private ClienteTableModel modeloTabla;
	private JTable table_1;
	
	public PanelListaCliente(Login login) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Clientes");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(335, 30, 177, 40);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 100, 599, 292);
		add(scrollPane);
		
		modeloTabla = new ClienteTableModel();
		table_1 = new JTable();
		table_1.setModel(modeloTabla);
		scrollPane.setViewportView(table_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 11));
		btnCancelar.setBounds(406, 425, 89, 23);
		btnCancelar.addActionListener(l -> {
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Inicio vendedor");
			login.setContentPane(new PanelInicioVendedor(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		add(btnCancelar);
		
		JButton btnBaja = new JButton("Baja");
		btnBaja.setFont(new Font("Arial", Font.BOLD, 11));
		btnBaja.setBounds(292, 425, 89, 23);
		btnBaja.addActionListener(l -> {
			int n = JOptionPane.showConfirmDialog( null, "Desea dar de baja al cliente?", "Mensaje", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "El cliente fue borrado con exito!");				
			}
		});
		add(btnBaja);


	}

	
}
