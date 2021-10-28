package dao;

import entities.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	
	public Usuario obtenerUser(String nombreUsuario);
	public void save(Usuario usaurio) throws Exception;
}
