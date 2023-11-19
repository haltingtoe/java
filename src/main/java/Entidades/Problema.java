package Entidades;

import lombok.Data;

@Data
public class Problema {
    private int idProblema;
    private String tipoProblema;
    private int horasEstimadas;
    private boolean estado;

}
