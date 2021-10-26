package dao;

import entities.Evento;

public interface EventoDAO extends GenericDAO<Evento>{
	public void agregar(Evento evento);
}
