package tp.interfaces;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelListaPropietario extends JPanel {

	private JTable table;
	private PropietarioTableModel modeloTabla;
	private JTable table_1;
	
	public PanelListaPropietario(Login login) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Propietarios");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(335, 30, 177, 40);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 100, 599, 292);
		add(scrollPane);
		
		modeloTabla = new PropietarioTableModel();
		table_1 = new JTable();
		table_1.setModel(modeloTabla);
		scrollPane.setViewportView(table_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 11));
		btnCancelar.setBounds(502, 425, 89, 23);
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
		btnBaja.setBounds(270, 425, 89, 23);
		btnBaja.addActionListener(l -> {
			int n = JOptionPane.showConfirmDialog( null, "Desea dar de baja al propietario?", "Mensaje", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "El propietario fue borrado con exito!");				
			}
		});
		add(btnBaja);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Arial", Font.BOLD, 11));
		btnModificar.setBounds(388, 425, 89, 23);
		btnModificar.addActionListener(l -> {
			login.setMinimumSize(new Dimension(900, 620));
			login.setLocation(300, 70);
			login.setTitle("Modificar propietario");
			login.setContentPane(new PanelModificacionPropietario(login));
			login.pack();
			login.revalidate();
			login.repaint();
			
		});
		add(btnModificar);
		
		

	}
}
