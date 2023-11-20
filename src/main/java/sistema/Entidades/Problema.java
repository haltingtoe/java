package sistema.Entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="problema")
public class Problema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProblema;

    @Basic
    private String tipoProblema;
    private int horasEstimadas;
    private boolean estado;

}
