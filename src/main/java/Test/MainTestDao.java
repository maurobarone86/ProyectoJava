package Test;





import java.sql.Date;



import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.Usuario;

public class MainTestDao {
	private static UsuarioDAO usuarioDAO= new UsuarioDAOImpl(Usuario.class);
	private static Usuario usuario;
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			//String nombre, String apellido, Date fechaNac, String direccion, String nombreUsuario,
			//String password,  List<Evento> eventos, List<Servicio> servicios
			
			usuario = new Usuario();
			usuario.setNombre("Mauro");
			usuario.setApellido("Barone");
			
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

	}


