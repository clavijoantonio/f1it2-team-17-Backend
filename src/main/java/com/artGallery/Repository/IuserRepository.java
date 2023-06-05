package com.artGallery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artGallery.Model.userModel;

@Repository
public interface IuserRepository extends JpaRepository <userModel, Long>{

	
}
