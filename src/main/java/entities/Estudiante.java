package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apeliido;

    @Column(name = "carrera", nullable = false)
    private String carrera;

    @Column(name = "semestre", nullable = false)
    private int semestre;

    @OneToMany(mappedBy = "estudiante")
    private Set<Participante> participantes;

    public Estudiante(){
    }

    public Estudiante(String codigo, String nombre, String apeliido, String carrera, int semestre){
        setCodigo(codigo);
        setNombre(nombre);
        setApeliido(apeliido);
        setCarrera(carrera);
        setSemestre(semestre);
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
