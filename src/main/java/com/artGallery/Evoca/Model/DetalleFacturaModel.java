package com.artGallery.Evoca.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="detallefactura")
public class DetalleFacturaModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Detalle_Factura")
	private Long id_Detalle_Factura;
	@Column
	private int id_Obra;
    @Column
   	private int cantidad;
    @Column
   	private double valor_Total;
    @Column
   	private int id_Factura;
    
   /* @ManyToOne(cascade= {CascadeType.PERSIST})
   	@JoinColumn(name="id_Factura",nullable = false)
    private FacturaModel factura;*/
    
    
	public Long getId_Detalle_Factura() {
		return id_Detalle_Factura;
	}
	
	public int getId_Factura() {
		return id_Factura;
	}

	public void setId_Factura(int id_Factura) {
		this.id_Factura = id_Factura;
	}

	public void setId_Detalle_Factura(Long id_Detalle_Factura) {
		this.id_Detalle_Factura = id_Detalle_Factura;
	}
	public int getId_Obra() {
		return id_Obra;
	}
	public void setId_Obra(int id_Obra) {
		this.id_Obra = id_Obra;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getValor_Total() {
		return valor_Total;
	}
	public void setValor_Total(double valor_Total) {
		this.valor_Total = valor_Total;
	}
	/*public FacturaModel getFactura() {
		return factura;
	}
	public void setFactura(FacturaModel factura) {
		this.factura = factura;
	}*/
    
    
  
}
