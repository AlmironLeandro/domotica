package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

public class LuzJardin implements productoElectronico {

    private boolean encendida = false;

    public void on() {
        encendida = true;
        System.out.println("Luz Jardin encendida");
    }

    public void off() {
        encendida = false;
        System.out.println("Luz Jardin apagada");
    }

    void definirHoraAnochecer(DateTime time) {
        System.out.println("Luz Jardin definiendo hora de anochecer:" + time);
    }

    void definirHoraAmanecer(DateTime time) {
        System.out.println("Luz Jardin definiendo hora de amanecer:" + time);
    }

    public boolean isEncendida() {
        return encendida;
    }
}
