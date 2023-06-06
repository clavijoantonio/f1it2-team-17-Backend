package com.artGallery.Evoca.Service;

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
}
