package dao;

import entities.TipoEvento;

public interface TipoEventoDAO extends GenericDAO<TipoEvento>{
	public TipoEvento obtenerTipoE(String nombre, Boolean publicado);
	public void save(TipoEvento tipo)throws Exception ;
}
