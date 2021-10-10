package com.entities;

import java.util.Date;
import java.util.List;

public class Usuario {
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private String direccion;
	private String nombreUsuario;
	private String password;
	private List<Reserva> reservas;
	private List<Evento> eventos;
	private List<Servicio> servicios;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	public List<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	public List<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	public Usuario(String nombre, String apellido, Date fechaNac, String direccion, String nombreUsuario,
			String password, List<Reserva> reservas, List<Evento> eventos, List<Servicio> servicios) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.direccion = direccion;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.reservas = reservas;
		this.eventos = eventos;
		this.servicios = servicios;
	}
	public Usuario() {
		
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", direccion="
				+ direccion + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", reservas=" + reservas
				+ ", eventos=" + eventos + ", servicios=" + servicios + "]";
	}
	
	
	

}
