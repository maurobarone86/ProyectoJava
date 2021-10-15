package com.entities;

public class Estado {
		private Long id;
		private String nombre;
		private Boolean activo = true;
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
		public Boolean getActivado() {
			return activo;
		}
		public void setActivado(Boolean activado) {
			this.activo = activado;
		}
		@Override
		public String toString() {
			return "Estado [id=" + id + ", nombre=" + nombre + ", activado=" + activo + "]";
		}
		public Estado(Long id, String nombre, Boolean activo) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.activo = activo;
		}
		public Estado() {
			
		}

		
		
		
}


