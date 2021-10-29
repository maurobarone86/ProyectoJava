package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import JPAUtil.Conexion;



abstract public class GenericDAOImpl<T> implements GenericDAO<T> {
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
			System.out.println("No se pudo persistir la entidad");
			throw e; 
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
	
	abstract public void borradoLogico(T entity);
	
	
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
	
	@SuppressWarnings("unchecked")
	public List<T> recuperarActivos() throws Exception {
		List<T> resultado = null;
		try {
			Query consulta=Conexion.getManager().createQuery("select e from "+ getPersistentClass().getSimpleName()+" e WHERE e.activo = :logic");
			consulta.setParameter("logic", Boolean.TRUE);
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
	
	public void save(T entity) throws Exception {
		// TODO Auto-generated method stub
		try {
			T entityAux = existe(entity);
			if (entityAux != null){
				this.actualizar(entityAux);
				}
			else {
				this.persistir(entity);
				}
			}
		catch (Exception e) {
			throw e;
			}
	}
	
	abstract public Query makeQuery(T entity);
	
public T existe(T entity)throws NoResultException, NonUniqueResultException{
		
		Query q = this.makeQuery(entity);
			
		try {
			@SuppressWarnings("unchecked")
			T teAux =(T) q.getSingleResult();
			System.out.println("existe el "+getPersistentClass().toString()+", lo actualizo");
			
			return teAux;
			}
		catch (NoResultException e) {
			System.out.println("la consulta no trajo nada, se persiste el "+getPersistentClass().toString());
			return null;
		}
		catch (NonUniqueResultException e1) {
			System.out.println(entity.toString()+ "existe mas de un "+getPersistentClass().toString()+" activo, no se puede actualizar");
			throw e1;
		}
	
	}


}
