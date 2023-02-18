package ar.edu.unju.fi.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unju.fi.dao.impl.ClienteDAOImpl;
import ar.edu.unju.fi.dominio.Cliente;

@SuppressWarnings("unchecked")
public class PruebaCliente {
	private static EntityManager manager;
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("Cliente");
	private static ClienteDAOImpl Cliente;
	private static Cliente uncliente;
	private static long id=7;
	public static void main(String[] args) {
		//manager=emf.createEntityManager();
		//manager.createQuery("FROM Cliente").getResultList() ME DEVUELVE UNA LISTA CON TODOS LOS REGISTROS DE LA BD Y LO ALMACENO EN  LA LISTA CLIENTES PARA LUEGO SER MOSTRADA  
		//List<Cliente> clientes=manager.createQuery("FROM Cliente").getResultList();
		//agregar();
		//modificar(id);
		//mostrarTodo();
		//modificar(id);
		//eliminar(id);
		//mostrarTodo2();
		ClienteDAOImpl Cliente=new ClienteDAOImpl();
		
		System.out.println(	Cliente.buscarXId(id));
		
	}
	
    ////////////////////////////////////////
	public static void mostrarTodo() {
			manager = emf.createEntityManager();
			List<Cliente> clientes=manager.createQuery("FROM Cliente").getResultList();
			System.out.println("La cantidad de clientes en la  base de datos es:  "+clientes.size());
			for(Cliente cli:clientes) {
			System.out.println(cli.toString());
			manager.close();
		}
			
	}
	
	/////////////////////////////////////////
	/**
	 * METODO PARA MODIFICAR UN CAMPO EN LA BD BUSCA Y MODIFICA EL REGISTRO SOLICITADO 
	 * PASANDO POR PARTAMETRO ID DEL REGISTRO DE LA BD
	 * @param id ES LA PRIMARY KEY DEL REGISTRO SOLICITADO
	 */
	public static void modificar(long id) {
		//LE ASIGNO A CADA METODO SU PROPIO ENTITYMANAGER PARA CONHECTARSE A LA BD 
		manager= emf.createEntityManager();
		manager.getTransaction().begin();
		
		//BUSCA POR TIPO DE CLASE (Cliente) Y ID 
		Cliente cli = manager.find(Cliente.class, id);
		manager.merge(cli);
		cli.setNombre("Sebastian");
		manager.merge(cli);
		manager.getTransaction().commit();
		//SI SE USA manager.close() NO SE PODRA MOSTRAR LA LISTA YA QUE ESTAMOS CERRANDO EL MANAGER
		manager.close();
		
	}
	////////////////////////////////////////
	public static void mostrarTodo2() {
		manager = emf.createEntityManager();
		List<Cliente> clientes=manager.createQuery("FROM Cliente").getResultList();
		System.out.println("La cantidad de clientes en la  base de datos es:  "+clientes.size());
		for(Cliente cli:clientes) {
		System.out.println(cli.toString());
		manager.close();
	}
		
}
	////////////////////////////////////////
	public static void agregar() {
		//LE ASIGNO A CADA METODO SU PROPIO GESTOR DE PERSISTENCIA ENTITYMANAGER PARA CONHECTARSE A LA BD
		manager=emf.createEntityManager();
		
		Cliente e = new Cliente("Ricardo","Soraire","Rinconada","1234","42255","ricky@gmail.com","A","12345"); 
		//REALIZAMOS UNA TANSCACCION CON LA BD EN ESTE CASO SE DA DE ALTA UN NUEVO CLIENTE
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		//manager.close();
	}
	//////////////////////////////////////////
	/**
	 * METODO PARA ELIMINAR UN REGISTRO EN LA BD
	 * @param id ES EL PRIMARY KEY DEL REGISTRO A ELIMINAR DE LA BD
	 */
	public static void eliminar(long id) {
		manager=emf.createEntityManager();
		manager.getTransaction().begin();
		//BUSCA EL REGISTRO MEDIANTE EL ID Y SU TIPO DE CLASE SE ASIGNA A UNA VARIABLE DE TIPO CLIENYTE PARA PASAR COMO PARAMETRO 
		Cliente cli= manager.find(Cliente.class, id);
		//RECIBE COMO PARAMETRO EL REGISTRO ENCONTRADO MEDIANTE SU ID Y LO ELIMINA DE LA BD
		manager.remove(cli);
		manager.getTransaction().commit();
		System.out.println("Cliente eliminado");
	}
	

}
