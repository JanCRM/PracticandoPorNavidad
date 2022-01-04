package ejercicios;

public class AnioBisiesto {

    public static boolean isBisiesto(int anio){
        boolean isBisiesto = false;
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            isBisiesto = true;
        }
        return isBisiesto;
    }

}
