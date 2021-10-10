package com.entities;

import java.util.List;

public class Servicio {
	private String nombre;
	private String tipo;
	private String descripcion;
	private String url;
	private Long whatsapp;
	private String instagram;
	private String twiter;
	private Integer puntaje;
	private List<Imagen> imagenes;
	private List<Reserva> reservas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public Integer getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(Integer puntaje) {
		this.puntaje = puntaje;
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
	public Servicio(String nombre, String tipo, String descripcion, String url, Long whatsapp, String instagram,
			String twiter, Integer puntaje, List<Imagen> imagenes, List<Reserva> reservas) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.url = url;
		this.whatsapp = whatsapp;
		this.instagram = instagram;
		this.twiter = twiter;
		this.puntaje = puntaje;
		this.imagenes = imagenes;
		this.reservas = reservas;
	}
	public Servicio() {
		
	}
	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion + ", url=" + url
				+ ", whatsapp=" + whatsapp + ", instagram=" + instagram + ", twiter=" + twiter + ", puntaje=" + puntaje
				+ ", imagenes=" + imagenes + ", reservas=" + reservas + "]";
	}
	
	
	

}
