package sistema.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="medionotificacion")
public class MedioNotificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedioNotificacion;

    @Basic
    private String descripcion;
    private boolean estado;
}

