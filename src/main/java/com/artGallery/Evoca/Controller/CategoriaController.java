package com.artGallery.Evoca.Controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artGallery.Evoca.Model.CategoriaModel;
import com.artGallery.Evoca.Service.CategoriaService;

@RestController
@RequestMapping(value = "/api/v1")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping(value="/categoria")
    public ResponseEntity<Object> crearCategoria(@RequestBody CategoriaModel categoria) {
        CategoriaModel nuevaCategoria = categoriaService.insertarCategoria(categoria);
        return new ResponseEntity<>(nuevaCategoria, HttpStatus.CREATED);
    }

    @GetMapping(value="/categoria")
    public ResponseEntity<Object> obtenerCategorias() {
        List<CategoriaModel> categorias = categoriaService.obtenerCategorias();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    @GetMapping(value="/categoria/{id}")
    public ResponseEntity<Object> obtenerCategoriaPorId(@PathVariable int id) {
        CategoriaModel categoria = categoriaService.obtenerCategoriaPorId(id);
        if (categoria != null) {
            return new ResponseEntity<>(categoria, HttpStatus.OK);
        } else {
            Map<String, Object> response = new HashMap<>();
            response.put("mensaje", "La categoría con el ID " + id + " no existe");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    // Otros métodos del controlador según las necesidades
}