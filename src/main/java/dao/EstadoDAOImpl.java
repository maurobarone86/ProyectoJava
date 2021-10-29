package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;
import entities.Estado;


public class EstadoDAOImpl extends GenericDAOImpl<Estado> implements EstadoDAO {

	public EstadoDAOImpl(Class<Estado> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}
	public Query makeQuery(Estado estado) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM Estado u WHERE u.nombre = :nombre AND u.activo = :activo");
		q.setParameter("nombre",estado.getNombre());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
	@Override
	public void borradoLogico(Estado entity) {
		entity=	this.recuperar(entity.getId());
		entity.setActivo(false);
		this.actualizar(entity);
		
	}
}
