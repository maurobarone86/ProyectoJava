package dao;

import entities.Evento;

public class EventoDAOImpl extends GenericDAOImpl<Evento> implements EventoDAO {

	public EventoDAOImpl(Class<Evento> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}
	private static GenericDAO<Evento> genericDAO= new GenericDAOImpl<Evento>(Evento.class);
	@Override
	public void agregar(Evento evento) {
		// TODO Auto-generated method stub
		genericDAO.persistir(evento);
	}
	

}
