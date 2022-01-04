package ejercicios;

import java.util.Scanner;

public class EmpleadosFabrica {

    public static double jornalDiario(String turno){
        Scanner sc = new Scanner(System.in);
        String domingo = "domingo";
        String diaDeLaSemana;
        double jornadaDiaria = 0.0;
        int horasTrabajadas = 0;
        int horasDiurnas = 20;
        int horasNocturnas = 35;
        int incrementoDiurnoDomingo = 10;
        int incrementoNocturnoDomingo = 15;
        switch (turno){
            case "diurno":
                System.out.println("Introduce el dia de la semana que trabajaste.");
                diaDeLaSemana = sc.nextLine();
                System.out.println("Introduce el número de horas trabajadas");
                horasTrabajadas = sc.nextInt();
                if (domingo.equals(diaDeLaSemana)){
                    jornadaDiaria = (double) (horasDiurnas+incrementoDiurnoDomingo)*horasTrabajadas;
                }else {
                    jornadaDiaria = (double) horasDiurnas * horasTrabajadas;
                }
                break;

            case "nocturno":
                System.out.println("Introduce el dia de la semana que trabajaste.");
                diaDeLaSemana = sc.nextLine();
                System.out.println("Introduce el número de horas trabajadas");
                horasTrabajadas = sc.nextInt();
                if (domingo.equals(diaDeLaSemana)){
                    jornadaDiaria = (double) (horasNocturnas+incrementoNocturnoDomingo)*horasTrabajadas;
                }else {
                    jornadaDiaria = (double) horasNocturnas * horasTrabajadas;
                }
                break;

            default:
                System.out.println("Los datos introducidos son incorrectos..");
                break;
        }
        return jornadaDiaria;
    }

}
