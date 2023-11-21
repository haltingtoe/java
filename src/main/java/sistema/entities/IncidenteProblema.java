package sistema.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "incidenteproblema")
public class IncidenteProblema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidenteProblema;

    @ManyToOne
    @JoinColumn(name = "idIncidente")
    private Incidente incidente;

    @ManyToOne
    @JoinColumn(name = "idProblema")
    private Problema problema;

    @Basic
    boolean estado;

}
