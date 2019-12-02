package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "titulo",nullable = false)
    private String titulo;

    @Column(name = "texto", nullable = false)
    private String texto;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @ManyToOne(optional = false)
    @JoinColumn(name = "profesor", nullable = false)
    private Profesor profesor;

    public Publicacion(){
    }

    public Publicacion(String titulo, String texto, Date fecha, Profesor profesor){
        setTitulo(titulo);
        setTexto(texto);
        setFecha(fecha);
        setProfesor(profesor);
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    private void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
