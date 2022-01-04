package ejercicios;

public class RestaSucesivas {

    public static void restaSuces(int dividendo, int divisor){
        int cociente = 0;
        if (dividendo >= divisor){
            while (dividendo >= divisor){
                dividendo  = dividendo-divisor;
                cociente++;
            }
            System.out.println("El cociente de la división  es "+cociente);
            System.out.println("El resto de la división es "+dividendo);
        }else {
            System.err.println("La division no se puede realizar porque el dividendo es menor al divisor...");
        }

    }



}
