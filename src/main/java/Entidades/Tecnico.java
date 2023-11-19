package Entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="tecnico")
public class Tecnico {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idTecnico;

   @ManyToOne
   @JoinColumn(name = "idEspecialidad")
   private Especialidad especialidad;

   @ManyToOne
   @JoinColumn(name = "idMedioNotificacion")
   private MedioNotificacion medioNotificacion;

   @Basic
   private String nombre;
   private boolean estado;
}
