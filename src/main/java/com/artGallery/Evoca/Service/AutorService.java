package com.artGallery.Evoca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artGallery.Evoca.Model.AutorModel;
import com.artGallery.Evoca.Repository.IAutorRepository;

@Service
public class AutorService {

    @Autowired
    private IAutorRepository autorRepository;

    public AutorModel createAutor(AutorModel autor) {
        return autorRepository.save(autor);
    }

    public List<AutorModel> getAllAutores() {
        return autorRepository.findAll();
    }

    public AutorModel getAutorById(int id) {
        return autorRepository.findById(id).orElse(null);
    }

    public void deleteAutor(AutorModel autor) {
        autorRepository.delete(autor);
    }
}
