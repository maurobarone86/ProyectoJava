package dao;

import entities.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	public void save(Usuario usuario)throws Exception;
	public Usuario obtenerUser(String nombreUsuario);
	public Usuario existe(String nombreusuario) throws Exception;
}
