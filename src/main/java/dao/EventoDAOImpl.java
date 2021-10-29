package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;
import entities.Estado;
import entities.Evento;

public class EventoDAOImpl extends GenericDAOImpl<Evento> implements EventoDAO {

	public EventoDAOImpl(Class<Evento> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Evento obtenerEvento(String dato) {
		Evento evento= new Evento(dato);
		return super.existe(evento);
	}
	
	public Query makeQuery(Evento evento) {
		Query q = Conexion.getManager().createQuery("SELECT e FROM Evento e WHERE e.nombre = :nombre AND e.activo = :activo");
		q.setParameter("nombre",evento.getNombre());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
}
