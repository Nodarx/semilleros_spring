package semillero.back;

import entities.Estudiante;
import entities.Participante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.Estudiante_Repository;
import repositories.Participante_Repository;
import repositories.Proyecto_Repository;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class Participante_Controller {

    @Autowired
    private Participante_Repository participante_repository;

    @Autowired
    private Proyecto_Repository proyecto_repository;

    @Autowired
    private Estudiante_Repository estudiante_repository;

    @GetMapping("/participantes/{proyecto}")
    public List<Estudiante> obtenerEstudiantes(@PathVariable int proyecto){
        if(proyecto_repository.existsById(proyecto)){
            List<Participante> participantes = participante_repository.findAllByIdProyecto(proyecto_repository.getOne(proyecto));
            List<Estudiante> estudiantes = new ArrayList<>();

            for (Participante participante: participantes) {
                estudiantes.add(participante.getEstudiante());
            }

            return estudiantes;
        }

        return null;
    }
}
