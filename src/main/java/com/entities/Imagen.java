package com.entities;

import java.util.Arrays;

import com.Interface.InterImagen;

public abstract class Imagen implements InterImagen {
	private String nombre;
	private byte[] dataArchivo;
	
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
	public Imagen(String nombre, byte[] dataArchivo) {
		super();
		this.nombre = nombre;
		this.dataArchivo = dataArchivo;
	}
	public Imagen() {
		
	}
	@Override
	public String toString() {
		return "Imagen [nombre=" + nombre + ", dataArchivo=" + Arrays.toString(dataArchivo) + "]";
	}
	
	

}
