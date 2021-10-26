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
	private GenericDAO<TipoServicio> genericDAO= new GenericDAOImpl<TipoServicio>(TipoServicio.class);
	@Override
	public void agregarTipo(TipoServicio tipo) {
		// TODO Auto-generated method stub
		TipoServicio tipoEncontrado=existe(tipo.getNombre());
		if (tipoEncontrado == null) {
			genericDAO.persistir(tipo);
		}
		
	}
	@Override
	public TipoServicio existe(String nombre) {
		Query q = Conexion.getManager().createQuery("SELECT t FROM TipoServicio t WHERE t.nombre = :nom AND t.activo = :logic");
		q.setParameter("nom",nombre);
		q.setParameter("logic",Boolean.TRUE);
		try {
			TipoServicio tipoE =(TipoServicio) q.getSingleResult();
			System.out.println("existe el tipo");
			return tipoE;
			}
		catch (NoResultException e) {
			System.out.println("la consulta no trajo nada, se persiste el usuario");
			return null;
		}
		catch (NonUniqueResultException e1) {
			System.out.println(nombre+ "existe mas de una vez");
			throw e1;
		}

	}
	@Override
	public TipoServicio obtenerTipo(String nombre) {
		return existe(nombre);
	}

}
