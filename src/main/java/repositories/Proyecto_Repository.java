package repositories;

import entities.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Proyecto_Repository extends JpaRepository<Proyecto, Integer> {
    List<Proyecto> findAllByEstado(String estado);
}
