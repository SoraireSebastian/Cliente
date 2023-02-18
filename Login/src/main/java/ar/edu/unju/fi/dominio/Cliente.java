package ar.edu.unju.fi.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono_Fijo")
	private String telefonoFijo;
	
	@Column(name="celular")
	private String Celular;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="tipo_factura")
	private String  tipoFactura;

	public Cliente(String nombre, String apellido, String direccion, String telefonoFijo, String celular, String email,
			String tipoFactura, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefonoFijo = telefonoFijo;
		this.Celular = celular;
		this.Email = email;
		this.tipoFactura = tipoFactura;
		this.dni=dni;
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTipoFactura() {
		return tipoFactura;
	}

	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
}
