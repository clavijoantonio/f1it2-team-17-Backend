package com.artGallery.Evoca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.artGallery.Evoca.Model.CategoriaModel;

public interface ICategoriaRepository extends JpaRepository<CategoriaModel, Integer> {
    // Aquí puedes agregar métodos personalizados de consulta si los necesitas
}
