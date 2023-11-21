package sistema.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="clienteservicio")
public class ClienteServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClienteServicio;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idServicio")
    private Servicio servicio;

    @Column(name="estado")
    private boolean estado;

}
