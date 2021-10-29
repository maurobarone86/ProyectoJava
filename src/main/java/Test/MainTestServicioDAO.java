package Test;

import java.util.List;

import dao.ServicioDAO;
import dao.ServicioDAOImpl;
import dao.TipoServicioDAOImpl;
import dao.TipoServicioDAO;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import entities.Servicio;
import entities.TipoServicio;
import entities.Usuario;

public class MainTestServicioDAO {
	private static UsuarioDAO usuarioDAO= new UsuarioDAOImpl(Usuario.class);
	private static TipoServicioDAO tipoDAO= new TipoServicioDAOImpl(TipoServicio.class);
	private static ServicioDAO servicioDAO=new ServicioDAOImpl(Servicio.class);
	public static void main(String[] args) throws Exception {
		//agregarServicios();
	}
	public static void agregarServicios() throws Exception {
		Usuario user= usuarioDAO.obtenerUser("PedroRodriguez");
		TipoServicio t= tipoDAO.obtenerTipoServicio("catering");
		if (user !=null && t!=null) {
			Servicio s1=new Servicio("Parrillada", t, "descripcion", "url", 23234234L ,"instagram","twiter");
			Servicio s2=new Servicio("Sandwich", t, "descripcion", "url", 2323424L ,"instagram","twiter");
			user.setServicio(s1);
			user.setServicio(s2);
			usuarioDAO.actualizar(user);
		}else {
			System.out.println("Algo salio mal ,"+user+ ",,,,"+t);
		}
	}
	
	public static void imprimirTodosActivos() throws Exception {
		List<Servicio> lista= servicioDAO.recuperarActivos();
		imprimir(lista, "Servicio Activo: ");
	}
	public static void imprimirPorID() {
		Servicio ser= servicioDAO.recuperar(1L);
		System.out.println("Servicio por id: "+ser.getNombre());
	}
	public static void imprimirTodosYordenado() throws Exception {
		List<Servicio> lista= servicioDAO.recuperarTodos("nombre");
		imprimir(lista, "Servicio Con Orden by: ");
	}
	public static void imprimir(List<Servicio> lista, String estado) {
		if (lista.size()>0) {
			for (Servicio s: lista) {
				System.out.println(estado+s);
			}
		}else {
			System.out.println("No hay servicios por: "+estado);
		}
	}

}
