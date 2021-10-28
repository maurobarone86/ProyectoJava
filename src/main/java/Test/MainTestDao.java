package Test;





import java.sql.Date;
import java.util.List;

import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.Servicio;
import entities.Usuario;

public class MainTestDao {
	private static UsuarioDAO usuarioDAO= new UsuarioDAOImpl(Usuario.class);
	private static Usuario usuario;
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		imprimirMisServicios();
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
			usuario.setNombreUsuario("maurobarone");
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
			List<Servicio> listaServicios = new ArrayList<Servicio>();
			listaServicios.add(servicio1);
			listaServicios.add(servicio2);
			listaServicios.add(servicio3);
			listaServicios.add(servicio4);
			usuario.setServicios(listaServicios);
			 * 
			 * */
			
			
			
			usuarioDAO.save(usuario);
			System.out.println("Guardado de usuario correcto");
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


