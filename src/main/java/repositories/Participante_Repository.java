package repositories;

import entities.Participante;
import entities.Participante_Id;
import entities.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Participante_Repository extends JpaRepository<Participante, Participante_Id> {
    List<Participante> findAllByIdProyecto(Proyecto proyecto);
}
