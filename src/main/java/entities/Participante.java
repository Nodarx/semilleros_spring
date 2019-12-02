package entities;

import javax.persistence.*;

@Entity
@Table(name = "Participante")
public class Participante {

    @EmbeddedId
    private Participante_Id id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "Estudiante", nullable = false)
    private Estudiante estudiante;

    public Participante(){
    }

    public Participante(Proyecto proyecto, Profesor profesor, Estudiante estudiante) {
        setId(new Participante_Id(proyecto,profesor));
        setEstudiante(estudiante);
    }

    public Participante(Participante_Id id, Estudiante estudiante){
        setId(id);
        setEstudiante(estudiante);
    }

    public Participante_Id getId() {
        return id;
    }

    public Proyecto getProyecto(){
        return id.getProyecto();
    }

    public Profesor getProfesor() {
        return id.getProfesor();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    private void setId(Participante_Id id) {
        this.id = id;
    }

    private void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}
