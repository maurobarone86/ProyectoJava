package dao;


import entities.Servicio;

public interface ServicioDAO extends GenericDAO<Servicio>{
	public Servicio obtenerServicio(String dato);
	public void save(Servicio servicio) throws Exception;
}
