
public class Main {
    private static Object x;

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

    public static void ejercicio8(){
        float numeroFloat = 3.14159f;
        String resultado = String.valueOf(numeroFloat);

        System.out.println("El numero float convertido a String es: " + resultado);

    }


    public static void ejercicio9(){
        int resultado = (int) Math.round(3.7);

        System.out.println("El resultado es: " + resultado);

    }


    public static void ejercicio10(){

        byte b = 50;
        short sh = (short) b;
        System.out.println("El resultado es: " + sh);

    }



    public static void ejercicio11(){

        int x = 10; x += 5;
        System.out.println("El resultado es: " + x);

    }


    public static void ejercicio12(){
        int y = 10;
        int x = 3;
        y *= (x + 5);
        System.out.println("El valor de y es: " + y);
    }


    public static void ejercicio13(){
        int a = 15;
        a %= 4;
        System.out.println("El valor de a es: " + a);
    }

    public static void ejercicio14(){
        int x = 5;
        int y = 2;
        x += y;
        System.out.println("El valor de x es: " + x);
    }
    public static void ejercicio15(){
        int x=5;
         x ^= 2;
        System.out.println("El valor de x es: " + x);
    }

    public static void ejercicio16(){
        int x = 5;
        int y = ++x;
        System.out.println("El valor de y es: " + y);
    }

    public static void ejercicio17(){
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
    }

    public static void ejercicio18(){
        int count =4;
        System.out.println(count--);
    }

    public static void ejercicio19(){
        int x =4;
        x = ++x;
        int y =4;
        y = y++;
        System.out.println(x);
        System.out.println(y);
    }

    public static void ejercicio20(){
        int x = 3;
        x = x++;
        System.out.println(x);
    }

    public static void ejercicio21(){
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println("El valor de i es:" +i);

    }


    public static void ejercicio22(){
        double x = 9.1;
        int z = (int)x;
        System.out.println("El valor de x es:" + ++z);

    }

    public static void ejercicio23(){
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);

    }

    public static void ejercicio24(){
        int x=10;
        double z= (double)x;
        z /= 2;

        System.out.println("El valor de x es: " + z);

    }

    public static void ejercicio25(){
        char c = 'X';
        c += 32;
        System.out.println("El resultado es: "+c);
    }


    public static void ejercicio26(){
        long x=10;
        short z= (short) x;
        z *= 3;

        System.out.println("El valor de x es: " + z);
    }

    public static void ejercicio27(){
        int x = 10;
        x += (x++) + (++x);
        System.out.println("El valor de x es: " + x);
    }

    public static void ejercicio28(){
        float x= 10;
        byte z= (byte) x;
        z -= 3;

        System.out.println("El valor de x es: " + z);

    }

    public static void ejercicio29(){
        int i = 257;
        byte b = (byte)i;
        System.out.println(b);

        System.out.println("El valor de b es: " + b);

    }

    public static void ejercicio30(){
        double i = 10.0;
        int b = (int)i;
        b += 5 +5;
        System.out.println(++b);


    }

}