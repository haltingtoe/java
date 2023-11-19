package Entidades;

import lombok.Data;

@Data
public class EspecialidadProblema {
    int idEspecialidadProblema;
    int idProblema;
    int idEspecialidad;
    boolean estado;

}
