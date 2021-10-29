package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;

import entities.Servicio;

public class ServicioDAOImpl extends GenericDAOImpl<Servicio> implements ServicioDAO{

	public ServicioDAOImpl(Class<Servicio> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}
	public Query makeQuery(Servicio servicio) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM Servicio u WHERE u.nombre = :nombre AND u.activo = :activo");
		q.setParameter("nombre",servicio.getNombre());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
	@Override
	public void borradoLogico(Servicio entity) {
		entity=	this.recuperar(entity.getId());
		entity.setActivo(false);
		this.actualizar(entity);
	}
	
}
