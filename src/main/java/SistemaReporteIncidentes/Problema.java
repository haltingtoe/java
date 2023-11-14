package SistemaReporteIncidentes;

import lombok.Data;

@Data
public abstract class Problema {
   private int idProblema ;
   private String tipoProblema ;
   private int horasEstimadas ;
   private boolean estado;

}
