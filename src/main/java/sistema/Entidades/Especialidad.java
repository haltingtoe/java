package sistema.Entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;

    @ManyToMany
    @JoinTable(
            name = "especialidadproblema",
            joinColumns = @JoinColumn(name = "idEspecialidad"),
            inverseJoinColumns = @JoinColumn(name = "idProblema")
    )
    private List<Problema> problemas;

    @Basic
    private String descripcion;
    private boolean estado;
}
