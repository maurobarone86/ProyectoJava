package Test;

import java.util.ArrayList;
import java.util.List;
import dao.EventoDAO;
import dao.EventoDAOImpl;
import dao.TipoEventoDAO;
import dao.TipoEventoDAOImpl;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.TipoEvento;
import entities.Usuario;
import entities.Evento;


public class MainTestEventoDAO {
	private static UsuarioDAO usuarioDAO=new UsuarioDAOImpl(Usuario.class);
	private static TipoEventoDAO tipoDAO=new TipoEventoDAOImpl(TipoEvento.class);
	private static EventoDAO eventoDAO=new EventoDAOImpl(Evento.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void agregar() throws Exception {
		Usuario user= usuarioDAO.recuperar(1L);
		TipoEvento t=(TipoEvento) tipoDAO.recuperar(1L);
		System.out.println("El tipo obtenido es: "+t.getNombre());
		Evento e1=new Evento();
		eventoDAO.save(e1);
		List<Evento> eventos=new ArrayList<Evento>();
		eventos.add(e1);
		user.setEventos(eventos);;
		usuarioDAO.actualizar(user);
	}
	public static void imprimirTodosActivos() throws Exception {
		List<Evento> lista= eventoDAO.recuperarActivos();
		if (lista.size()>0) {
			for (Evento s: lista) {
				System.out.println("Evento: "+s.getNombre());
			}
		}else {
			System.out.println("No hay Eventos");
		}
	}
	public static void borradoLogico(Long id) {
		Evento ser= eventoDAO.recuperar(id);
		ser.setActivo(false);
		eventoDAO.actualizar(ser);
	}

}
