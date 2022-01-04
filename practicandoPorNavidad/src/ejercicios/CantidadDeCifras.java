package ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class CantidadDeCifras {

    public static void numCifras() throws IOException {
        Scanner sc =new Scanner(System.in);

        int contador = 0;
        char salir;
        do {
            System.out.println("Introduce el número..");
            float num = sc.nextFloat();
            while (num != 0){
                num=num/10;
                contador++;
            }
            System.out.println("El numero de cifras es ["+contador+"]");
            System.out.println("Si desea continual introduce [s/S], si deseas salir [n/N].");
            salir = (char) System.in.read();
        }while (salir != 'n' && salir != 'N');
    }


}
