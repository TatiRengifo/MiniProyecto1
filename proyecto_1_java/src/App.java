import java.util.Scanner;
import java.util.ArrayList;



public class App {
    //Cliente clien = new Cliente();
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> usuarios = new ArrayList<>();
        menu(usuarios);
    }
    private static void menu(ArrayList<Cliente> usuarios){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("----------Menu de usuarios---------");
            
            System.out.println("1. Agregar clientes");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar clientes");
            System.out.println("4. Modificar cliente");
            System.out.println("0. Salir");
            System.out.println("Introduzca una opcion: ");
            int opc = scanner.nextInt();
            scanner.close();
            switch (opc) {
                case 1:agregar_cliente(usuarios);break;
                case 0:System.out.println("Salida del programa");return;
                    
            
                default:System.out.println("Ingrese una opcion valida");break;
                    
            }
        }
    }

    private static void agregar_cliente(ArrayList<Cliente> usuarios){
        Scanner scanner2 = new Scanner(System.in);

        scanner2.nextLine();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner2.nextLine();

        System.out.print("Ingrese su cedula: ");
        String cedula = scanner2.nextLine();

        System.out.print("Ingrese su ciudad: ");
        int nivel_ingresos = scanner2.nextInt();

        System.out.print("Ingrese su ciudad: ");
        int fecha_creacion = scanner2.nextInt();
        scanner2.close();
        Cliente client = new Cliente(nombre, cedula, nivel_ingresos, fecha_creacion);
        usuarios.add(client);  
        System.out.println("Cliente agregado exitosamente!");
    }
}

/* Este programa calcula el interés ganado en un Certificado de Depósito a Término (CDT)
 basado en la cantidad de dinero ahorrado y la duración seleccionada del CDT.*/
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     // Solicitar al usuario la cantidad de dinero ahorrado
    System.out.print("Ingrese la cantidad de dinero ahorrado: ");
    double dineroAhorrado = scanner.nextDouble();
    // Solicitar al usuario seleccionar la duración del CDT (3 o 6 meses)
    System.out.print("Seleccione la duración del CDT (3 o 6 meses): ");
    int duracionCDT = scanner.nextInt();
    // Determinar la tasa de interés anual según la duración del CDT seleccionada
    double interesAnual;
    if (duracionCDT == 3) {
        interesAnual = 0.03; // 3%
    } else if (duracionCDT == 6) {
        interesAnual = 0.05; // 5%
    // Si la duración seleccionada no es válida, mostrar un mensaje de error y salir del programa
    } else {
        System.out.println("Duración inválida. Por favor seleccione 3 o 6 meses.");
        return;
    }
    // Convertir la duración del CDT de meses a años para calcular el interés total
    double duracionEnAnios = duracionCDT / 12.0;
    // Calcular el interés total ganado
    double interesTotal = dineroAhorrado * interesAnual * duracionEnAnios;
    // Mostrar el interés total ganado después de la duración del CDT seleccionada
    System.out.println("El interés total ganado después de " + duracionCDT + " meses es: " + interesTotal);
}

}
