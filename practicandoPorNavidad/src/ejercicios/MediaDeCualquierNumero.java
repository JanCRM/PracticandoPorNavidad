package ejercicios;


import java.util.Scanner;

public class MediaDeCualquierNumero {

    public static int media(){
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int contador = 0;
        String continuar;
        boolean salir = false;
        do {
            System.out.println("Introduce el primer número..");
            int num = sc.nextInt();
            suma+=num;
            contador++;

           /* System.out.println("Desea continuar [S/N]");
            continuar = sc.next();
            continuar.equals("s") || continuar.equals("S")
            */
            if (num<0) salir = true;
        }while (!salir);

        System.out.println("Numero de notas introducidos es "+contador);
        return suma/contador;
    }

}
