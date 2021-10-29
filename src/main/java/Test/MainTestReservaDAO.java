package Test;

import java.util.ArrayList;
import java.util.List;

import dao.EstadoDAO;
import dao.EstadoDAOImpl;
import dao.EventoDAO;
import dao.EventoDAOImpl;
import dao.ReservaDAO;
import dao.ReservaDAOImpl;
import dao.ServicioDAO;
import dao.ServicioDAOImpl;
import dao.TipoServicioDAO;
import dao.TipoServicioDAOImpl;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.Servicio;
import entities.TipoServicio;
import entities.Usuario;
import entities.Reserva;
import entities.Estado;
import entities.Evento;

public class MainTestReservaDAO {
	private static EventoDAO eventoDAO= new EventoDAOImpl(Evento.class);
	private static TipoServicioDAO tipoDAO= new TipoServicioDAOImpl(TipoServicio.class);
	private static ServicioDAO servicioDAO= new ServicioDAOImpl(Servicio.class);
	private static ReservaDAO reservaDAO= new ReservaDAOImpl(Reserva.class);
	private static UsuarioDAO userDAO= new UsuarioDAOImpl(Usuario.class);
	private static EstadoDAO estadoDAO=new EstadoDAOImpl(Estado.class);
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		imprimirTodosActivos();
	}
	public static void agregarServicios() throws Exception {
		Evento evento= eventoDAO.recuperar(1L);
		Servicio ser= servicioDAO.recuperar(1L);
		Usuario user= userDAO.recuperar(1L);
		Estado estado=null;
		estado= estadoDAO.recuperar(1L);
		TipoServicio t=(TipoServicio) tipoDAO.recuperar(1L);
		System.out.println("El tipo obtenido es: "+t.getNombre());
		Reserva r1=new Reserva("tarjeta", "pedroRodriguez@gmail.com", 2213445646L, evento, user, ser, estado);
		reservaDAO.save(r1);
		List<Reserva> reservas=new ArrayList<Reserva>();
		reservas.add(r1);
		evento.setReservas(reservas);
		eventoDAO.actualizar(evento);
	}
	
	public static void imprimirTodosActivos() throws Exception {
		List<Reserva> lista= reservaDAO.recuperarActivos();
		if (lista.size()>0) {
			for (Reserva s: lista) {
				System.out.println("Servicio: "+s.getUsuario().getNombre());
			}
		}else {
			System.out.println("No hay servicios");
		}
	}

}
