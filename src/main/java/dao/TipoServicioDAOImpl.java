package dao;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import JPAUtil.Conexion;
import entities.TipoServicio;

public class TipoServicioDAOImpl extends GenericDAOImpl<TipoServicio> implements TipoServicioDAO  {

	public TipoServicioDAOImpl(Class<TipoServicio> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

}
