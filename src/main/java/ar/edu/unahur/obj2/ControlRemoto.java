package ar.edu.unahur.obj2;

import java.util.ArrayList;

public class ControlRemoto {
    ArrayList<Boton> botones= new ArrayList<Boton>(10);

    public void intercambiarBoton(Boton b1, Boton b2){
        b1.intercambiarProductoElectronico(b2.producto);
    }

    public void botonOnEjecutado(int numeroSlot) {
        botones.get(numeroSlot).producto.on();

    }

    public void botonOffnEjecutado(int numeroSlot) {
        botones.get(numeroSlot).producto.off();
    }

}
