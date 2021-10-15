package com.entities;

import java.util.Arrays;


public class Imagen {
	private String nombre;
	private byte[] dataArchivo;
	private Boolean activo = true;
	private Long id;
		
	
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
	public byte[] getDataArchivo() {
		return dataArchivo;
	}
	public void setDataArchivo(byte[] dataArchivo) {
		this.dataArchivo = dataArchivo;
	}
	
	
	public Imagen() {
		
	}
	@Override
	public String toString() {
		return "Imagen [nombre=" + nombre + ", dataArchivo=" + Arrays.toString(dataArchivo) + ", activo=" + activo
				+ ", id=" + id + "]";
	}
	public Imagen(String nombre, byte[] dataArchivo, Boolean activo, Long id) {
		super();
		this.nombre = nombre;
		this.dataArchivo = dataArchivo;
		this.activo = activo;
		this.id = id;
	}
	
	
	

}
