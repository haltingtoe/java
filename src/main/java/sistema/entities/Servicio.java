package sistema.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;

    @Basic
    private String nombre;
    private boolean estado;

}
