package Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import dao.EventoDAO;
import dao.EventoDAOImpl;
import dao.ReservaDAO;
import dao.ReservaDAOImpl;
import dao.ServicioDAO;
import dao.ServicioDAOImpl;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.Evento;
import entities.Servicio;
import entities.Usuario;
import entities.Reserva;

public class MainTestDao {
	private static UsuarioDAO usuarioDAO= new UsuarioDAOImpl(Usuario.class);
	private static EventoDAO eventoDAO= new EventoDAOImpl(Evento.class);
	private static ServicioDAO servicioDAO= new ServicioDAOImpl(Servicio.class);
	private static ReservaDAO reservaDAO= new ReservaDAOImpl(Reserva.class);
	private static Usuario usuario;
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		//agregarUser("Mauro","Barone");
		}
	public static void agregarUser(String nombre, String apellido) throws Exception {
		try {
			//String nombre, String apellido, Date fechaNac, String direccion, String nombreUsuario,
			//String password,  List<Evento> eventos, List<Servicio> servicios
			
			usuario = new Usuario();
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			
			Date cumple = Date.valueOf("1986-05-29");
			usuario.setNombreUsuario("maurobarone1");
			usuario.setFechaNac(cumple);
			
			/*
			Evento evento1 = new Evento();
			Evento evento2 = new Evento();
			Evento evento3 = new Evento();
			Evento evento4 = new Evento();
			Evento evento5 = new Evento();
			evento1.setNombre("Evento1");
			evento2.setNombre("Evento2");
			evento3.setNombre("Evento3");
			evento4.setNombre("Evento4");
			evento5.setNombre("Evento5");
			evento1.setDireccion("14y50");
			evento2.setDireccion("14y51");
			evento3.setDireccion("14y52");
			evento4.setDireccion("14y53");
			evento5.setDireccion("14y54");
			evento1.setFecha(Date.valueOf("2021-12-01"));
			evento2.setFecha(Date.valueOf("2021-12-02"));
			evento3.setFecha(Date.valueOf("2021-12-03"));
			evento4.setFecha(Date.valueOf("2021-12-04"));
			evento5.setFecha(Date.valueOf("2021-12-05"));
			evento1 = eventoDAO.save(evento1);
			evento2 = eventoDAO.save(evento2);
			evento3 = eventoDAO.save(evento3);
			evento4 = eventoDAO.save(evento4);
			evento5 = eventoDAO.save(evento5);
			
			
			List<Evento> listaEventos = new ArrayList<Evento>();
			listaEventos.add(evento1);
			listaEventos.add(evento2);
			listaEventos.add(evento3);
			listaEventos.add(evento4);
			listaEventos.add(evento5);
			usuario.setEventos(listaEventos);
			Servicio servicio1 = new Servicio();
			Servicio servicio2 = new Servicio();
			Servicio servicio3 = new Servicio();
			Servicio servicio4 = new Servicio();
			servicio1.setNombre("Servicio1");
			servicio2.setNombre("Servicio2");
			servicio3.setNombre("Servicio3");
			servicio4.setNombre("Servicio4");
			
			servicio1 = servicioDAO.save(servicio1);
			servicio2 = servicioDAO.save(servicio2);
			servicio3 = servicioDAO.save(servicio3);
			servicio4 = servicioDAO.save(servicio4);
			
			List<Servicio> listaServicios = new ArrayList<Servicio>();
			listaServicios.add(servicio1);
			listaServicios.add(servicio2);
			listaServicios.add(servicio3);
			listaServicios.add(servicio4);
			usuario.setServicios(listaServicios);
			
			
			usuario = usuarioDAO.save(usuario);
			System.out.println("Guardado de usuario correcto");
			Reserva reserva1 = new Reserva();
			reserva1.setUsuario(usuario);
			reserva1.setServicio(servicio1);
			reserva1.setEmail("reserva@gmail.com");
			
			reserva1 = reservaDAO.save(reserva1);
			usuarioDAO.borradoLogico(usuario);
			 */
			usuario=new Usuario("Pedro", "Rodriguez", Date.valueOf("1986-05-29"), "PedroRodriguez");
			usuarioDAO.save(usuario);
			usuario=new Usuario("Juan", "Cruz", Date.valueOf("1991-05-12"), "JuanCruz");
			usuarioDAO.save(usuario);
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	public static void imprimirMisServicios(){
		Usuario user=usuarioDAO.recuperar(1L);
		List<Servicio> misServicios=user.getServicios();
		for (Servicio s:misServicios) {
			System.out.println("Servicio: "+s.getNombre());
		}
	}

}


