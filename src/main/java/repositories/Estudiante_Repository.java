package repositories;

import entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Estudiante_Repository extends JpaRepository<Estudiante, Integer> {
    List<Estudiante> findAllByCarrera(String carrera);
}
