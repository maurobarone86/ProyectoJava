package dao;

import javax.persistence.Query;
import JPAUtil.Conexion;
import entities.Usuario;

public class UsuarioDAOImpl  extends GenericDAOImpl<Usuario> implements UsuarioDAO{

	
	public UsuarioDAOImpl(Class<Usuario> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	
	
	

	@Override
	public Usuario obtenerUser(String nombreUsuario) {
		Usuario userAux = new Usuario();
		userAux.setNombreUsuario(nombreUsuario);
		Usuario user= super.existe(userAux);
		return user;
	}
	
	public Query makeQuery(Usuario usuario) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombre AND u.activo = :activo");
		q.setParameter("nombre",usuario.getNombreUsuario());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}





	
	
	
	
}
