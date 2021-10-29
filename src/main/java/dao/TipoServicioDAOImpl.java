package dao;


import javax.persistence.Query;

import JPAUtil.Conexion;

import entities.TipoServicio;


public class TipoServicioDAOImpl extends GenericDAOImpl<TipoServicio> implements TipoServicioDAO  {

	public TipoServicioDAOImpl(Class<TipoServicio> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	public Query makeQuery(TipoServicio tipoServicio) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM TipoServicio u WHERE u.nombre = :nombre AND u.activo = :activo");
		q.setParameter("nombre",tipoServicio.getNombre());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
	

	@Override
	public TipoServicio obtenerTipoServicio(String nombre) {
		// TODO Auto-generated method stub
		if (nombre !=null) {
			TipoServicio tipo= new TipoServicio(nombre);
			return super.existe(tipo);
		}
		return null;
	}
	
	
	
}
