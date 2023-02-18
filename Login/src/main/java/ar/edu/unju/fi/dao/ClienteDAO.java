package ar.edu.unju.fi.dao;

import java.util.List;

import ar.edu.unju.fi.dominio.Cliente;

public interface ClienteDAO {
	
	List<Cliente> mostrarTodo();
	
	void guardar(Cliente unCliente);
	
	void eliminar(long id);
	
	void modificar(Cliente unCliente);
	
	List<Cliente> buscarXNombre(String nombre);
	
	Cliente buscarXId(long idCliente);
	
}
