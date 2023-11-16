package SistemaReporteIncidentes;

import lombok.Data;

@Data
public class Tecnico   {
   private int idTecnico;
   private String nombre;
   private int idMedioNotificacion ;
   private boolean estado;
}
