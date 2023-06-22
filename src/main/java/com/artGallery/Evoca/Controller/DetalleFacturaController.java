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

import com.artGallery.Evoca.Model.DetalleFacturaModel;
import com.artGallery.Evoca.Model.FacturaModel;
import com.artGallery.Evoca.Model.ObraModel;
import com.artGallery.Evoca.Model.userModel;
import com.artGallery.Evoca.Service.DetalleFacturaService;
import com.artGallery.Evoca.Service.FacturaService;
import com.artGallery.Evoca.Service.ObraService;
import com.artGallery.Evoca.Service.userService;

@RestController
@RequestMapping(value="/api/v1/detallefactura")
public class DetalleFacturaController {
	
	@Autowired
	private DetalleFacturaService detallefactserv ;
	
	@PostMapping
	public ResponseEntity<Object> create(@RequestBody DetalleFacturaModel detallefactura){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			detallefactura = detallefactserv.insertDetalleFactura(detallefactura);  
			return new ResponseEntity<Object>(detallefactura,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se Guardo el detalle Factura", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id){ 
		try {
		    DetalleFacturaModel factura  = detallefactserv.findById(id);
			return new ResponseEntity<Object>(factura,HttpStatus.OK);
		} 
		catch (Exception e) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("No se encontro la detalle Factura", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}

	@GetMapping
	public ResponseEntity<Object> get(){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<DetalleFacturaModel> list  = detallefactserv.ListarDetalleFactura();
			return new ResponseEntity<Object>(list,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se encontraron detalle Factura", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable Long id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try { 
		   DetalleFacturaModel factura = detallefactserv.findById(id); 
		   detallefactserv.delete(factura);
			map.put("deleted", true);
			return new ResponseEntity<Object>(map,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se elimino la factura", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@RequestBody DetalleFacturaModel detallefactura, @PathVariable Long id){ 
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			
			DetalleFacturaModel currentDetalleFactura = detallefactserv.findById(id);
			
			currentDetalleFactura.setCantidad(detallefactura.getCantidad());
			currentDetalleFactura.setValor_Total(detallefactura.getValor_Total());
			
			DetalleFacturaModel res = detallefactserv.insertDetalleFactura(detallefactura);
			
			return new ResponseEntity<Object>(res,HttpStatus.OK);
		} 
		catch (Exception e) {
			map.put("No se realizo la modificacion", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
}
