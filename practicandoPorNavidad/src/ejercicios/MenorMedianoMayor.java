package ejercicios;

public class MenorMedianoMayor {

    public static void numeroMayorMediano(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println("El mayor es ["+num1+"], el mediano es ["+num2+"], el menos es ["+num3+"]");
        }else if (num1 > num2 && num1 > num3 && num3 > num2){
            System.out.println("El mayor es ["+num1+"], el mediano es ["+num3+"], el menos es ["+num2+"]");
        }else if (num2 > num1 && num2 > num3 && num1 > num3){
            System.out.println("El mayor es ["+num2+"], el mediano es ["+num1+"], el menos es ["+num3+"]");
        }else if (num2 > num1 && num2 > num3 && num3 > num1){
            System.out.println("El mayor es ["+num2+"], el mediano es ["+num3+"], el menos es ["+num1+"]");
        }else if (num3 > num1 && num3 > num2 && num2 > num1){
            System.out.println("El mayor es ["+num3+"], el mediano es ["+num2+"], el menos es ["+num1+"]");
        }else if (num3 > num2 && num3 > num1 && num1 > num2){
            System.out.println("El mayor es ["+num3+"], el mediano es ["+num1+"], el menos es ["+num2+"]");
        }
    }




}
