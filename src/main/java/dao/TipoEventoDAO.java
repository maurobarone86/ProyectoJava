package dao;

import javax.persistence.Query;

import entities.TipoEvento;

public interface TipoEventoDAO extends GenericDAO<TipoEvento>{
	public Query makeQuery(TipoEvento tipoEvento);
	public TipoEvento obtenerTipoE(String nombre, Boolean publicado);
	public void save(TipoEvento tipo)throws Exception ;
}
