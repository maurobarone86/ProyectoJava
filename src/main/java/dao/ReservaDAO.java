package dao;

import entities.Reserva;

public interface ReservaDAO extends GenericDAO<Reserva> {
	public void agregar(Reserva reserva);
}