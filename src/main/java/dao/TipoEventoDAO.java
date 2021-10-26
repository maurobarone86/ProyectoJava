package dao;

import entities.TipoEvento;

public interface TipoEventoDAO extends GenericDAO<TipoEvento>{
	public void agregarTipoEvento(TipoEvento tipo);
}
