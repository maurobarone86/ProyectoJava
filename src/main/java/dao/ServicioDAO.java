package dao;


import javax.persistence.Query;

import entities.Servicio;

public interface ServicioDAO extends GenericDAO<Servicio>{
	public Query makeQuery(Servicio servicio);
	
}
