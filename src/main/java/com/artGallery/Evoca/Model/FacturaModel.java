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
@Table(name="factura")
public class FacturaModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Factura")
	private Long id_Factura;
    @Column
	private String forma_pago;
    @Column
	private String numero_Factura;
    @Column
	private double iva;
    @Column
	private double total_Factura;
    @Column
   	private int id_Usuario;
    
   /* @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="id_Usuario")
    private userModel usuario;*/

    
    


	public String getNumero_Factura() {
		return numero_Factura;
	}

	public int getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public void setNumero_Factura(String numero_Factura) {
		this.numero_Factura = numero_Factura;
	}

	public Long getId_Factura() {
		return id_Factura;
	}

	public void setId_Factura(Long id_Factura) {
		this.id_Factura = id_Factura;
	}
	
	public String getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getTotal_Factura() {
		return total_Factura;
	}

	public void setTotal_Factura(double total_Factura) {
		this.total_Factura = total_Factura;
	}

	/*public userModel getUsuario() {
		return usuario;
	}

	public void setUsuario(userModel usuario) {
		this.usuario = usuario;
	}
	*/
    
	
}
