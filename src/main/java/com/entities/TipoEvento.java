package com.entities;

public class TipoEvento {
	private Long id;
	private String nombre;
	private Boolean activo=true;
	private Boolean publico;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	public Boolean getPublico() {
		return publico;
	}
	public void setPublico(Boolean publico) {
		this.publico = publico;
	}
	@Override
	public String toString() {
		return "TipoEvento [id=" + id + ", nombre=" + nombre + ", activo=" + activo + ", publico=" + publico + "]";
	}
	public TipoEvento(Long id, String nombre, Boolean activo, Boolean publico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.activo = activo;
		this.publico = publico;
	}
	public TipoEvento() {
		
	}
	
	
	
	

}
