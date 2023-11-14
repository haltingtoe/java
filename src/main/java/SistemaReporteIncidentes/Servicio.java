package SistemaReporteIncidentes;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Servicio {
    private int idServicio;
    private String nombre;
    private boolean estado;
    private ArrayList<String> listaDeServicios;


    public ArrayList<String> serviciosDisponibles(){
        return listaDeServicios;
    }
}
