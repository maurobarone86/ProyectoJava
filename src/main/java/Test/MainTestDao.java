package Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


import dao.EventoDAO;
import dao.EventoDAOImpl;

import dao.ServicioDAO;
import dao.ServicioDAOImpl;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.Evento;
import entities.Servicio;
import entities.Usuario;


public class MainTestDao {
	private static UsuarioDAO usuarioDAO= new UsuarioDAOImpl(Usuario.class);
	private static EventoDAO eventoDAO= new EventoDAOImpl(Evento.class);
	private static ServicioDAO servicioDAO= new ServicioDAOImpl(Servicio.class);
	private static Usuario usuario;
	
	
	public static void main(String[] args) throws Exception  {
		
		agregarUser("Mauro","Barone");
		}
	public static void agregarUser(String nombre, String apellido) throws Exception {
		try {
			
			
			usuario = new Usuario();
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			
			Date cumple = Date.valueOf("1986-05-29");
			usuario.setNombreUsuario("maurobarone1");
			usuario.setFechaNac(cumple);
			
			
			Evento evento1 = new Evento();
			Evento evento2 = new Evento();
			Evento evento3 = new Evento();
			Evento evento4 = new Evento();
			Evento evento5 = new Evento();
			Evento evento6 = new Evento();
			evento1.setNombre("Evento1");
			evento2.setNombre("Evento2");
			evento3.setNombre("Evento3");
			evento4.setNombre("Evento4");
			evento5.setNombre("Evento5");
			evento6.setNombre("Evento6");
			evento1.setDireccion("14y50");
			evento2.setDireccion("14y51");
			evento3.setDireccion("14y52");
			evento4.setDireccion("14y53");
			evento5.setDireccion("14y54");
			evento6.setDireccion("14y54");
			evento1.setFecha(Date.valueOf("2021-12-01"));
			evento2.setFecha(Date.valueOf("2021-12-02"));
			evento3.setFecha(Date.valueOf("2021-12-03"));
			evento4.setFecha(Date.valueOf("2021-12-04"));
			evento5.setFecha(Date.valueOf("2021-12-05"));
			evento6.setFecha(Date.valueOf("2021-12-05"));
			
			evento1=eventoDAO.actualizar(evento1);
			evento2=eventoDAO.actualizar(evento2);
			evento3=eventoDAO.actualizar(evento3);
			evento4=eventoDAO.actualizar(evento4);
			evento5=eventoDAO.actualizar(evento5);
			
			
			List<Evento> listaEventos = new ArrayList<Evento>();
			listaEventos.add(evento1);
			listaEventos.add(evento2);
			listaEventos.add(evento3);
			listaEventos.add(evento4);
			listaEventos.add(evento5);
			listaEventos.add(evento6);
			System.out.println("muesto id ");
			evento6.getId();
			usuario.setEventos(listaEventos);
			Servicio servicio1 = new Servicio();
			Servicio servicio2 = new Servicio();
			Servicio servicio3 = new Servicio();
			Servicio servicio4 = new Servicio();
			servicio1.setNombre("Servicio1");
			servicio2.setNombre("Servicio2");
			servicio3.setNombre("Servicio3");
			servicio4.setNombre("Servicio4");
			
			servicio1=servicioDAO.actualizar(servicio1);
			servicio2=servicioDAO.actualizar(servicio2);
			servicio3=servicioDAO.actualizar(servicio3);
			servicio4=servicioDAO.actualizar(servicio4);
			
			List<Servicio> listaServicios = new ArrayList<Servicio>();
			listaServicios.add(servicio1);
			listaServicios.add(servicio2);
			listaServicios.add(servicio3);
			listaServicios.add(servicio4);
			usuario.setServicios(listaServicios);
			
			// Se persiste un usuario con una lista de Evento y un lista de Servicios
			usuario = usuarioDAO.actualizar(usuario);
			System.out.println("Guardado de usuario correcto");
			
			//Se recupera el usuario de la base de datos y su lista de eventos
			usuario = usuarioDAO.recuperar(usuario.getId());
			List<Evento> listaE = usuario.getEventos();
			System.out.println("Primera lista con los eventos sin borrar");
			for (Evento e:listaE) {
				
				System.out.println(e.getActivo());
				}
			
			//se realiza la eliminacion logica de un elemneto de la lista
			Evento evento =listaE.get(0);
			evento.setActivo(false);
			usuarioDAO.actualizar(usuario);
			// se muestra por consola que se realizo la eliminacion logica
			usuario = usuarioDAO.recuperar(usuario.getId());
			List<Evento> listaR = usuario.getEventos();
			System.out.println("Segunda lista con un evento borrado");
			for (Evento e:listaR) {
				
				System.out.println(e.getActivo());
				}
			
			//Se persisten mas usuarios
			Usuario usuario1=new Usuario("Pedro", "Rodriguez", Date.valueOf("1986-05-29"), "PedroRodriguez");
			usuario1= usuarioDAO.actualizar(usuario1);
			System.out.println("Guardado de usuario correcto");
			Usuario usuario2=new Usuario("Juan", "Cruz", Date.valueOf("1991-05-12"), "JuanCruz");
			usuario2= usuarioDAO.actualizar(usuario2);
			System.out.println("Guardado de usuario correcto");
			
			//se realiza el borrado logico de un usuario
			usuario2 = usuarioDAO.recuperar(usuario2.getId());
			usuario2.setActivo(false);
			usuarioDAO.actualizar(usuario2);
			System.out.println("se borro el usuario");
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


