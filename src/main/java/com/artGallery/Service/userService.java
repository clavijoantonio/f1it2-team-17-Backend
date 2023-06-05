package com.artGallery.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artGallery.Model.userModel;
import com.artGallery.Repository.IuserRepository;

@Service
public class userService {

	@Autowired
	IuserRepository userRepor;
	
	public userModel insertUsuario (userModel user) {
		
		return userRepor.save(user);
		
	}
}
