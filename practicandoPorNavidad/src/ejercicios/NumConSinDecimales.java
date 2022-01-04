package ejercicios;

public class NumConSinDecimales {
    public static boolean hasDecimales(float num){
        boolean isDeciaml = false;
        if (num % 1 ==0){
            isDeciaml=false;
            System.out.println("Es un numero entero.");
        }else {
            System.out.println("Es un numero decimal.");
            isDeciaml=true;
        }
        return isDeciaml;
    }
}
