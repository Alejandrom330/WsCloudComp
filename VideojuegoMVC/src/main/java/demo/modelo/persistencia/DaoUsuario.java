package demo.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.modelo.entidades.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer>{
	
	//Con JPA podemos crear busquedas usando convenciones de creacio
	//de metodos. Todo metodo que empiece con las palabras
	//"findBy" + Atributo, JPA data te creara la consulta
	//automaticamente
	
	public Usuario findByNombre(String nombre);
	
	
	public Usuario findByNombreAndPsw(String nombre, String psw);
}
