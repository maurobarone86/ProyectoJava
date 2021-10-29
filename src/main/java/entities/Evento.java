package entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.joda.time.LocalTime;
@Entity
@Table(name="eventos")
public class Evento implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_evento")
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private Integer codigoPostal;
	
	@Column
	private String provincia;
	
	@Column
	private String geolocalizacion;
	
	@OneToOne
	private TipoEvento tipo;
	
	@Column
	private Date fecha;
	
	@Column
	private LocalTime hora;
	
	@OneToMany(mappedBy="evento", cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Reserva> reservas;
	
	@OneToOne
	private Estado estado;
	
	@Column
	private Boolean activo=true;
	
		
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
		
	public TipoEvento getTipo() {
		return tipo;
	}
	public void setTipo(TipoEvento tipo) {
		this.tipo = tipo;
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
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
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
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal
				+ ", provincia=" + provincia + ", geolocalizacion=" + geolocalizacion + ", tipo=" + tipo + ", fecha="
				+ fecha + ", hora=" + hora + ", reservas=" + reservas + ", estado=" + estado + ", id=" + id + "]";
	}
	public Evento(String nombre, String direccion, Integer codigoPostal, String provincia, String geolocalizacion,
			TipoEvento tipo, Date fecha, LocalTime hora, List<Reserva> reservas, Estado estado, Long id) {
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
		this.estado = estado;
		this.id = id;
	}
	public Evento() {
		
	}
	
	
	
	
	
	

}
