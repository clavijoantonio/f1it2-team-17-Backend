package com.artGallery.Evoca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artGallery.Evoca.Model.userModel;
import com.artGallery.Evoca.Repository.IuserRepository;


@Service
public class userService {

	@Autowired
	IuserRepository userRepor;
	
	public userModel insertUsuario (userModel user) {
		
		return userRepor.save(user);
		
	}
	 public List<userModel> verUsuarios() {
		return userRepor.findAll();
		 
	 }
	 
	public userModel findById(Long id) {
		return userRepor.findById(id).orElse(null);
	}
}
