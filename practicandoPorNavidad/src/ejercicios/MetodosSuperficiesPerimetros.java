package ejercicios;
// STOPSHIP: 14/12/2021

public class MetodosSuperficiesPerimetros {

    public static float PI=3.1416f;


    /**
     * Area de una circulo
     * @param lado
     * @return
     */
    public static float areaCuadrado(float lado){
       float area=0;
       return area=lado*lado;
    }


    /**
     * perimetro de un cuadrado.
     * @param lado
     * @return
     */
    public static float perimetroDeUnCuadrado(float lado){
        return 4 * lado;
    }


    /**
     * Superficie de una rectangulo.
     * @param base
     * @param altura
     * @return
     */
    public static int superficieRectangulo(int base, int altura){
        int superficie=0;
        return superficie=base*altura;
    }


    /**
     * Perimetro de un rectangulo.
     * @param base
     * @param altura
     * @return
     */
    public static int perimetroRectangulo(int base, int altura){
        int perimetro=0;
        return perimetro= (2*base)+(2*altura);
    }


    /**
     * Perimetro de una circulo
     * @param radio
     * @return
     */
    public static float PerimetroCirculo(float radio){
        float perimetroCirculo=0;
        return perimetroCirculo=2*PI*radio;
    }


    /**
     * Area del circulo
     * @param radio
     * @return
     */
    public static float areaCirculo(float radio){
        float areaCirculo=0;
        return areaCirculo= PI * (radio*radio);
    }





}
