package dao;

import entities.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva> implements ReservaDAO {

	public ReservaDAOImpl(Class<Reserva> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}
	private GenericDAO<Reserva> genericDAO=new GenericDAOImpl<Reserva>(Reserva.class);
	@Override
	public void agregar(Reserva reserva) {
		// TODO Auto-generated method stub
		genericDAO.persistir(reserva);
	} 
	
}
