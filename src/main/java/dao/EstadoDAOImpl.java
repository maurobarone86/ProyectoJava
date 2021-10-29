package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;
import entities.Estado;

public class EstadoDAOImpl extends GenericDAOImpl<Estado> implements EstadoDAO {

	public EstadoDAOImpl(Class<Estado> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Estado obtenerEstado(String nombre) {
		Estado estado=new Estado(nombre);
		return super.existe(estado);
	}
	
	
	
	public Query makeQuery(Estado estado) {
		Query q = Conexion.getManager().createQuery("SELECT e FROM Estado e WHERE e.nombre = :nombre AND e.activo = :activo");
		q.setParameter("nombre",estado.getNombre());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
	

}
