package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import JPAUtil.Conexion;

public class GenericDAOImpl<T> implements GenericDAO<T> {
	protected Class<T> persistentClass;
	public GenericDAOImpl(Class<T> clase) {
		persistentClass = clase;
	}
	@Override
	public T persistir(T entity) {
		EntityManager em = Conexion.getManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(entity);
			tx.commit();
			}
		catch (RuntimeException e) {
			if ( tx != null && tx.isActive() ) tx.rollback();
			throw e; // escribir en un log o mostrar un mensaje
			}
		finally {
			em.close();
			}
	return entity;
	}
	
	public T actualizar(T entity) {
		EntityManager em= Conexion.getManager();
		EntityTransaction etx= em.getTransaction();
		etx.begin();
		T entityAux = em.merge(entity);
		etx.commit();
		em.close();
	return entityAux;
	}
	
	@Override
	public void borrar(T entity) {
		EntityManager em = Conexion.getManager();
	    EntityTransaction tx = null;
	    try {
	    	tx = em.getTransaction();
	    	tx.begin();
	    	em.remove(entity);
	    	tx.commit();
	    	}
	    catch (RuntimeException e) {
	    	if ( tx != null && tx.isActive() ) tx.rollback();
	    	throw e; // escribir en un log o mostrar un mensaje
	    	} 
	    finally {
	    	em.close();
	    	}
	}
	
	
	@Override
	public T borrar(Serializable id) {
		EntityManager em = Conexion.getManager();
		T entity=em.find(this.getPersistentClass(), id);
		if (entity != null) {
			this.borrar(entity);
			}
		em.close();
		return entity;
	}
	
	private Class<T> getPersistentClass() {
		return persistentClass;
	}
	@SuppressWarnings("unchecked")
	public List<T> recuperarTodos(String columnOrder) throws Exception {
		List<T> resultado = null;
		try {
			Query consulta=Conexion.getManager().createQuery("select e from "+ getPersistentClass().getSimpleName()+" e order by e."+columnOrder);
			resultado = (List<T>) consulta.getResultList();
		}
		catch (Exception e) {
			throw e;
		}
	return resultado;
	}
	
		
	
	
	
	@Override
	public T recuperar(Serializable id) {
		return Conexion.getManager().find(getPersistentClass(), id);
			}
	
	
	
}
