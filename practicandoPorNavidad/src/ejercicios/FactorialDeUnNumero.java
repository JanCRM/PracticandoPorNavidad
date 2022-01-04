package ejercicios;

public class FactorialDeUnNumero {

    public static int factorial(int num){

        int factorial = 1;
        while (num!=0){
            factorial = factorial*num;
            num--;
        }
        return factorial;

    }


}
