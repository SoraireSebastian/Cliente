package ar.edu.unju.fi.test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dao.ClienteDAO;
import ar.edu.unju.fi.dao.impl.ClienteDAOImpl;
import ar.edu.unju.fi.dominio.Cliente;

public class ClienteTestt {
	Cliente unCliente;
	ClienteDAO clienteDAO;
	EntityManager manager;
	ClienteDAOImpl clienteImpl;
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("Cliente");
	
	@Test
	@DisplayName("Agregar Usuario")
	void altaClienteTest() {
		Cliente unCliente = new Cliente("Sofia","Soraire","PROVIDENCIA","15513283","3888854123","@ARES","FACTURA A","388812345");
		manager= emf.createEntityManager();
		ClienteDAOImpl clienteImpl = new ClienteDAOImpl();
	    clienteImpl.guardar(unCliente);
		//manager.getTransaction().begin();
		//manager.persist(unCliente);
		//manager.getTransaction().commit();
		//clienteDAO.guardar(unCliente);
		System.out.println("Configurando en SetUp...");
	}
	
	

}
