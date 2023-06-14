package com.artGallery.Evoca.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Categoria")
    private int id_Categoria;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    public CategoriaModel() {
        super();
    }
   
	public int getId_Categoria() {
		return id_Categoria;
	}




	public void setId_Categoria(int id_Categoria) {
		this.id_Categoria = id_Categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	



	
}

