package Test;

import java.util.List;

import dao.EstadoDAO;
import dao.EstadoDAOImpl;
import dao.TipoEventoDAO;
import dao.TipoEventoDAOImpl;
import dao.TipoServicioDAO;
import dao.TipoServicioDAOImpl;
import entities.TipoEvento;
import entities.TipoServicio;
import entities.Estado;
import entities.Servicio;

public class MainTestTipos {
	
	private static TipoServicioDAO tipoServicioDAO= new TipoServicioDAOImpl(TipoServicio.class);
	private static TipoEventoDAO tipoEventoDAO=new TipoEventoDAOImpl(TipoEvento.class);
	private static EstadoDAO estadoDAO=new EstadoDAOImpl(Estado.class);
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		agregarTipoServicio();
		agregarTipoEvento();
		agregarEstado();
	}
	public static void agregarTipoServicio() throws Exception {
		TipoServicio tipo1=new TipoServicio("show en vivio");
		tipoServicioDAO.save(tipo1);
		TipoServicio tipo2=new TipoServicio("catering");
		tipoServicioDAO.save(tipo2);
		TipoServicio tipo3=new TipoServicio("Filmacion y fotos");
		tipoServicioDAO.save(tipo3);
	}
	public static void agregarTipoEvento() throws Exception {
		TipoEvento tipoE1=new TipoEvento("Evento Publico Cultural", true);
		tipoEventoDAO.save(tipoE1);
		TipoEvento tipoE2=new TipoEvento("Evento Publico Social", true);
		tipoEventoDAO.save(tipoE2);
		TipoEvento tipoE3=new TipoEvento("Evento Privado Cumpleaños", true);
		tipoEventoDAO.save(tipoE3);
	}
	public static void agregarEstado() throws Exception {
		//estados de eventos
		Estado estado1=new Estado("Realizado");
		estadoDAO.save(estado1);
		Estado estado2=new Estado("En Espera");
		estadoDAO.save(estado2);
		//estado de reservas
		Estado estado3=new Estado("Aceptada");
		estadoDAO.save(estado3);
		Estado estado4=new Estado("Rechazada");
		estadoDAO.save(estado4);
		Estado estado5=new Estado("sin realizar");
		estadoDAO.save(estado5);
	}
	
	public static void imprimirPorID() {
		//suponiendo que ya hay algun tipo o estado cargado
		TipoEvento tipoE= tipoEventoDAO.recuperar(1L);
		TipoServicio tipoS=tipoServicioDAO.recuperar(1L);
		Estado estado=estadoDAO.recuperar(1L);
		System.out.println("Tipo Evento: "+tipoE.getNombre()+", Tipo Servicio: "+tipoS.getNombre()+", Estado: "+estado.getNombre());
	}
	
	public static void imprimirTodosyOrdenadosTE() throws Exception {
		List<TipoEvento> lista= tipoEventoDAO.recuperarTodos("nombre");
		imprimirTE(lista, "Tipo Evento Ordenado");
	}
	public static void imprimirTodosActivosTE() throws Exception {
		List<TipoEvento> lista= tipoEventoDAO.recuperarActivos();
		imprimirTE(lista, "Tipo Evento Activo");
	}
	public static void imprimirTE(List<TipoEvento> lista, String estado) {
		if (lista.size()>0) {
			for (TipoEvento tipo: lista) {
				System.out.println(estado+": "+tipo);
			}
		}else {
			System.out.println("No hay "+estado);
		}
	}
	public static void imprimirTodosyOrdenadosTS() throws Exception {
		List<TipoServicio> lista= tipoServicioDAO.recuperarTodos("nombre");
		imprimirTS(lista, "Tipo servicio Ordenado");
	}
	public static void imprimirTodosActivosTS() throws Exception {
		List<TipoServicio> lista= tipoServicioDAO.recuperarActivos();
		imprimirTS(lista, "Tipo Servicio Activo");
	}
	public static void imprimirTS(List<TipoServicio> lista, String estado) {
		if (lista.size()>0) {
			for (TipoServicio tipo: lista) {
				System.out.println(estado+": "+tipo);
			}
		}else {
			System.out.println("No hay "+estado);
		}
	}
	public static void imprimirTodosyOrdenadosE() throws Exception {
		List<Estado> lista= estadoDAO.recuperarTodos("nombre");
		imprimirE(lista, "Esatdo Ordenado");
	}
	public static void imprimirTodosActivosE() throws Exception {
		List<Estado> lista= estadoDAO.recuperarActivos();
		imprimirE(lista, "Esatdo activo");
	}
	public static void imprimirE(List<Estado> lista, String est) {
		if (lista.size()>0) {
			for (Estado estado: lista) {
				System.out.println(est+": "+estado);
			}
		}else {
			System.out.println("No hay "+est);
		}
	}
}
