package com.artGallery.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artGallery.Model.userModel;
import com.artGallery.Service.userService;





@RestController
@RequestMapping("/galeria")
public class userController {

	@Autowired
	private userService userServ;
	
	@PostMapping
	public userModel insertUser(@RequestBody userModel user) {
		
		
		return this.userServ.insertUsuario(user);
		
	}
}
