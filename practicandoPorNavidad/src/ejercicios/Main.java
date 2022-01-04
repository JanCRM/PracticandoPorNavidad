package ejercicios;


import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        //Area de un cuadrado
        System.out.println("Calcular el area de una cuadrado, introduce su lado..");
        float lado=sc.nextFloat();
        System.out.println("Esta es el area del cuadrado..");
        float area= MetodosSuperficiesPerimetros.areaCuadrado(lado);
        System.out.println(area);
        System.out.println("****************************************************\n");

        //perimetro de una cuadrado
        System.out.println("Este es el perimetro de una cuadrado..");
        float perimetro= MetodosSuperficiesPerimetros.perimetroDeUnCuadrado(lado);
        System.out.println(perimetro);
        System.out.println("****************************************************\n");



        //Calculas la superficie de una rectangulo
        System.out.println("Calcular la superficie de una rectángulo, introduce la bases y la altura...");
        int baseS =sc.nextInt();
        int alturaS=sc.nextInt();
        int superficie= MetodosSuperficiesPerimetros.superficieRectangulo(baseS, alturaS);
        System.out.println("La superficie del rectángulo es "+superficie);
        System.out.println("****************************************************\n");




        //Perimetro de un rectangulo
        System.out.println("Perimetro del rectángulo, introduce la base y la altura.");
        int baseP =sc.nextInt();
        int alturaP=sc.nextInt();
        int perimetroRectangulo= MetodosSuperficiesPerimetros.perimetroRectangulo(baseP, alturaP);
        System.out.println("La perimetro del rectángulo es "+perimetroRectangulo);
        System.out.println("****************************************************\n");




        //Perimetro y area de una circulo
        System.out.println("Perimetro y area de una circulo, introduce el radio.");
        float radioCirculo=sc.nextFloat();
        float areaCirculo = MetodosSuperficiesPerimetros.areaCirculo(radioCirculo);
        System.out.println("El area del circulo es: "+areaCirculo);
        float perimetroCirculo = MetodosSuperficiesPerimetros.PerimetroCirculo(radioCirculo);
        System.out.println("El perimetro del circulo es: "+perimetroCirculo);
        System.out.println("****************************************************\n");


        //Determinar la media de tres numeros
        float media = MediaTresNumeros.MediaNumeros();
        System.out.println("La media con decimales es: "+media);
        System.out.println("La media sin decimales es: "+Math.round(media));



        //Determinar si el numero introducido es positivo
        System.out.println("Introduce el numero que desea comprobar..");
        int num = sc.nextInt();
        NumeroPositivo.numeroPositivo(num);



        //Raiz cuadrada de una número
        System.out.println("Introduce el número del que quieres saber la raíz..");
        int numRaiz = sc.nextInt();
        boolean isPositivo = NumeroPositivo.numeroPositivo(numRaiz);
        if (isPositivo){
            float resRaiz = RaizCuadrada.raizCuadrada(numRaiz);
            System.out.println("La raíz cuadrada del número "+numRaiz+ " es :"+resRaiz);
        }else {
            System.out.println("La operación no se puede realizar, el numero es negativo.");
        }



        //año bisiesto
        System.out.println("Introduce el años para saber si es bisiesto o no..");
        int anio = sc.nextInt();
        boolean isBisiesto = AnioBisiesto.isBisiesto(anio);
        if (isBisiesto){
            System.out.println("El año "+anio+" es bisiesto");
        }else {
            System.out.println("El año "+anio+" no es bisiesto.");
        }


        //Dterminar si el número introducido tiene decimales
        System.out.println("Introduce un numero real para saber tiene decimales o no.");
        float numDecimal = sc.nextFloat();
        if (NumConSinDecimales.hasDecimales(numDecimal)){
            System.out.println("El número "+numDecimal+" tienes decimales.");
        }else {
            System.out.println("El numero "+numDecimal+" no tiene decimales.");
        }


        //Dtermina si el primer número introducido es mayor, y realiza una resta.
        RestaDelNumeroMayor.RestaMayor();

         //Conversor de grador
        ConversorGrados.ConvertirGrados();

        //Determina si los numero han sido introducidos de forma ordenada.
        NumerosOrdenados.numOrdenados();

        //Leer si los numero introducidos son consecutivos.
        NumerosConsecutivos.numerosConsecutivos();



        //Resta sucesivas
        System.out.println("Introduce el dividendo..");
        int dividendo = sc.nextInt();
        System.out.println("Introduce el divisor..");
        int divisor = sc.nextInt();
        RestaSucesivas.restaSuces(dividendo, divisor);


        //Determinar cuantas cifras tiene un número entero.
        //Determina la cantidad de número por la que está compuesta una cifra
        CantidadDeCifras.numCifras();

        //Imprimir el mayor, mediano y menor de tres números.
        System.out.println("Introduce el primer número..");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número..");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercero número..");
        int num3 = sc.nextInt();
        MenorMedianoMayor.numeroMayorMediano(num1, num2, num3);

        //Incrementar en un segundo la hora introducida.
        System.out.println("Introduce la hora..");
        int horas =sc.nextInt();
        System.out.println("Introduce la minutos..");
        int minutos =sc.nextInt();
        System.out.println("Introduce la segundos..");
        int segundos =sc.nextInt();
        IncrementoHora.reloj(horas, minutos,segundos);


        //Ecuación de segundo grado
        System.out.println("Realizar una ecuación de segundo grado..");
        System.out.println("Introduce el valor de a: ");
        int a = sc.nextInt();
        System.out.println("Introduce el valor de b: ");
        int b = sc.nextInt();
        System.out.println("Introduce el valor de c: ");
        int c = sc.nextInt();
        double [] resultado = EcuacionSegundoGrado.ecuacion2Grado(a, b, c);
        System.out.println(Arrays.toString(resultado));



        //Calcular el precio de un billete de tren
        System.out.println("Introduce los dias de viajes, si la estancia en mayor a 7 dias tendrás un descuento del 30%");
        int dias = sc.nextInt();
        System.out.println("Introduce los kilómetros a recorrer.");
        int kilometros = sc.nextInt();
        double precioBillete = PrecioBillete.determinarPrecio(dias, kilometros);
        if (dias > 7 && kilometros > 800){
            System.out.println("Precio del billete con un 30% de descuento ["+precioBillete+"]");
        }else{
            System.out.println("precio del billete es ["+precioBillete+"]");
        }



        //Calcular el salario por jornada de loa trabajadores de una fabrica
        System.out.println("Para calcular tu salario, introduce el turno en el que has trabajado [Diurno] o [Nocturno].");
        String turno = sc.nextLine();
        double salariJornada = EmpleadosFabrica.jornalDiario(turno.toLowerCase(Locale.ROOT));
        System.out.println("Tu jornada diaria es de "+salariJornada);




        //comprobar si un año introducido es bisiesto, y determinar cuantos dias tiene un mes.
        System.out.println("Introduce el año para comprobar si es bisiesto.");
        int anyo = sc.nextInt();
        boolean isValid = AnioBisiesto.isBisiesto(anio);
        NumerosDeDiasMes.numDiasMes(isValid);


        //Imprimir los numero pares entre 1 y 20.
        System.out.println("Introduce el primer numero");
        int rangoPartida =sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int rangoFin =sc.nextInt();
        int suma = NumerosPares.pares(num1, num2);
        System.out.println("La suma de los números pares es ["+suma+"]");


        //Factorial de una número.
        System.out.println("Introduce el numero del que quieres saber el factorial");
        int factorialNumber =sc.nextInt();
        int res = FactorialDeUnNumero.factorial(num);
        System.out.println("El factorial del numero introducido es ["+res+"]");


        //Media de los números introducidos
        int mediaCualquierNumero = MediaDeCualquierNumero.media();
        System.out.println("La media de los números introducidos es ["+media+"]");


        //Imprimir cantidad de alumnos en cada rango de notas.
        NotasAlumnos.nivelNotas();





        //Adivina el numero secreto
        NumeroSecreto.adivinaElNumero();


        //Generador de contraseñas.
        String password = GeneradorContraseña.password();
        System.out.println("Password: "+password);


    }



}
