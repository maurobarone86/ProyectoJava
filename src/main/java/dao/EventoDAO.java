package dao;

import entities.Evento;

public interface EventoDAO extends GenericDAO<Evento>{
	public Evento obtenerEvento(String dato);
}
