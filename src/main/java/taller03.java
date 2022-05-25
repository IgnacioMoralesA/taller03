import java.util.Scanner;

public class taller03 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int opcion;
        do {
            do {
                opcionesMenu();
                opcion=leer.nextInt();
                switch (opcion) {
                    case 1:
                        mostrarAcademico();
                        break;
                    case 2:
                        AgregarAcademico();
                        break;
                    case 3:
                        EstasSeguro();
                        break;
                }}
                while (opcion < 1 || opcion > 3) ;
            } while (opcion != 3);
        }


    private static void EstasSeguro() {
    }

    private static void AgregarAcademico() {
    }

    private static void mostrarAcademico() {
    }

    private static void opcionesMenu() {
        System.out.println("[1] Mostrar academico");
        System.out.println("[2] Agregar academico");
        System.out.println("[3] Salir");
    }
}
