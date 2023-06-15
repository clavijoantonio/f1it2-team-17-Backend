package com.artGallery.Evoca.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artGallery.Evoca.Model.ObraModel;
import com.artGallery.Evoca.Repository.IObraRepository;



@Service
public class ObraService {

	@Autowired
	IObraRepository IobraRepor;
	
	public ObraModel insertObra (ObraModel obra) {
		
		return IobraRepor.save(obra);
		
	}
	
	 public List<ObraModel> ListarObra() {
		return IobraRepor.findAll();
		 
	 }
	 
	public ObraModel findById(Long id) {
		return IobraRepor.findById(id).orElse(null);
	}
	
	
	public void delete(ObraModel obra) {
		IobraRepor.delete(obra);
		
	}
}
