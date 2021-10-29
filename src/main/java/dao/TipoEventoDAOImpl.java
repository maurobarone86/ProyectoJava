package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;
import entities.TipoEvento;
import entities.Usuario;

public class TipoEventoDAOImpl extends GenericDAOImpl<TipoEvento> implements TipoEventoDAO {

	public TipoEventoDAOImpl(Class<TipoEvento> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TipoEvento obtenerTipoE(String nombre, Boolean publicado) {
		// TODO Auto-generated method stub
		if (nombre!=null) {
			TipoEvento tipoEventoAux=new TipoEvento(nombre, publicado);
			return super.existe(tipoEventoAux);
		}
		return null;
	}
	
	public void save(TipoEvento tipo) throws Exception {
		super.save(tipo);
	}
	
	public Query makeQuery(TipoEvento tipo) {
		Query q = Conexion.getManager().createQuery("SELECT t FROM TipoEvento t WHERE t.nombre = :nombre AND t.activo = :activo");
		q.setParameter("nombre", tipo.getNombre());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}
}
