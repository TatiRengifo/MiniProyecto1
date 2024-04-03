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
            switch (opc) {
                case 1:agregar_cliente(usuarios);break;
                case 2:listar_clientes(usuarios);break;
                case 3:buscar_cliente(usuarios);break;
                case 0:System.out.println("Salida del programa");return;
                    
            
                default:System.out.println("Ingrese una opcion valida");break;
                    
            }
        }
    }

    private static void agregar_cliente(ArrayList<Cliente> usuarios){
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner2.nextLine();

        System.out.print("Ingrese su cedula: ");
        String cedula = scanner2.nextLine();

        System.out.print("Ingrese su nivel de ingresos: ");
        int nivel_ingresos = scanner2.nextInt();

        System.out.print("Ingrese su fecha de creacion: ");
        int fecha_creacion = scanner2.nextInt();

        System.out.print("Ingrese su saldo: ");
        int saldo = scanner2.nextInt(); 

        Cliente client = new Cliente(nombre, cedula, nivel_ingresos, fecha_creacion, saldo);
        usuarios.add(client);  
        System.out.println("Cliente agregado exitosamente!");
    }

    public static void listar_clientes(ArrayList<Cliente> usuarios){
        int x=1;
        for(Cliente usuario: usuarios){
            System.out.println("---------Cliente"+ x +"---------");
            System.out.println("Nombre: "+ usuario.getNombre() + "\n" + "Cedula: "+ usuario.getCedula() + 
            "\n" + "Nivel de ingresos: "+ usuario.getNivel_ingresos() + "\nFecha creacion: " + usuario.getFecha_creacion());
            x++;

        }
    }

    private static int buscar_cliente_nombre(ArrayList<Cliente> usuarios, String nombre){
        for(int i = 0; i < usuarios.size(); i++){
            Cliente usuario = usuarios.get(i);
            System.out.println("Buscando cliente por su nombre: " + nombre);

            if(usuario.getNombre().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

        public static void buscar_cliente(ArrayList<Cliente> usuarios){
            Scanner scanner2 = new Scanner(System.in);
    
            System.out.println("Ingrese su nombre: ");
            String nombre = scanner2.nextLine();
    
            int indice_cliente = buscar_cliente_nombre(usuarios, nombre);
    
            System.out.println("Este es el indice: " + indice_cliente);
    
            if(indice_cliente != -1) {
                System.out.println("Nombre: " + nombre);
                System.out.println("Saldo: " + usuarios.get(indice_cliente).getSaldo() );
                
                //usuarios.get(indice_cliente).setSaldo(usuarios.get(indice_cliente).getSaldo());
            } else{
                System.out.println("\nCliente no encontrado");
            }
            
        }    
    

}

