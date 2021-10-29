package Test;

import java.util.List;

import dao.EstadoDAO;
import dao.EstadoDAOImpl;
import dao.EventoDAO;
import dao.EventoDAOImpl;
import dao.ReservaDAO;
import dao.ReservaDAOImpl;
import dao.ServicioDAO;
import dao.ServicioDAOImpl;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.Servicio;
import entities.Usuario;
import entities.Reserva;
import entities.Estado;
import entities.Evento;

public class MainTestReservaDAO {
	private static EventoDAO eventoDAO= new EventoDAOImpl(Evento.class);
	private static ServicioDAO servicioDAO= new ServicioDAOImpl(Servicio.class);
	private static ReservaDAO reservaDAO= new ReservaDAOImpl(Reserva.class);
	private static UsuarioDAO userDAO= new UsuarioDAOImpl(Usuario.class);
	private static EstadoDAO estadoDAO=new EstadoDAOImpl(Estado.class);
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//agregarReserva();
	}
	public static void agregarReserva() throws Exception {
		Servicio ser= servicioDAO.obtenerServicio("parrillada");
		Usuario user= userDAO.obtenerUser("JuanCruz");
		Estado estado=estadoDAO.obtenerEstado("Aceptada");
		if (ser!= null && user!=null && estado!=null) {
			List<Evento> lista=user.getEventos();
			for (Evento e: lista) {
				System.out.println("Nombre: "+e.getNombre());
				if (e.getNombre().equals("Cumpleaños Juan")) {
					Reserva r1=new Reserva("tarjeta", "pedroRodriguez@gmail.com", 2213445646L, e, user, ser, estado);
					e.setReserva(r1);
					eventoDAO.actualizar(e);
				}
			}
			userDAO.actualizar(user);
		}else {
			System.out.println("algo salio mal");
		}
	}
	
	public static void imprimirPorID(Long id) {
		Reserva reserva= reservaDAO.recuperar(id);
		System.out.println("Reserva: "+reserva);
	}
	public static void imprimirTodosActivos() throws Exception {
		List<Reserva> lista= reservaDAO.recuperarActivos();
		imprimir(lista, "Reserva Activo");
	}
	
	public static void imprimirTodosOrdenados() throws Exception {
		List<Reserva> lista= reservaDAO.recuperarTodos("email");
		imprimir(lista, "Reserva Ordenado");
	}
	public static void imprimir(List<Reserva> lista, String estado) {
		if (lista.size()>0) {
			for (Reserva s: lista) {
				System.out.println(estado+": "+s);
			}
		}else {
			System.out.println("No hay "+estado);
		}
	}

}
