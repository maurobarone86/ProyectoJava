package dao;

import javax.persistence.Query;

import entities.TipoServicio;

public interface TipoServicioDAO extends GenericDAO<TipoServicio>  {
	public Query makeQuery(TipoServicio tipoServicio);

	public TipoServicio obtenerTipoServicio(String nombre);
	
}
