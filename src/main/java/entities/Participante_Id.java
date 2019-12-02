package entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class Participante_Id implements Serializable {

    @ManyToOne(optional = false)
    @JoinColumn(name = "proyecto", nullable = false)
    private Proyecto proyecto;

    @ManyToOne(optional = false)
    @JoinColumn(name = "profesor", nullable = false)
    private Profesor profesor;

    public  Participante_Id(){
    }

    public Participante_Id(Proyecto proyecto, Profesor profesor){
        setProyecto(proyecto);
        setProfesor(profesor);
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    private void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    private void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
