package Test;

import dao.TipoEventoDAO;
import dao.TipoEventoDAOImpl;
import dao.TipoServicioDAO;
import dao.TipoServicioDAOImpl;
import entities.TipoEvento;
import entities.TipoServicio;

public class MainTestTipos {
	
	private static TipoServicioDAO tipoServicioDAO= new TipoServicioDAOImpl(TipoServicio.class);
	private static TipoEventoDAO tipoEventoDAO=new TipoEventoDAOImpl(TipoEvento.class);
	private static TipoServicio tipoS;
	private static TipoEvento tipoE;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void agregarTipoServicio(String nombre) {
		tipoS=new TipoServicio();
		tipoS.setNombre(nombre);
		tipoServicioDAO.agregarTipo(tipoS);
	}
	public static void agregarTipoEvento(String nombre) {
		tipoE=new TipoEvento();
		tipoE.setNombre(nombre);
		tipoEventoDAO.agregarTipoEvento(tipoE);
	}
	
}
