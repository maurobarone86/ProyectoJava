package dao;

import entities.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	public void save(Usuario usuario)throws Exception;

	public Usuario existe(String nombreusuario) throws Exception;
}
