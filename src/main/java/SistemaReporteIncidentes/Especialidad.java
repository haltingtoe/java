package SistemaReporteIncidentes;

import lombok.Data;

@Data
public class Especialidad {
    int idEspecialidad;
    String descripcion;
    int idTecnico;
    boolean estado;
}
