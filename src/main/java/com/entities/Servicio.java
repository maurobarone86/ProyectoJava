package com.entities;

import java.util.List;

public class Servicio {
	private String nombre;
	private TipoServicio tipo;
	private String descripcion;
	private String url;
	private Long whatsapp;
	private String instagram;
	private String twiter;
	private List<Valoracion> valoraciones;
	private List<Imagen> imagenes;
	private List<Reserva> reservas;
	private Boolean activo = true;
	private Long id;
		
	
	
	public TipoServicio getTipo() {
		return tipo;
	}
	public void setTipo(TipoServicio tipo) {
		this.tipo = tipo;
	}
	public List<Valoracion> getValoraciones() {
		return valoraciones;
	}
	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(Long whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getTwiter() {
		return twiter;
	}
	public void setTwiter(String twiter) {
		this.twiter = twiter;
	}
	
	public List<Imagen> getImagenes() {
		return imagenes;
	}
	public void setImagenes(List<Imagen> imagenes) {
		this.imagenes = imagenes;
	}
	public List<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public Servicio() {
		
	}
	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion + ", url=" + url
				+ ", whatsapp=" + whatsapp + ", instagram=" + instagram + ", twiter=" + twiter + ", valoraciones="
				+ valoraciones + ", imagenes=" + imagenes + ", reservas=" + reservas + ", activo=" + activo + ", id="
				+ id + "]";
	}
	public Servicio(String nombre, TipoServicio tipo, String descripcion, String url, Long whatsapp, String instagram,
			String twiter, List<Valoracion> valoraciones, List<Imagen> imagenes, List<Reserva> reservas, Boolean activo,
			Long id) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.url = url;
		this.whatsapp = whatsapp;
		this.instagram = instagram;
		this.twiter = twiter;
		this.valoraciones = valoraciones;
		this.imagenes = imagenes;
		this.reservas = reservas;
		this.activo = activo;
		this.id = id;
	}
	
	
	
	
	
	

}
