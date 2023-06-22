package com.artGallery.Evoca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artGallery.Evoca.Model.DetalleFacturaModel;
import com.artGallery.Evoca.Model.FacturaModel;
import com.artGallery.Evoca.Model.ObraModel;
import com.artGallery.Evoca.Repository.IDetalleFacturaRepository;
import com.artGallery.Evoca.Repository.IFacturaRepository;
import com.artGallery.Evoca.Repository.IObraRepository;



@Service
public class DetalleFacturaService {

	@Autowired
	IDetalleFacturaRepository IDetalleFacturaRepor;
	
	public DetalleFacturaModel insertDetalleFactura (DetalleFacturaModel detallefactura) {
		
		return IDetalleFacturaRepor.save( detallefactura);
		
	}
	
	 public List<DetalleFacturaModel> ListarDetalleFactura() {
		return IDetalleFacturaRepor.findAll();
		 
	 }
	 
	public DetalleFacturaModel findById(Long id) {
		return IDetalleFacturaRepor.findById(id).orElse(null);
	}
	
	
	public void delete(DetalleFacturaModel detallefactura) {
		IDetalleFacturaRepor.delete(detallefactura);
		
	}
}
