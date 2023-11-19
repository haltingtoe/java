package Entidades;

import lombok.Data;

@Data
public class IncidenteProblema {
    int idIncidenteProblema;
    int idIncidente;
    int idProblema;
    boolean estado;

}
