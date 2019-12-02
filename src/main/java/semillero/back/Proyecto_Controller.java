package semillero.back;

import entities.Proyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.Proyecto_Repository;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class Proyecto_Controller {

    @Autowired
    private Proyecto_Repository proyecto_repository;

    @GetMapping("/proyectos/{estado}")
    public List<Proyecto> obtenerProyectos(@PathVariable String estado){
        return proyecto_repository.findAllByEstado(estado);
    }

}
