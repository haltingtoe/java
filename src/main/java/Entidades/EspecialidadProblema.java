package Entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="especialidadproblema")
public class EspecialidadProblema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidadProblema;

    @ManyToOne
    @JoinColumn(name = "idProblema")
    private Problema problema;

    @ManyToOne
    @JoinColumn(name = "idEspecialidad")
    private Especialidad especialidad;

    @Basic
    private boolean estado;

}
