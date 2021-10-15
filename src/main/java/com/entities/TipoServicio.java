package com.entities;

public class TipoServicio {
	private Long id;
	private String nombre;
	private Boolean activo=true;
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
	@Override
	public String toString() {
		return "TipoServicio [id=" + id + ", nombre=" + nombre + ", activo=" + activo + "]";
	}
	public TipoServicio(Long id, String nombre, Boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.activo = activo;
	}
	public TipoServicio() {
		
	}
	
	

}
