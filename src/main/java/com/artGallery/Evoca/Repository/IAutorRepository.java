package com.artGallery.Evoca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.artGallery.Evoca.Model.AutorModel;

public interface IAutorRepository extends JpaRepository<AutorModel, Integer> {

    // Aquí puedes agregar métodos personalizados de consulta si los necesitas

}