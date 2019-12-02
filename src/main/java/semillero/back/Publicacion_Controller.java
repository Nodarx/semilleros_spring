package semillero.back;

import entities.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repositories.Publicacion_Repository;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Publicacion_Controller {

    @Autowired
    private Publicacion_Repository publicacion_repository;

    @GetMapping("/publicaciones")
    public List<Publicacion> obtenerPublicaciones(){
        return publicacion_repository.findAll();
    }

}
