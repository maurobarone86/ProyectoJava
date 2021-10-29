package dao;

import java.util.Date;

import javax.persistence.Query;

import entities.Evento;

public interface EventoDAO extends GenericDAO<Evento>{
	public Query makeQuery(Evento evento);
	public Evento obtenerEvento(String nombre, String direccion, Date fecha );
}
