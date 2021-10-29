package dao;

import javax.persistence.Query;

import entities.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	
	public Usuario obtenerUser(String nombreUsuario);
	public Query makeQuery(Usuario usuario);
	
}
