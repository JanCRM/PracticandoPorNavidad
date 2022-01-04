package ejercicios;

public class IncrementoHora {

    public static void reloj(int horas, int minutos, int segundos){

        System.out.println("Hora introducida ["+horas+":"+minutos+":"+segundos+"]");
        segundos++;
        while (segundos==60){
            segundos=0;
            minutos++;
            while (minutos==60){
                minutos=0;
                horas=(horas+1)%24;
            }
        }
        System.out.println("Hora incrementada en un segundo ["+horas+":"+minutos+":"+segundos+"]");
    }

}
