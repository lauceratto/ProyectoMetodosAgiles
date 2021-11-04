package tp.interfaces;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import tp.App.AppVendedor;
import tp.dominio.Propietario;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PanelPropietarioLista extends JPanel {
	
	//CREAR PROPIETARIOS.
	Propietario propietario1 = new Propietario("Juan","palacios","email", 2345, "telefono", "calle", 12, "departamento","piso", "provincia", "localidad");
	Propietario propietario2 = new Propietario("pedro","figueroa","email", 2345, "telefono", "calle", 12, "departamento","piso", "provincia", "localidad");
	Propietario propietario3 = new Propietario("lucas","aguilera","email", 2345, "telefono", "calle", 12, "departamento","piso", "provincia", "localidad");
	Propietario propietario4 = new Propietario("Pepe","tato","email", 2345, "telefono", "calle", 12, "departamento","piso", "provincia", "localidad");

			ArrayList<Propietario> propietarios = new ArrayList<Propietario>();
			
	public PanelPropietarioLista(Login login) {
			
		JList<Propietario> listaPropietarios = new JList<Propietario>();
		listaPropietarios.setBorder(new LineBorder(new Color(0, 0, 0)));
		propietarios.add(propietario1);
		propietarios.add(propietario2);
		propietarios.add(propietario3);
		propietarios.add(propietario4);
		//Crear un objeto DefaultListModel
		DefaultListModel listModel = new DefaultListModel();
		//Recorrer el contenido del ArrayList
		for(int i=0; i<propietarios.size(); i++) {
		    //Añadir cada elemento del ArrayList en el modelo de la lista
		    listModel.add(i, propietarios.get(i).toString());
		}
		listaPropietarios.setModel(listModel);
		
		JLabel lblListaPropietarios = new JLabel("LISTA DE PROPIETARIOS:");
		lblListaPropietarios.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login.setMinimumSize(new Dimension(1000, 600));
				login.setLocation(300, 70);
				login.setTitle("Modificación Propietario");
				login.setContentPane(new PanelModificacionPropietario(login));
				login.pack();
				login.revalidate();
				login.repaint();
			}
		});
		btnModificar.setEnabled(false);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = JOptionPane.showConfirmDialog( null, "Desea eliminar este propietario?", "Mensaje", JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) {
					//PREGUNTAR METODO ELIMINAR PROPIETARIO.
					JOptionPane.showMessageDialog(null, "El propietario fue borrado con exito!");
				}
			}
		});
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(l -> {	
			login.setMinimumSize(new Dimension(670, 340));
			login.setLocation(300, 70);
			login.setTitle("Inicio vendedor");
			login.setContentPane(new PanelInicioVendedor(login));
			login.pack();
			login.revalidate();
			login.repaint();
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(52)
					.addComponent(lblListaPropietarios, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(52)
					.addComponent(listaPropietarios, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
					.addGap(57))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(52)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(317)
					.addComponent(btnAtras, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addComponent(lblListaPropietarios, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(listaPropietarios, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnModificar)
						.addComponent(btnEliminar))
					.addGap(16)
					.addComponent(btnAtras))
		);
		setLayout(groupLayout);

		//EVENTOS AL CLICKEAR UN PROPIETARIO DE LA LISTA.
		listaPropietarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnModificar.setEnabled(true);
				btnEliminar.setEnabled(true);
			}
		});
		
		
		
	}
}
