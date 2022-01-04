package ejercicios;

import java.util.Scanner;

public class ConversorGrados {

    public static void ConvertirGrados(){
        Scanner sc =new Scanner(System.in);

        System.out.println("Dime que grados quieres convertir [cel] o [fah]");
        String grados = sc.nextLine();
        switch (grados){
            case "cel":
                System.out.println("Introduce los grados celsius");
                int celsius = sc.nextInt();
                int f = (celsius*9/5)+32;
                System.out.println("Los grados fahrenheit son "+f);
                break;
            case "fah":
                System.out.println("Introduce los grados fahrenheit");
                int farenheit = sc.nextInt();
                int c = (farenheit-32)*5/9;
                System.out.println("Los grados celsius son "+c);
                break;
            default:
        }
    }


}
