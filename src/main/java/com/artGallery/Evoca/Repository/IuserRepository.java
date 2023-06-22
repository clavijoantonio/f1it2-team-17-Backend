package com.artGallery.Evoca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.artGallery.Evoca.Model.userModel;

public interface IuserRepository extends JpaRepository<userModel,Long>{

}
