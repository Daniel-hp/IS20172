package Mapeo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jonathan
 */
@Entity
@Table(name="persona")
public class Persona {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int id_persona;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "fechanac")
    private String fechanac;
 @Column(name = "carrera")
    private String carrera;
    public int getId_profesor() {
        return id_persona;
    }

    public void setIdPersona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fechanac;
    }

    public void setFecha(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String c) {
        this.carrera=c;
    }
    
    
    
    
    
    
}