package ejercicios;

import java.util.Scanner;

public class NotasAlumnos {

    public static void nivelNotas(){
        Scanner sc=new Scanner(System.in);
        int sobresaliente = 0;
        int notable = 0;
        int bien = 0;
        int suficiente = 0;
        int insuficiente = 0;
        int numeroDeAlumnos = 0;

        int notas = 0;
        do {
            System.out.println("Introduce la nota de los alumnos..");
            notas = sc.nextInt();

            if (notas < 5){
                insuficiente++;
                numeroDeAlumnos++;
            }else if (notas == 5){
                suficiente++;
                numeroDeAlumnos++;
            }else if (notas == 6){
                bien++;
                numeroDeAlumnos++;
            }else if (notas == 7 || notas == 8){
                notable++;
                numeroDeAlumnos++;
            }else {
                sobresaliente++;
                numeroDeAlumnos++;
            }

        }while (notas>0);


        System.out.println("Numero de alumnos evaluados "+numeroDeAlumnos);
        System.out.println("Alumnos con sobresalientes "+sobresaliente);
        System.out.println("Alumnos con notables "+notable);
        System.out.println("Alumnos con bien "+bien);
        System.out.println("Alumnos con suficiente "+suficiente);
        System.out.println("Alumnos con insuficiente "+insuficiente);



    }

}
