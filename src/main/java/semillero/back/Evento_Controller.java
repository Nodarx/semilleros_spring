package semillero.back;

import entities.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repositories.Evento_Repository;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Evento_Controller {

    @Autowired
    private Evento_Repository evento_repository;

    @GetMapping("/eventos")
    public List<Evento> obtenerEventos(){
        return evento_repository.findAll();
    }

}
