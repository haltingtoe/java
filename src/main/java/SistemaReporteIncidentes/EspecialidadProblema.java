package SistemaReporteIncidentes;

import lombok.Data;

@Data
public class EspecialidadProblema extends Problema {
    int idEspecialidadProblema;
    int idProblema;
    int idEspecialidad;
    boolean estado;

}
