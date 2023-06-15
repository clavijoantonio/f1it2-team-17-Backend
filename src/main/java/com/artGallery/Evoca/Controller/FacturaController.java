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

import com.artGallery.Evoca.Model.FacturaModel;
import com.artGallery.Evoca.Model.ObraModel;
import com.artGallery.Evoca.Model.userModel;
import com.artGallery.Evoca.Service.FacturaService;
import com.artGallery.Evoca.Service.ObraService;
import com.artGallery.Evoca.Service.userService;

@RestController
@RequestMapping(value="/api/v1")
public class FacturaController {
	
	@Autowired
	private FacturaService factserv ;
	
	@PostMapping(value="/factura")
	public ResponseEntity<Object> create(@RequestBody FacturaModel factura){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			factura = factserv.insertFactura(factura);  
			return new ResponseEntity<Object>(factura,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se Guardo la Factura", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@GetMapping(value="/factura/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id){ 
		try {
		    FacturaModel factura  = factserv.findById(id);
			return new ResponseEntity<Object>(factura,HttpStatus.OK);
		} 
		catch (Exception e) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("No se encontro la Factura", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}

	@GetMapping(value="/factura")
	public ResponseEntity<Object> get(){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<FacturaModel> list  = factserv.ListarFactura();
			return new ResponseEntity<Object>(list,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se encontraron Factura", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@DeleteMapping("/fatura/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try { 
		   FacturaModel factura = factserv.findById(id); 
		   factserv.delete(factura);
			map.put("deleted", true);
			return new ResponseEntity<Object>(map,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se elimino la factura", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@PutMapping("/factura/{id}")
	public ResponseEntity<Object> update(@RequestBody FacturaModel factura, @PathVariable Long id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			
			FacturaModel currentFactura = factserv.findById(id);
			
			currentFactura.setNumero_Factura(factura.getNumero_Factura());
			currentFactura.setForma_pago(factura.getForma_pago());
			currentFactura.setIva(factura.getIva());
			currentFactura.setTotal_Factura(factura.getTotal_Factura());
			
			FacturaModel res = factserv.insertFactura(factura);
			
			return new ResponseEntity<Object>(res,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se realizo la modificacion", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
}
