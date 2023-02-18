package ar.edu.unju.fi.presenter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import ar.edu.unju.fi.dao.ClienteDAO;
import ar.edu.unju.fi.dao.impl.ClienteDAOImpl;
import ar.edu.unju.fi.dominio.Cliente;
import ar.edu.unju.fi.presenter.views.IviewCliente;

public class ClientePresenter {
	private IviewCliente iviewCliente;
	private ClienteDAOImpl clienteDAOImpl;
	private Cliente clienteModel; 
	
	
	public ClientePresenter(IviewCliente iviewCliente) {
		this.iviewCliente = iviewCliente;
	}
	public ClientePresenter() {
		// TODO Auto-generated constructor stub
	}
	
	public void nuevoCliente(Cliente unCliente) {
		ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
		clienteDAOImpl.guardar(unCliente);
		JOptionPane.showMessageDialog(null, "Nuevo Cliente almacenado");
	}
	
	public void mostrarClientes() {
		ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
		clienteDAOImpl.mostrarTodo();
		
	}
	
}
