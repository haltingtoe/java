package SistemaReporteIncidentes;


import jakarta.persistence.Column;
import jakarta.persistence.Table;
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
