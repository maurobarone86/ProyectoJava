package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;

import entities.Evento;

public class EventoDAOImpl extends GenericDAOImpl<Evento> implements EventoDAO {

	public EventoDAOImpl(Class<Evento> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}
	public Query makeQuery(Evento evento) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM Evento u WHERE u.nombre = :nombre AND u.activo = :activo AND u.direccion = :direccion AND u.fecha = :fecha");
		q.setParameter("nombre",evento.getNombre());
		q.setParameter("direccion",evento.getDireccion());
		q.setParameter("fecha",evento.getFecha());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
	@Override
	public void borradoLogico(Evento entity) {
		entity=	this.recuperar(entity.getId());
		entity.setActivo(false);
		this.actualizar(entity);
	}
	

}
