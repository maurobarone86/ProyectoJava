package dao;

import javax.persistence.Query;

import entities.Reserva;

public interface ReservaDAO extends GenericDAO<Reserva> {
	public Query makeQuery(Reserva reserva);
}
