package entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="imagen")
public class Imagen implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String nombre;
	@Type(type = "org.hibernate.type.BlobType")
	@Lob
	private byte[] dataArchivo;
	@Column
	private Boolean activo = true;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_imagen")
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
