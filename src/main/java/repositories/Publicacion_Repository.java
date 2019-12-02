package repositories;

import entities.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Publicacion_Repository extends JpaRepository<Publicacion, Integer> {
}
