package semillero.back;

import entities.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.Estudiante_Repository;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Estudiante_Controller {

    @Autowired
    private Estudiante_Repository estudiante_repository;

    @GetMapping("/estudiantes/{carrera}")
    public List<Estudiante> obtenerEstudiantes(@PathVariable String carrera){
        return estudiante_repository.findAllByCarrera(carrera);
    }

}
