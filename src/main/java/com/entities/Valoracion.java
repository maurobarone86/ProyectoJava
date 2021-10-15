package com.entities;

public class Valoracion {
	private Long id;
	private String nombre;
	private Boolean activo= true;
	private Integer puntos=0;
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
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "Valoracion [id=" + id + ", nombre=" + nombre + ", activo=" + activo + ", puntos=" + puntos + "]";
	}
	public Valoracion(Long id, String nombre, Boolean activo, Integer puntos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.activo = activo;
		this.puntos = puntos;
	}
	public Valoracion() {
		
	}
	
	

}
