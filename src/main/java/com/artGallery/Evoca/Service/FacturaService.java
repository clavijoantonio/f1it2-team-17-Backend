package com.artGallery.Evoca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artGallery.Evoca.Model.FacturaModel;
import com.artGallery.Evoca.Model.ObraModel;
import com.artGallery.Evoca.Repository.IFacturaRepository;
import com.artGallery.Evoca.Repository.IObraRepository;



@Service
public class FacturaService {

	@Autowired
	IFacturaRepository IFacturaRepor;
	
	public FacturaModel insertFactura (FacturaModel factura) {
		
		return IFacturaRepor.save(factura);
		
	}
	
	 public List<FacturaModel> ListarFactura() {
		return IFacturaRepor.findAll();
		 
	 }
	 
	public FacturaModel findById(Long id) {
		return IFacturaRepor.findById(id).orElse(null);
	}
	
	
	public void delete(FacturaModel factura) {
		IFacturaRepor.delete(factura);
		
	}
}
