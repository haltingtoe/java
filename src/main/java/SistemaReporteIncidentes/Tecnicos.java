package SistemaReporteIncidentes;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract  class Tecnicos {

    private List<String> areas;
    private List<String> tecnicosActivos;
    private boolean isDisponible;


    public Tecnicos( boolean isDisponible) {
        this.areas = new ArrayList<>() ;
        this.tecnicosActivos = new ArrayList<>() ;
        this.isDisponible = isDisponible;

    }

    private Object mapTecnicpArea(Tecnicos tecnicos){


            return tecnicoDisponible();
    }
    public String tecnicoDisponible( ){

        return null;
    }

}
