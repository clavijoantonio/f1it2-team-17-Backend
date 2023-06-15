package com.artGallery.Evoca.Model;



import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name= "usuario")
public class userModel {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private Long idUsuario;
	@Column
    private String nombre;
	@Column
    private String apellido;
	@Column
    private String documento;
	@Column
    private String telefono;
	@Column
    private String direccion;
	@Column
    private String Email;
	@Column
    private String contraseña;
	@Column
    private int idRol;

	public userModel() {
		super();
	}

	

	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
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

}


