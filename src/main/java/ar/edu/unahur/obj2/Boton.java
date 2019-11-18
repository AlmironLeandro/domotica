package ar.edu.unahur.obj2;

public class Boton {
  productoElectronico producto;
  productoElectronico aux;

    public Boton(productoElectronico producto) {
        this.producto = producto;
    }
    void intercambiarProductoElectronico(productoElectronico p1){
        aux = producto;
        producto = p1;
        p1 = aux;
    }
}
