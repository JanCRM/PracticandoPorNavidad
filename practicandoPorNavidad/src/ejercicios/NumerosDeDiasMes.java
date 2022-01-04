package ejercicios;

import java.util.Scanner;

public class NumerosDeDiasMes {

    public static void numDiasMes(boolean isBisiesto){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el mes que deseas comprobar..");
        String mes = sc.nextLine();

        switch (mes) {
            case "enero":
                System.out.println("El mes de enero tiene 31 días");
                break;
            case "febrero":
                if (isBisiesto)
                    System.out.println("El mes de febrero tiene 29 días");
                else
                    System.out.println("El mes de febrero tiene 28 días");
                break;
            case "marzo":
                System.out.println("El mes de marzo tiene 31 días");
                break;
            case "abril":
                System.out.println("El mes de abril tiene 30 días");
                break;
            case "mayo":
                System.out.println("El mes de mayo tiene 31 días");
                break;
            case "junio":
                System.out.println("El mes de junio tiene 30 días");
                break;
            case "julio":
                System.out.println("El mes de julio tiene 31 días");
                break;
            case "agosto":
                System.out.println("El mes de agosto tiene 31 días");
                break;
            case "septiembre":
                System.out.println("El mes de septiembre tiene 30 días");
                break;
            case "octubre":
                System.out.println("El mes de octubre tiene 31 días");
                break;
            case "noviembre":
                System.out.println("El mes de noviembre tiene 30 días");
                break;
            case "diciembre":
                System.out.println("El mes de diciembre tiene 31 días");
                break;
            default:
                System.out.println("El mes ingresado no existe");
                break;
        }

    }

}
