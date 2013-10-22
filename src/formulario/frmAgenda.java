package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })

public class frmAgenda extends JFrame {
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtmail;
	private JTable tbtContactos;

	/**
	 * Launch the application.
	 */
	DefaultTableModel model;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAgenda frame = new frmAgenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmAgenda() {
		setTitle("Contactos Personales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 340);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(204, 0, 0)));
		panel.setBounds(10, 22, 295, 129);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 24, 68, 14);
		panel.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 49, 68, 14);
		panel.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 74, 68, 14);
		panel.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(10, 107, 68, 14);
		panel.add(lblEmail);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(88, 21, 146, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(88, 46, 146, 20);
		panel.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(88, 71, 146, 20);
		panel.add(txtTelefono);
		
		txtmail = new JTextField();
		txtmail.setColumns(10);
		txtmail.setBounds(88, 104, 146, 20);
		panel.add(txtmail);
				
		tbtContactos = new JTable();
		tbtContactos.setFillsViewportHeight(true);
		tbtContactos.setSurrendersFocusOnKeystroke(true);
		tbtContactos.setBounds(10, 174, 450, 110);
		
		getContentPane().add(tbtContactos);
	
		Desabilitar();
		JButton btnNuevo = new JButton("Nuevo");
		
		
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Habilitar();
			}
		});
		
		
		btnNuevo.setBounds(330, 22, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(330, 56, 89, 23);
		getContentPane().add(btnActualizar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(330, 90, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(330, 124, 89, 23);
		getContentPane().add(btnCancelar);
		LlenarTabla();
				
	}
	
	void Desabilitar() {
		txtNombre.setEnabled(false);
		txtDireccion.setEnabled(false);
		txtTelefono.setEnabled(false);
		txtmail.setEnabled(false);
		
	} 
	
	void Habilitar(){

		txtNombre.setEnabled(true);
		txtDireccion.setEnabled(true);
		txtTelefono.setEnabled(true);
		txtmail.setEnabled(true);
		txtNombre.requestFocus();
	}
	
	void LlenarTabla(){
	String[]titulos={"ID", "Nombre","Direccion", "Telefono", "E-mail"};
	model= new DefaultTableModel(null, titulos);
	tbtContactos.setModel(model);

	}
}
