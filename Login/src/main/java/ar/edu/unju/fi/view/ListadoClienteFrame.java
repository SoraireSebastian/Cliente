package ar.edu.unju.fi.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unju.fi.dominio.Cliente;
import ar.edu.unju.fi.presenter.ClientePresenter;
import ar.edu.unju.fi.presenter.views.IviewCliente;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListadoClienteFrame extends JFrame implements IviewCliente {

	private JPanel contentPane;
	private ClientePresenter presenter;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListadoClienteFrame frame = new ListadoClienteFrame();
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
	public ListadoClienteFrame() {
		setTitle("Listado de Clientes\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 802, 366);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"id", "Nombre", "Apellido"
			}
		));
		scrollPane.setViewportView(table);
	}

	@Override
	public void agregarCliente(Cliente unCliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarClientes() {
		presenter.mostrarClientes();
		
	}
}
