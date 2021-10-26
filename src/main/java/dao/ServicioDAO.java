package dao;


import entities.Servicio;

public interface ServicioDAO extends GenericDAO<Servicio>{
	public void agregar(Servicio servicio);
}
