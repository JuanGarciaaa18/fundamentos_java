
public class Main {
    public static void ejercicio1() {
        double x = (double) 5.89 + (double) 3.45;
        System.out.println(x);
    }

    public static void ejercicio2() {
        char c = 'A';
        int ASCII= (int) c;
        System.out.println("El valor ASCII de " + c + " es: " + ASCII);
    }

    public static void ejercicio3() {
        double d = 101.99;
        long l = (long)d;
        int i = (int)l;
        System.out.println(i);
    }

    public static void ejercicio4() {
        String x = "65";
        int convertir = Integer.parseInt(x);
        System.out.println("El numero se convirtio en un int: " + convertir);
    }

    public static void ejercicio5(){
        byte x = (byte) -1;
        char y = (char) x;
        int z = (int) y;
        System.out.println(z);
    }

    public static void ejercicio6(){

        char x= (char) 65;

        System.out.println("El 65 se convierte: "+ x);

    }

    public static void ejercicio7(){
        long longValue = 123456789L;
        int intValue = (int)longValue;
        System.out.println("habrá un error debido a que no hay un casteo");

    }


}