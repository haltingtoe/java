package SistemaReporteIncidentes;

import lombok.Data;

@Data
public class Tecnico extends Tecnicos{
   private int idTecnico;
   private String nombre;
   private int idMedioNotificacion ;
   private boolean estado;
}
