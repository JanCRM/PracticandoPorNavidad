package password;

import java.util.*;
public class Main {

    public static void main(String[] args) {

       String  password = passwordGenerator();
       System.out.println("Password: "+password);



    }

    /**
     * Esta función genera contraseña de forma aleatoria con la longitud que desees.
     * @return String with password generator
     */
    public static String passwordGenerator(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        //Lista de
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "[]{}();*/-_";
        String all = upper + lower + numbers + symbols;

        int length = 0;
        boolean isOk = false;
        StringBuilder sb = new StringBuilder();
        do {
            try{
                System.out.println("Dime la longitud que deseas para la contraseña.");
                length = sc.nextInt();
                isOk = true;
            }catch (Exception e){
                System.out.println("Solo se aceptan números.");
                sc.nextInt();
            }finally {


                for (int i = 0; i < length; i++) {
                    int index = (random.nextInt(all.length()));
                    char randomChar = all.charAt(index);
                    sb.append(randomChar);
                }
            }
        }while (!isOk);

        return sb.toString();

    }




}
