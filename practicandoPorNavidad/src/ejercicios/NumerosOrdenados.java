package ejercicios;

import java.util.Scanner;

public class NumerosOrdenados {

    public static void numOrdenados(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Introduce el primer numero.");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero.");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero.");
        int num3 = sc.nextInt();

        if (num1<num2 && num2<num3){
            System.out.println("Los números se han introducido de forma ordenados ["+num1+" | "+num2+" | "+num3+"]");
        }else {
            System.out.println("Los números no se han introducido dos forma ordenada.");
        }


    }


}
