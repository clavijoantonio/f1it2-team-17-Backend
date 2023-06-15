package com.artGallery.Evoca.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artGallery.Evoca.Model.AutorModel;
import com.artGallery.Evoca.Service.AutorService;

@RestController
@RequestMapping(value="/api/v1")
public class AutorController {
    
    @Autowired
    private AutorService autorService;
    
    @PostMapping(value="/autor")
    public ResponseEntity<Object> createAutor(@RequestBody AutorModel autor) {
        try {
            AutorModel createdAutor = autorService.createAutor(autor);
            return new ResponseEntity<>(createdAutor, HttpStatus.OK);
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error creating autor");
            errorResponse.put("error", e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping(value="/autor")
    public ResponseEntity<Object> getAllAutores() {
        try {
            List<AutorModel> autores = autorService.getAllAutores();
            return new ResponseEntity<>(autores, HttpStatus.OK);
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error getting autores");
            errorResponse.put("error", e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping(value="/autor/{id}")
    public ResponseEntity<Object> getAutorById(@PathVariable int id) {
        try {
            AutorModel autor = autorService.getAutorById(id);
            if (autor != null) {
                return new ResponseEntity<>(autor, HttpStatus.OK);
            } else {
                Map<String, Object> notFoundResponse = new HashMap<>();
                notFoundResponse.put("message", "Autor not found");
                return new ResponseEntity<>(notFoundResponse, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error getting autor");
            errorResponse.put("error", e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @DeleteMapping("/autor/{id}")
    public ResponseEntity<Object> deleteAutor(@PathVariable int id) {
        try {
            AutorModel autor = autorService.getAutorById(id);
            if (autor != null) {
                autorService.deleteAutor(autor);
                Map<String, Object> successResponse = new HashMap<>();
                successResponse.put("message", "Autor deleted successfully");
                return new ResponseEntity<>(successResponse, HttpStatus.OK);
            } else {
                Map<String, Object> notFoundResponse = new HashMap<>();
                notFoundResponse.put("message", "Autor not found");
                return new ResponseEntity<>(notFoundResponse, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("message", "Error deleting autor");
            errorResponse.put("error", e.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
