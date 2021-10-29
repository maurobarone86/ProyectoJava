package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;
import entities.TipoEvento;

public class TipoEventoDAOImpl extends GenericDAOImpl<TipoEvento> implements TipoEventoDAO {

	public TipoEventoDAOImpl(Class<TipoEvento> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}
	public Query makeQuery(TipoEvento tipoEvento) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM TipoEvento u WHERE u.nombre = :nombre AND u.activo = :activo");
		q.setParameter("nombre",tipoEvento.getNombre());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
	@Override
	public void borradoLogico(TipoEvento entity) {
		entity=	this.recuperar(entity.getId());
		entity.setActivo(false);
		this.actualizar(entity);
	}

}
