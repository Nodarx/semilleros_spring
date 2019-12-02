package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "contraseña", nullable = false)
    private String contraseña;

    @OneToMany(mappedBy = "id.profesor")
    private Set<Participante> participantes;

    @OneToMany(mappedBy = "profesor")
    private Set<Evento> eventos;

    @OneToMany(mappedBy = "profesor")
    private Set<Publicacion> publicaciones;

    public Profesor(){
    }

    public Profesor(String correo, String nombre, String apellido, String contraseña){
        setCorreo(correo);
        setNombre(nombre);
        setApellido(apellido);
        setContraseña(contraseña);
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
