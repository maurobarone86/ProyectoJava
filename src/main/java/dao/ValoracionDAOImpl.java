package dao;


import javax.persistence.Query;

import JPAUtil.Conexion;

import entities.Valoracion;

public class ValoracionDAOImpl  extends GenericDAOImpl<Valoracion> implements ValoracionDAO {
	public ValoracionDAOImpl(Class<Valoracion> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Query makeQuery(Valoracion valoracion) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM TipoEvento u WHERE u.nombre = :nombre AND u.activo = :activo AND u.servicio = :servicio");
		q.setParameter("nombre",valoracion.getNombre());
		//q.setParameter("servicio",valoracion.getServicio());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
	@Override
	public void borradoLogico(Valoracion entity) {
		entity=	this.recuperar(entity.getId());
		entity.setActivo(false);
		this.actualizar(entity);
	}

}
