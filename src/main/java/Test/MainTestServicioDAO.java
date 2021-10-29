package Test;

import java.util.ArrayList;
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
		// TODO Auto-generated method stub
		imprimirTodosActivos();
	}
	public static void agregarServicios() throws Exception {
		Usuario user= usuarioDAO.recuperar(1L);
		TipoServicio t=(TipoServicio) tipoDAO.recuperar(1L);
		System.out.println("El tipo obtenido es: "+t.getNombre());
		Servicio s1=new Servicio("parrillada", t, "descripcion", "url", 23234234L ,"instagram","twiter");
		servicioDAO.save(s1);
		List<Servicio> servicios=new ArrayList<Servicio>();
		servicios.add(s1);
		user.setServicios(servicios);
		usuarioDAO.actualizar(user);
	}
	
	public static void imprimirTodosActivos() throws Exception {
		List<Servicio> lista= servicioDAO.recuperarActivos();
		if (lista.size()>0) {
			for (Servicio s: lista) {
				System.out.println("Servicio: "+s.getNombre());
			}
		}else {
			System.out.println("No hay servicios");
		}
	}

}
