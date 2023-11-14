package SistemaReporteIncidentes;


import lombok.Data;

import java.util.ArrayList;

@Data

public class Cliente {
  private   int idCliente;
  private   String razonSocial;
  private String CUIT;
 private    boolean estado;


 public ArrayList<Servicio> serviciosCliente(){
     Servicio servicio = new Servicio();
     ArrayList<String> lista = servicio.serviciosDisponibles();
     return null;
 }


}
