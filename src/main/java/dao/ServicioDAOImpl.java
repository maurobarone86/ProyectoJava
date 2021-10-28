package dao;

import entities.Servicio;

public class ServicioDAOImpl extends GenericDAOImpl<Servicio> implements ServicioDAO{

	public ServicioDAOImpl(Class<Servicio> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}
	private GenericDAO<Servicio> genericDAO= new GenericDAOImpl<Servicio>(Servicio.class);

	@Override
	public void agregar(Servicio servicio) {
		genericDAO.persistir(servicio);
		System.out.println("se agrego correctamente");
	}


}
