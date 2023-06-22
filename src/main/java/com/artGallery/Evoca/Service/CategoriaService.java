package com.artGallery.Evoca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artGallery.Evoca.Model.CategoriaModel;
import com.artGallery.Evoca.Repository.ICategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private ICategoriaRepository categoriaRepository;

    public CategoriaModel insertarCategoria(CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<CategoriaModel> obtenerCategorias() {
        return categoriaRepository.findAll();
    }

    public CategoriaModel obtenerCategoriaPorId(int id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    // Otros métodos del servicio según las necesidades
}