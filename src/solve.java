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
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
        }
    } while (opcion != 5);

        scanner.close();
}

public static void mostrarMenu() {
    System.out.println("----- MENÚ PRINCIPAL -----");
    System.out.println("1. Sumar dos números");
    System.out.println("2. Restar dos números");
    System.out.println("3. Multiplicar dos números");
    System.out.println("4. Dividir dos números");
    System.out.println("5. Salir del programa");
    System.out.println("--------------------------");
}
}
