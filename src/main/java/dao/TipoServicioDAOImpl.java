package dao;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import JPAUtil.Conexion;
import entities.TipoServicio;
import entities.Usuario;

public class TipoServicioDAOImpl extends GenericDAOImpl<TipoServicio> implements TipoServicioDAO  {

	public TipoServicioDAOImpl(Class<TipoServicio> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
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
	
	public void save(TipoServicio tipo) throws Exception {
		super.save(tipo);
	}
	
	public Query makeQuery(TipoServicio tipo) {
		Query q = Conexion.getManager().createQuery("SELECT t FROM TipoServicio t WHERE t.nombre = :nombre AND t.activo = :activo");
		q.setParameter("nombre",tipo.getNombre());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
}
