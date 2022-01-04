package ejercicios;

import java.util.Scanner;

public class NumerosConsecutivos {

    public static void numerosConsecutivos(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Introduce el primer numero.");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero.");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero.");
        int num3 = sc.nextInt();

        if (num1 +1 == num2 && num2+1 == num3){
            System.out.println("Los números introducido son consecutivos ["+num1+" | "+num2+" | "+num3+"]");
        }else {
            System.out.println("Los números no son son consecutivos ["+num1+" | "+num2+" | "+num3+"]");
        }


    }


}
