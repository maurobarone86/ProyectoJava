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


