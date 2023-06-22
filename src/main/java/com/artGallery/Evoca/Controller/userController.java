package com.artGallery.Evoca.Controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artGallery.Evoca.Model.userModel;
import com.artGallery.Evoca.Service.userService;

@RestController
@RequestMapping(value="/api/v1/usuario")
public class userController {
	
	@Autowired
	private userService userserv;
	
	@PostMapping
    public userModel insertUser (@RequestBody userModel user) {
		
		return this.userserv.insertUsuario(user);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id){ 
		try {
			userModel data  = userserv.findById(id);
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		} 
		catch (Exception e) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}

	@GetMapping
	public List<userModel> allPersons(){
		return userserv.verUsuarios();
	}
}
