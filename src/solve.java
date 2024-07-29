import java.util.Scanner;

public class solve {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

        do {
        mostrarMenu();
        System.out.print("Ingrese una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
               Main.ejercicio1();  ;
                break;
            case 2:
               Main.ejercicio2();  ;
                break;
            case 3:
                Main.ejercicio3();  ;
                break;
            case 4:
                Main.ejercicio4();  ;
                break;
            case 5:
                Main.ejercicio5();  ;
                break;
            case 6:
                Main.ejercicio6();
                break;
            case 7:
                Main.ejercicio7();
                break;
            case 8:
                Main.ejercicio8();
                break;
            case 9:
                Main.ejercicio9();
                break;
            case 10:
                Main.ejercicio10();
                break;
            case 11:
                Main.ejercicio11();
                break;
            case 12:
                Main.ejercicio12();
                break;
            case 13:
                Main.ejercicio13();
                break;
            case 14:
                Main.ejercicio14();
                break;
            case 15:
                Main.ejercicio15();
                break;
            case 16:
                Main.ejercicio16();
                break;
            case 17:
                Main.ejercicio17();
                break;
            case 18:
                Main.ejercicio18();
                break;
            case 19:
                Main.ejercicio19();
                break;
            case 20:
                Main.ejercicio20();
                break;
            case 21:
                Main.ejercicio21();
                break;
            case 22:
                Main.ejercicio22();
                break;
            case 23:
                Main.ejercicio23();
                break;
            case 24:
                Main.ejercicio24();
                break;
            case 25:
                Main.ejercicio25();
                break;
            case 26:
                Main.ejercicio26();
                break;
            case 27:
                Main.ejercicio27();
                break;
            case 28:
                Main.ejercicio28();
                break;
            case 29:
                Main.ejercicio29();
                break;
            case 30:
                Main.ejercicio30();
                break;

            default:
                System.out.println("Opción inválida. Intente de nuevo.");
        }
    } while (opcion != 31);

        scanner.close();
}

public static void mostrarMenu() {
    System.out.println("----- MENÚ PRINCIPAL -----");
    System.out.println("Ejercicio 1");
    System.out.println("Ejercicio 2");
    System.out.println("Ejercicio 3");
    System.out.println("Ejercicio 4");
    System.out.println("Ejercicio 5");
    System.out.println("Ejercicio 6");
    System.out.println("Ejercicio 7");
    System.out.println("Ejercicio 8");
    System.out.println("Ejercicio 9");
    System.out.println("Ejercicio 10");
    System.out.println("Ejercicio 11");
    System.out.println("Ejercicio 12");
    System.out.println("Ejercicio 13");
    System.out.println("Ejercicio 14");
    System.out.println("Ejercicio 15");
    System.out.println("Ejercicio 16");
    System.out.println("Ejercicio 17");
    System.out.println("Ejercicio 18");
    System.out.println("Ejercicio 19");
    System.out.println("Ejercicio 20");
    System.out.println("Ejercicio 21");
    System.out.println("Ejercicio 22");
    System.out.println("Ejercicio 23");
    System.out.println("Ejercicio 24");
    System.out.println("Ejercicio 25");
    System.out.println("Ejercicio 26");
    System.out.println("Ejercicio 27");
    System.out.println("Ejercicio 28");
    System.out.println("Ejercicio 29");
    System.out.println("Ejercicio 30");
}
}
