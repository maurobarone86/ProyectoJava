package dao;

import javax.persistence.Query;

import entities.Estado;

public interface EstadoDAO extends GenericDAO<Estado>{
	public Query makeQuery(Estado estado);
	public Estado obtenerEstado(String nombre); 


}
