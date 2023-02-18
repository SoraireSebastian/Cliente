package ar.edu.unju.fi.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ar.edu.unju.fi.dominio.Cliente;
import ar.edu.unju.fi.presenter.ClientePresenter;
import ar.edu.unju.fi.presenter.views.IviewCliente;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class ClienteFrame extends JFrame implements IviewCliente {

	private JPanel contentPane;
	private ClientePresenter clientePresenter;
	private Cliente unCliente;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JTextField textCelular;
	private JTextField textEmail;
	private JTextField textFactura;
	private JTextField textDni;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteFrame frame = new ClienteFrame();
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
	public ClienteFrame() {
		setTitle("Datos  de Cliente");
		ClientePresenter clientePresenter = new ClientePresenter(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 11, 151, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(171, 13, 60, 17);
		contentPane.add(lblNewLabel);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(10, 57, 151, 20);
		contentPane.add(textApellido);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(10, 101, 151, 20);
		contentPane.add(textDireccion);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(171, 59, 60, 17);
		contentPane.add(lblApellido);
		
		JLabel lblNewLabel_1_1 = new JLabel("Direccion");
		lblNewLabel_1_1.setBounds(171, 103, 60, 17);
		contentPane.add(lblNewLabel_1_1);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(10, 147, 151, 20);
		contentPane.add(textTelefono);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telefono");
		lblNewLabel_1_1_1.setBounds(171, 149, 60, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		textCelular = new JTextField();
		textCelular.setColumns(10);
		textCelular.setBounds(10, 193, 151, 20);
		contentPane.add(textCelular);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(10, 244, 151, 20);
		contentPane.add(textEmail);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Celular");
		lblNewLabel_1_1_1_1.setBounds(171, 196, 60, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Email");
		lblNewLabel_1_1_1_2.setBounds(171, 247, 60, 17);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textFactura = new JTextField();
		textFactura.setColumns(10);
		textFactura.setBounds(338, 11, 151, 20);
		contentPane.add(textFactura);
		
		textDni = new JTextField();
		textDni.setColumns(10);
		textDni.setBounds(338, 57, 151, 20);
		contentPane.add(textDni);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Tipo de Factura");
		lblNewLabel_1_1_1_2_1.setBounds(499, 14, 110, 17);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("DNI");
		lblNewLabel_1_1_1_2_2.setBounds(499, 60, 60, 17);
		contentPane.add(lblNewLabel_1_1_1_2_2);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente unCliente= new Cliente(textNombre.getText(),textApellido.getText(),textDireccion.getText(),textTelefono.getText(),textCelular.getText(),textEmail.getText(),textFactura.getText(),textDni.getText());
				agregarCliente(unCliente);
			}
		});
		btnGuardar.setBounds(269, 296, 104, 23);
		contentPane.add(btnGuardar);
	}

	@Override
	public void agregarCliente(Cliente unCliente) {
		ClientePresenter clientePresenter = new ClientePresenter();
		clientePresenter.nuevoCliente(unCliente);
	}

	@Override
	public void mostrarClientes() {
		// TODO Auto-generated method stub
		
		
	}
}
