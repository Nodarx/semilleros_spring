package semillero.back;

import entities.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repositories.Profesor_Repository;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Profesor_Controller {

    @Autowired
    private Profesor_Repository profesor_repository;

    @GetMapping("/profesores")
    public List<Profesor> obtenerPofesores(){
        return profesor_repository.findAll();
    }

}
