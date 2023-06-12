package com.artGallery.Evoca.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name= "obra")
public class ObraModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Obra")
	private Long id_Obra;
	@Column
    private String titulo;
	@Column
    private String descripcion;
	@Column
    private int id_Autor;
	@Column
    private String dimensiones;
	@Column
    private int id_categoria;
	@Column
    private String año;
	@Column
    private String medio;
	@Column
    private double precio;
	
	public ObraModel() {
		super();
	}

	public Long getId_Obra() {
		return id_Obra;
	}

	public void setId_Obra(Long id_Obra) {
		this.id_Obra = id_Obra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_Autor() {
		return id_Autor;
	}

	public void setId_Autor(int id_Autor) {
		this.id_Autor = id_Autor;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
	
	
	

	
	
}


