package com.artGallery.Evoca.Controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artGallery.Evoca.Model.ObraModel;
import com.artGallery.Evoca.Model.userModel;
import com.artGallery.Evoca.Service.ObraService;
import com.artGallery.Evoca.Service.userService;

@RestController
@RequestMapping(value="/api/v1")
public class ObraController {
	
	@Autowired
	private ObraService obraserv ;
	
	@PostMapping(value="/obra")
	public ResponseEntity<Object> create(@RequestBody ObraModel obra){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			obra = obraserv.insertObra(obra);  
			return new ResponseEntity<Object>(obra,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se Guardo la obra", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@GetMapping(value="/obra/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id){ 
		try {
			ObraModel obra  = obraserv.findById(id);
			return new ResponseEntity<Object>(obra,HttpStatus.OK);
		} 
		catch (Exception e) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("No se encontro la obra", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}

	@GetMapping(value="/obra")
	public ResponseEntity<Object> get(){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<ObraModel> list  = obraserv.ListarObra();
			return new ResponseEntity<Object>(list,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se encontraron obras", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@DeleteMapping("/obra/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try { 
			ObraModel obra = obraserv.findById(id); 
			obraserv.delete(obra);
			map.put("deleted", true);
			return new ResponseEntity<Object>(map,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se elimino la obra", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@PutMapping("/obra/{id}")
	public ResponseEntity<Object> update(@RequestBody ObraModel obra, @PathVariable Long id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			
			ObraModel currentObra = obraserv.findById(id);
			
			currentObra.setTitulo(obra.getTitulo());
			currentObra.setPrecio(obra.getPrecio());
			currentObra.setMedio(obra.getMedio());
			currentObra.setDimensiones(obra.getDescripcion());
			currentObra.setDescripcion(obra.getDescripcion());
			currentObra.setAño(obra.getAño());
			
			ObraModel res = obraserv.insertObra(obra);
			
			return new ResponseEntity<Object>(res,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
}
