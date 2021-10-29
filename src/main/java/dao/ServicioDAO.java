package dao;


import javax.persistence.Query;

import entities.Servicio;

public interface ServicioDAO extends GenericDAO<Servicio>{
	public Query makeQuery(Servicio servicio);
	public Servicio obtenerServicio(String dato);
	public void save(Servicio servicio) throws Exception;
}
