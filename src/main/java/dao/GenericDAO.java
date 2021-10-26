package dao;

import java.io.Serializable;

import java.util.List;
public interface GenericDAO<T> {
public T actualizar(T entity);
public void borrar(T entity);
public T borrar(Serializable id);
public T persistir(T entity);
public T recuperar(Serializable id);
public List<T> recuperarActivos()throws Exception;
public List<T> recuperarTodos(String column)throws Exception;

}
