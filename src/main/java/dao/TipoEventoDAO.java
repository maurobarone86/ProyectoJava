package dao;

import javax.persistence.Query;

import entities.TipoEvento;

public interface TipoEventoDAO extends GenericDAO<TipoEvento>{
	public Query makeQuery(TipoEvento tipoEvento);
}
