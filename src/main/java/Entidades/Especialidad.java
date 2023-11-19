package Entidades;

import lombok.Data;

@Data
public class Especialidad {
    int idEspecialidad;
    String descripcion;
    int idTecnico;
    boolean estado;
}
