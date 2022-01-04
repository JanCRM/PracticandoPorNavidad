package ejercicios;
import java.util.Scanner;

public class MediaTresNumeros {


    public static float MediaNumeros(){
        Scanner sc = new Scanner(System.in);

        float contador=0;
        float suma = 0;
        float media=0;
        do {
            contador++;
            try{
                System.out.println("dime el primer número "+contador+": ");
                float num = sc.nextFloat();
                suma+=num;
            }catch (Exception ex){
                sc.next();
            }
        }while (contador<3);
        return media = suma/contador;
    }



}
