package com.artGallery.Evoca.Model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    private String dimensiones;
	@Column
    private String año;
	@Column
    private String medio;
	@Column
    private double precio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_autor")
    private AutorModel Autor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_categoria")
    private CategoriaModel categoria;
	
	
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
    
	public AutorModel getAutor() {
		return Autor;
	}

	public void setAutor(AutorModel autor) {
		Autor = autor;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
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


