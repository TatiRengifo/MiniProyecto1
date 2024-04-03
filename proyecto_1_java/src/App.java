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


/*ArrayList<Cliente> lista = new ArrayList<Cliente>();

Scanner scanner = new Scanner(System.in);
System.out.println("Introduzca su nombre: ");
String nombre = scanner.nextLine();

System.out.println("Introduzca su cedula: ");
String cedula = scanner.nextLine();


System.out.println("Introduzca su nivel de ingresos: ");
int nivel_ingresos = scanner.nextInt();


System.out.println("Introduzca su fecha de creacion: ");
int fecha_creacion = scanner.nextInt();
scanner.close();

Cliente client = new Cliente(nombre, cedula, nivel_ingresos, fecha_creacion);

lista.add(client);

*/

/*for(Cliente cliente : lista){
    System.out.println("Nombre: " + cliente.getNombre());
    System.out.println("Cedula: " + cliente.getCedula());
    System.out.println("Nivel de ingresos: " + cliente.getNivel_ingresos());
    System.out.println("Fecha de creacion: " + cliente.getFecha_creacion());
}
*/
   


/*public void menu(){
    int opc;
    do{
        System.out.println("1. Insertar usuario");
        System.out.println("2. Listar usuarios");
        System.out.println("3. eliminar dinero");
        switch (opc) {
            case 1: registrar_cliente(); break;
            case 2:; break;
            case 3:; break;
            case 4:; break;
        
            default:
                System.out.println("Ingrese un valor valido");
                break;
        }

    }while(opc!=0);
}
public void registrar_cliente(){
    System.out.println("---------Ingresar clientes---------");
    ArrayList<Cliente> lista = new ArrayList<Cliente>();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca su nombre: ");
    String nombre = scanner.nextLine();

    System.out.println("Introduzca su cedula: ");
    String cedula = scanner.nextLine();

    
    System.out.println("Introduzca su nivel de ingresos: ");
    int nivel_ingresos = scanner.nextInt();

    
    System.out.println("Introduzca su fecha de creacion: ");
    int fecha_creacion = scanner.nextInt();
    scanner.close();

    Cliente client = new Cliente(nombre, cedula, nivel_ingresos, fecha_creacion);

    lista.add(client);
   
}
}
*/