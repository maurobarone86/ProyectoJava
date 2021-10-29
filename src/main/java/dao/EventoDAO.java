package dao;

import javax.persistence.Query;

import entities.Evento;

public interface EventoDAO extends GenericDAO<Evento>{
	public Query makeQuery(Evento evento);
	
}
