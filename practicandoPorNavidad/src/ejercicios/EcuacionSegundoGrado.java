package ejercicios;

public class EcuacionSegundoGrado {

    public static double[] ecuacion2Grado(int a, int b, int c){
        double discriminante = (Math.pow(b,2) -(4*a*c));
        if (discriminante>=0){
            double[] solucion;
            //una solución
            if (discriminante==0){
                solucion = new double[1];
                solucion[0]=((-b)-(4*a*c))/(2*a);
            }
            //dos soluciones.
            else {
                solucion = new double[2];
                double a1 = Math.pow(b, 2) - 4 * a * c;
                solucion [0] = ((-b)+ (Math.sqrt(a1)))/(2*a);
                solucion [1] = ((-b)- (Math.sqrt(a1)))/(2*a);
            }
            return solucion;
        }else {
            //Sin solución
            return null;
        }

    }



}
