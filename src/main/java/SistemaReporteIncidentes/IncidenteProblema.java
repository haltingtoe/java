package SistemaReporteIncidentes;

import lombok.Data;

@Data
public class IncidenteProblema extends Problema{
    int idIncidenteProblema;
    int idIncidente;
    int idProblema;
    boolean estado ;

}
