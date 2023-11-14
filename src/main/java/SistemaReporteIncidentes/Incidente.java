package SistemaReporteIncidentes;

import lombok.Data;

@Data
public class Incidente {
    int idIncidente;
    int idCliente;
    int idServicio;
    int idTecnico;
    String Descripcion;
    String fechaIngreso;
    String fechaPosResolucion;
    int horasEstimadas;
    boolean resuelto;
}
