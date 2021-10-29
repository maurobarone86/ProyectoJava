package dao;

import entities.TipoServicio;

public interface TipoServicioDAO extends GenericDAO<TipoServicio>  {
	public TipoServicio obtenerTipoServicio(String nombre);
	public void save(TipoServicio tipo) throws Exception;
}
