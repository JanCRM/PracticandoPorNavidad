package ejercicios;

import javax.management.Descriptor;

public class PrecioBillete {

    public static double determinarPrecio(int dias, int kilometros){
        final double PRECIO_KILOMETRO = 2.5;
        double precioBillete = 0;
        double descuento = (30 * PRECIO_KILOMETRO)/100;
        double precioConDescuento = PRECIO_KILOMETRO - descuento;
        if (dias > 7 && kilometros > 800){
            precioBillete = kilometros * precioConDescuento;
        }else {
            precioBillete = kilometros * PRECIO_KILOMETRO;
        }
        return precioBillete;
    }





}
