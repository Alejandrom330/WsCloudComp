package videojuegojpa.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import videojuegojpa.modelo.entidad.Videojuego;

@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer> {

}
