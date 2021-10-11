package com.entities;

import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

public class Evento {
	private String nombre;
	private String direccion;
	private Integer codigoPostal;
	private String provincia;
	private String geolocalizacion;
	private String tipo;
	private LocalDate fecha;
	private LocalTime hora;
	private List<Reserva> reservas;
	private Boolean activo = true;
	private Boolean realizado = false;
	private Long id;
		
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getGeolocalizacion() {
		return geolocalizacion;
	}
	public void setGeolocalizacion(String geolocalizacion) {
		this.geolocalizacion = geolocalizacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public List<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	public Evento(String nombre, String direccion, Integer codigoPostal, String provincia, String geolocalizacion,
			String tipo, LocalDate fecha, LocalTime hora, List<Reserva> reservas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.geolocalizacion = geolocalizacion;
		this.tipo = tipo;
		this.fecha = fecha;
		this.hora = hora;
		this.reservas = reservas;
	}
	public Evento() {
		
	}
	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal
				+ ", provincia=" + provincia + ", geolocalizacion=" + geolocalizacion + ", tipo=" + tipo + ", fecha="
				+ fecha + ", hora=" + hora + ", reservas=" + reservas + ", activo=" + activo + ", realizado="
				+ realizado + ", id=" + id + "]";
	}
	
	
	
	

}
