package ejercicios;

import java.util.*;

public class NumeroSecreto {

    public static void adivinaElNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tienes 5 intentos para adivinar el número secreto.");
        String continuar;

        do {
            int intentos = 5;
            int numSecreto = (int) (Math.random() * 100 + 1);
            System.out.println("Introduce el número, tienes " + intentos + " intento ");
            do {

                int numIntroducido = sc.nextInt();
                if (numSecreto > numIntroducido) {
                    System.out.println("El número es mayor.");
                    intentos--;
                } else if (numSecreto < numIntroducido) {
                    System.out.println("El número es menor.");
                    intentos--;
                } else {
                    System.out.println("¡Has acertado!");
                    System.out.println("Necesitaste " + intentos + " intentos.");
                    System.out.println("El número secreto es : [" + numSecreto + "]");
                }
            } while (intentos > 0);

            System.out.println("Deseas continuar juegando (si/no).");
            continuar = sc.next().toLowerCase(Locale.ROOT);
        } while (continuar.equals("si"));
        System.out.println("¡El juego a finalizado!");
    }



}
