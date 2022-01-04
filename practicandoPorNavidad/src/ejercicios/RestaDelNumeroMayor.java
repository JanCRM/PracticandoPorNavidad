package ejercicios;

import java.util.Scanner;

public class RestaDelNumeroMayor {

    public static void RestaMayor(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Introduce el primer número.");
        int num1 = sc.nextInt();
        System.out.println("Introduce el primer segundo número.");
        int num2 = sc.nextInt();
        int res=0;
        if (num1>num2){
            res = num1-num2;
            System.out.println("El primero es el mayor ["+num1+"] y la resta es "+res+".");
        }else {
            System.out.println("El primer numero es menor que el primero ["+num1+"] ["+num2+"].");
        }



    }
}
