package dao;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import JPAUtil.Conexion;
import entities.Usuario;

public class UsuarioDAOImpl  extends GenericDAOImpl<Usuario> implements UsuarioDAO{

	
	public UsuarioDAOImpl(Class<Usuario> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	private GenericDAO<Usuario> genericDAO= new GenericDAOImpl<Usuario>(Usuario.class);
	
	@Override
	public void save(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		try {
			Usuario usuarioAux = existe(usuario.getNombreUsuario());
			if (usuarioAux != null){
				genericDAO.actualizar(usuarioAux);
				}
			else {
				genericDAO.persistir(usuario);
				}
			}
		catch (Exception e) {
			throw e;
			}
	}
	
	@Override
	public Usuario existe(String nombreusuario) throws NoResultException, NonUniqueResultException {
		Query q = Conexion.getManager().createQuery("SELECT u FROM Usuario u WHERE u.nombreUsuario = :nom AND u.activo = :logic");
		q.setParameter("nom",nombreusuario);
		q.setParameter("logic",Boolean.TRUE);
				
		try {
			Usuario usuario =(Usuario) q.getSingleResult();
			System.out.println("existe el usuario, lo actualizo");
			
			return usuario;
			}
		catch (NoResultException e) {
			System.out.println("la consulta no trajo nada, se persiste el usuario");
			return null;
		}
		catch (NonUniqueResultException e1) {
			System.out.println(nombreusuario+ "existe mas de un usuario activo con este nombre de usuario, no se puede actualizar");
			throw e1;
		}
		
	}
	
	
	
	
}
