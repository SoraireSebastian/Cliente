package ar.edu.unju.fi.dao.impl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import ar.edu.unju.fi.dao.ClienteDAO;
import ar.edu.unju.fi.dominio.Cliente;

public class ClienteDAOImpl implements ClienteDAO {
	EntityManager manager;
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Cliente");;
	
	
	@Override
	public List<Cliente> mostrarTodo() {
		manager = emf.createEntityManager();
		return manager.createQuery("from Cliente").getResultList();
	}
	
	@Override
	public void guardar(Cliente unCliente) {
		manager= emf.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(unCliente);
		manager.getTransaction().commit();
	}
	@Override
	public void eliminar(long id) {
		manager=emf.createEntityManager();
		manager.getTransaction().begin();
		Cliente unCliente = manager.find(Cliente.class, id);
		manager.remove(unCliente);
		manager.getTransaction().commit();
	}
	////////////////////////////////////////////////////////////////////////////
	@Override
	public void modificar(Cliente unCliente) {
		manager=emf.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(unCliente);
		manager.getTransaction().commit();
	}
	//////////////////////////////////////////////////////////////////////////////
	@Override
	public List<Cliente> buscarXNombre(String nombre) {
		manager=emf.createEntityManager();
		Query query =  manager.createQuery("from Cliente t where t.nombre like concat('%', :nombre, '%')");
		query.setParameter("nombre", nombre);
		return query.getResultList();
	}
	/////////////////////////////////////////////////////////////////////////////////
	@Override
	public Cliente buscarXId(long id) {
		manager=emf.createEntityManager();
		Cliente cli= manager.find(Cliente.class,id);
		return cli;
	} 
	
}
