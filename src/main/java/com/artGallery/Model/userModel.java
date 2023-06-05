package com.artGallery.Model;

import jakarta.persistence.*;


@Entity
@Table(name= "usuario")
public class userModel {
	
	
    public userModel(Long idUsuario, String nombre, String apellido, String documento, String telefono,
			String direccion, String usuario, String contraseña, int idRol) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.telefono = telefono;
		this.direccion = direccion;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.idRol = idRol;
	}
    
    
	public userModel() {
		super();
	}

	

	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public int getIdRol() {
		return idRol;
	}


	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
    private String nombre;
    private String apellido;
    private String documento;
    private String telefono;
    private String direccion;
    private String usuario;
    private String contraseña;
    private int idRol;
}
