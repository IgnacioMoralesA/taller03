import java.util.Scanner;

public class taller03 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        try{
        menu();
        }catch (Exception e){
            System.out.println("ERROR");
            System.out.println("Dato erroneo");
        }
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
                        EstasSeguro(opcion);
                        break;
                }}
                while (opcion < 1 || opcion > 3) ;
            } while (opcion != 3);
        }


    private static int EstasSeguro(int opcion) {
        int elec;
        do{
        System.out.println("Seguro que va a salir?");
        System.out.println("ingrese el numero de la opccion que decida");
        System.out.println("[1] Si");
        System.out.println("[2] No");
        elec=leer.nextInt();
        if(elec==1){
            opcion=3;
        }
        if(elec==2){
            menu();
        }

            }while (elec<1 || elec>2);
        return opcion;
    }

    private static void AgregarAcademico() {
        System.out.println("Como se llama? ");
        String nombre=leer.next();
        new academico(nombre);
    }

    private static void mostrarAcademico() {
        new academico("Jose");
        System.out.println("Jose");
    }

    private static void opcionesMenu() {
        System.out.println("[1] Mostrar academico");
        System.out.println("[2] Agregar academico");
        System.out.println("[3] Salir");
    }
}
