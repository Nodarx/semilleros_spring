package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "imagen", nullable = false)
    private String imagen;

    @ManyToOne(optional = false)
    @JoinColumn(name = "profesor", nullable = false)
    private Profesor profesor;

    public Evento(){
    }

    public Evento(String titulo, Date fecha, String tipo, String imagen, Profesor profesor){
        setTitulo(titulo);
        setFecha(fecha);
        setTipo(tipo);
        setImagen(imagen);
        setProfesor(profesor);
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    private void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

}
