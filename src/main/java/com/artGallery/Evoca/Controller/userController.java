package com.artGallery.Evoca.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artGallery.Evoca.Model.userModel;
import com.artGallery.Evoca.Service.userService;

@RestController
@RequestMapping("/galeria")
public class userController {
	
	@Autowired
	private userService userserv;
	
	@PostMapping
    public userModel insertUser (@RequestBody userModel user) {
		
		return this.userserv.insertUsuario(user);
	}

}
