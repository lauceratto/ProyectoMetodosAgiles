package tp.interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCatalogoInmuebles extends JPanel {

	private JButton btnCancelar;
	private JButton btnComprar;
	private JTable table;
	private TableModel model;
	
	private String[] cabecera = {"Foto", "Código", "Tipo", "Ubicación", "Cant. baños", "Cant. dormitorios", "Garaje", "Patio", "Superficie", "Precio"};
	private String[][] datos = {{"f","","","","","","","","",""},
							    {"","","","","","","f","","",""}};
	
	public PanelCatalogoInmuebles() {

		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(47, 31, 710, 380);
		add(panel);
		panel.setLayout(null);
		
		model = new DefaultTableModel(datos, cabecera);
		table = new JTable(model);
		table.setBounds(34, 46, 640, 296);
		
		//JScrollPane js = new JScrollPane(table);
		add(new JScrollPane(table));
		//panel.add(table);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(690, 421, 85, 21);
		add(btnCancelar);
		
		btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FrameComprarInmueble frame = new FrameComprarInmueble();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new JFrame();
				
			}
		});
		btnComprar.setFont(new Font("Arial", Font.BOLD, 12));
		btnComprar.setBounds(595, 421, 85, 21);
		add(btnComprar);
		
	}
	
	public void set_table() {
		
	}
}
