package dao;

import javax.persistence.Query;

import JPAUtil.Conexion;
import entities.Imagen;


public class ImagenDAOImpl extends GenericDAOImpl<Imagen> implements ImagenDAO{

	public ImagenDAOImpl(Class<Imagen> clase) {
		super(clase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Query makeQuery(Imagen imagen) {
		Query q = Conexion.getManager().createQuery("SELECT u FROM TipoEvento u WHERE u.nombre = :nombre AND u.activo = :activo AND u.servicio = :servicio");
		q.setParameter("nombre",imagen.getNombre());
		q.setParameter("servicio",imagen.getServicio());
		q.setParameter("activo",Boolean.TRUE);
		return q;
	}

	@Override
	public void borradoLogico(Imagen entity) {
		entity=	this.recuperar(entity.getId());
		entity.setActivo(false);
		this.actualizar(entity);
	}

}
