package dao;


import entities.Valoracion;

public interface ValoracionDAO extends GenericDAO<Valoracion>{

	void borradoLogico(Valoracion entity);

}
