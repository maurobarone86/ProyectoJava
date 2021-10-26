package dao;

import entities.TipoEvento;

public class TipoEventoDAOImpl extends GenericDAOImpl<TipoEvento> implements TipoEventoDAO {

	public TipoEventoDAOImpl(Class<TipoEvento> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}
	private static GenericDAO<TipoEvento> genericDAO= new GenericDAOImpl<TipoEvento>(TipoEvento.class);
	@Override
	public void agregarTipoEvento(TipoEvento tipo) {
		// TODO Auto-generated method stub
		genericDAO.persistir(tipo);
	}

	
}
