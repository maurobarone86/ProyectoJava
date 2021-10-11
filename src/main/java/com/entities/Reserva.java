package com.entities;

public class Reserva {
	private String formaPago;
	private String email;
	private Long telefono;
	private Evento evento;
	private Usuario usuario;
	private Servicio servicio;
	private Boolean activo = true;
	private Boolean realizado = false;
	private Boolean aceptado = null;
	private Long id;
		
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getAceptado() {
		return aceptado;
	}
	public void setAceptado(Boolean aceptado) {
		this.aceptado = aceptado;
	}
	public Boolean getRealizado() {
		return realizado;
	}
	public void setRealizado(Boolean realizado) {
		this.realizado = realizado;
	}
	
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Reserva(String formaPago, String email, Long telefono, Evento evento, Usuario usuario, Servicio servicio) {
		super();
		this.formaPago = formaPago;
		this.email = email;
		this.telefono = telefono;
		this.evento = evento;
		this.usuario = usuario;
		this.servicio = servicio;
	}
	public Reserva() {
		
	}
	@Override
	public String toString() {
		return "Reserva [formaPago=" + formaPago + ", email=" + email + ", telefono=" + telefono + ", evento=" + evento
				+ ", usuario=" + usuario + ", servicio=" + servicio + ", activo=" + activo + ", realizado=" + realizado
				+ ", aceptado=" + aceptado + ", id=" + id + "]";
	}
	
	
	

}
