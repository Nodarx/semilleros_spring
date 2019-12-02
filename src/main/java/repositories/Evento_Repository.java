package repositories;

import entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Evento_Repository extends JpaRepository<Evento, Integer> {
}
