package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;

import entities.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva> implements ReservaDAO {

	public ReservaDAOImpl(Class<Reserva> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	} 
	
	public Query makeQuery(Reserva reserva) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM Reserva u WHERE u.usuario = :usuario AND u.activo = :activo AND u.servicio = :servicio");
		q.setParameter("servicio",reserva.getServicio());
		q.setParameter("usuario",reserva.getUsuario());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}

	@Override
	public void borradoLogico(Reserva entity) {
		entity=	this.recuperar(entity.getId());
		entity.setActivo(false);
		this.actualizar(entity);
	}
	
}
