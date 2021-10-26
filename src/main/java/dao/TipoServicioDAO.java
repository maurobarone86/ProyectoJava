package dao;

import entities.TipoServicio;

public interface TipoServicioDAO extends GenericDAO<TipoServicio>  {
	public void agregarTipo(TipoServicio tipo);
	public TipoServicio existe(String nombre);
	public TipoServicio obtenerTipo(String nombre);
}
