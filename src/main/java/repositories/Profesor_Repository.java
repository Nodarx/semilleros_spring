package repositories;

import entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Profesor_Repository extends JpaRepository<Profesor, Integer> {
}
