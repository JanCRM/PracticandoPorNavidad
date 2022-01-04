package ejercicios;

public class NumerosPares {


    public static int pares(int num1, int num2){
        int suma = 0;
        if (num1<num2){
            while (num1<=num2) {
                if (num1 % 2 == 0) {
                    suma += num1;
                    System.out.println(num1);
                }
                num1++;
            }
        }else {
            while (num2<=num1) {
                if (num2 % 2 == 0) {
                    suma += num2;
                    System.out.println(num2);
                }
                num2++;
            }
        }

        return suma;
    }


}
