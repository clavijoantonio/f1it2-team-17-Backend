package com.artGallery.Evoca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artGallery.Evoca.Model.FacturaModel;
import com.artGallery.Evoca.Model.ObraModel;


public interface IFacturaRepository extends JpaRepository<FacturaModel,Long>{

}
