package co.com.etn.componentes;

import java.io.Serializable;

/**
 * Created by alexander.vasquez on 9/09/2017.
 */

class Datos  implements Serializable {

    private int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
