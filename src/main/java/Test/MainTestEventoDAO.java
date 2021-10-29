package Test;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import JPAUtil.Conexion;
import dao.EstadoDAO;
import dao.EstadoDAOImpl;
import dao.EventoDAO;
import dao.EventoDAOImpl;
import dao.TipoEventoDAO;
import dao.TipoEventoDAOImpl;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.TipoEvento;
import entities.Usuario;
import entities.Estado;
import entities.Evento;


public class MainTestEventoDAO {
	private static UsuarioDAO usuarioDAO=new UsuarioDAOImpl(Usuario.class);
	private static TipoEventoDAO tipoDAO=new TipoEventoDAOImpl(TipoEvento.class);
	private static EventoDAO eventoDAO=new EventoDAOImpl(Evento.class);
	private static EstadoDAO estadoDAO=new EstadoDAOImpl(Estado.class);
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//agregarEvento();
	}
	
	public static void agregarEvento() throws Exception {
		Usuario user= usuarioDAO.obtenerUser("PedroRodriguez");
		TipoEvento t= tipoDAO.obtenerTipoE("Evento Privado Cumpleaños", true);
		Estado estado=estadoDAO.obtenerEstado("En Espera");
		if (user != null && t!=null && estado!=null) {
			LocalDate fecha=LocalDate.now() ;
			LocalTime hora=LocalTime.now();
			Evento e1=new Evento("Cumpleaños Pedro", "7 y esq 72", 1900, "Buenos Aires", "geolocalidad", t, fecha, hora, estado);
			user.setEvento(e1);;
			usuarioDAO.actualizar(user);
		}else {
			System.out.println("Algo salio mal");
		}
		Usuario user2= usuarioDAO.obtenerUser("JuanCruz");
		TipoEvento t2= tipoDAO.obtenerTipoE("Evento Privado Cumpleaños", true);
		Estado estado2=estadoDAO.obtenerEstado("En Espera");
		if (user2 != null && t2!=null && estado2!=null) {
			LocalDate fecha=LocalDate.now() ;
			LocalTime hora=LocalTime.now();
			Evento e2=new Evento("Cumpleaños Juan", "7 y esq 72", 1900, "Buenos Aires", "geolocalidad", t2, fecha, hora, estado2);
			user2.setEvento(e2);;
			usuarioDAO.actualizar(user2);
		}else {
			System.out.println("Algo salio mal 2");
		}
		
	}
	public static void imprimirPorID(Long id) {
		Evento evento= eventoDAO.recuperar(id);
		System.out.println("Evento: "+evento);
	}
	public static void imprimirTodosActivos() throws Exception {
		List<Evento> lista= eventoDAO.recuperarActivos();
		imprimir(lista, "Evento Activo");
	}
	
	public static void imprimirTodosOrdenados() throws Exception {
		List<Evento> lista= eventoDAO.recuperarTodos("nombre");
		imprimir(lista, "Evento Ordenado");
	}
	public static void imprimir(List<Evento> lista, String estado) {
		if (lista.size()>0) {
			for (Evento s: lista) {
				System.out.println(estado+": "+s);
			}
		}else {
			System.out.println("No hay "+estado);
		}
	}
	public static void borradoLogico(Long id) {
		Evento ser= eventoDAO.recuperar(id);
		ser.setActivo(false);
		eventoDAO.actualizar(ser);
	}

}
