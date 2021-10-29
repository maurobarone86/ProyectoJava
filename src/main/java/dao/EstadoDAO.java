package dao;

import entities.Estado;

public interface EstadoDAO extends GenericDAO<Estado>{
	public Estado obtenerEstado(String nombre); 
	public void save(Estado estado) throws Exception;
}
