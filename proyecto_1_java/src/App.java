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
            System.out.println("\n----------Menu de usuarios---------");
            System.out.println("1. Agregar clientes");
            System.out.println("2. Listar clientes");
            System.out.println("3. Agregar saldo");
            System.out.println("4. Eliminar saldo");
            System.out.println("5. Buscar cliente por nombre y mostrar saldo");
            System.out.println("6. Pedir un prestamo");
            System.out.println("0. Salir");
            System.out.println("Introduzca una opcion: ");
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:agregar_cliente(usuarios);break;
                case 2:listar_clientes(usuarios);break;
                case 3:agregar_saldo(usuarios);break;
                case 4:eliminar_saldo(usuarios);break;
                case 5:buscar_cliente(usuarios);break;
                case 6:prestamo(usuarios);break;
                case 0:System.out.println("\nSalida del programa");return;
                    
            
                default:System.out.println("\nIngrese una opcion valida");break;
                    
            }
        }
    }

    private static void agregar_cliente(ArrayList<Cliente> usuarios){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();


        System.out.print("Ingrese su cedula: ");
        String cedula = scanner.nextLine();
                
        boolean cedulaExistente = false;
        for (Cliente usuario : usuarios) {
            if (usuario.getCedula().equals(cedula)){
                cedulaExistente = true;
                break;
            }
        }

        if (cedulaExistente){
            System.out.println("La cedula ya esta en uso. No se puede agregar el cliente");
        
        } else{
            System.out.print("Ingrese su nivel de ingresos: ");
            int nivel_ingresos = scanner.nextInt();
    
            System.out.print("Ingrese su fecha de creacion: ");
            int fecha_creacion = scanner.nextInt();
    
            System.out.print("Ingrese su saldo: ");
            int saldo = scanner.nextInt(); 
    
            Cliente client = new Cliente(nombre, cedula, nivel_ingresos, fecha_creacion, saldo);
            usuarios.add(client);  
            System.out.println("\nCliente agregado exitosamente!");

        }
    }

    public static void agregar_saldo(ArrayList<Cliente> usuarios){
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Ingrese su cedula: ");
        String cedula = scanner2.nextLine();

        int indice_cliente = buscar_cliente_cedula(usuarios, cedula);

        if(indice_cliente != -1) {
            System.out.println("Ingrese su saldo a añadir: ");
            int nuevo_saldo = scanner2.nextInt();
            
            usuarios.get(indice_cliente).setSaldo(usuarios.get(indice_cliente).getSaldo() + nuevo_saldo);
            System.out.println("Saldo agregado correctamente");
        } else{
            System.out.println("\nCliente no encontrado");
        }
    
    }

    public static void  eliminar_saldo(ArrayList<Cliente> usuarios){
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Ingrese su cedula: ");
        String cedula = scanner2.nextLine();

        int indice_cliente = buscar_cliente_cedula(usuarios, cedula);

        System.out.println("Este es el indice: " + indice_cliente);

        if(indice_cliente != -1) {
            System.out.println("Ingrese el saldo a eliminar: ");
            int nuevo_saldo = scanner2.nextInt();
            if(usuarios.get(indice_cliente).getSaldo() > nuevo_saldo) {
                usuarios.get(indice_cliente).setSaldo(usuarios.get(indice_cliente).getSaldo() - nuevo_saldo);
                System.out.println("\nSaldo eliminado correctamente");
            }else{
                System.out.println("No tienes tanto dinero");
            }
        } else{
            System.out.println("\nCliente no encontrado");
        }

    }

    public static void listar_clientes(ArrayList<Cliente> usuarios){
        int x=1;
        for(Cliente usuario: usuarios){
            System.out.println("\n---------Cliente 1" + x + "---------");
            System.out.println("Nombre: "+ usuario.getNombre() + "\n" + "Cedula: "+ usuario.getCedula() + 
            "\n" + "Nivel de ingresos: "+ usuario.getNivel_ingresos() + 
            "\nFecha creacion: " + usuario.getFecha_creacion() + "\nSaldo: "+ usuario.getSaldo());
            x++;

        }
    } 

    private static int buscar_cliente_cedula(ArrayList<Cliente> usuarios, String cedula){
        for(int i = 0; i < usuarios.size(); i++){
            Cliente usuario = usuarios.get(i);
            System.out.println("Buscando el cliente con cedula: "+ cedula);

            if(usuario.getCedula().equals(cedula)){
                return i;
            } 
        }  
        return -1;
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

        if(indice_cliente != -1) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Saldo: " + usuarios.get(indice_cliente).getSaldo() );
            
            
        } else{
            System.out.println("\nCliente no encontrado");
        }
    }
        public static void prestamo(ArrayList<Cliente> usuarios){
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("Ingrese su cedula: ");
            String cedula = scanner2.nextLine();
    
            int indice_cliente = buscar_cliente_cedula(usuarios, cedula);
    
    
            if(indice_cliente != -1) {
                System.out.println("Ingrese el la cantidad de dinero del prestamo: ");
                int nuevo_saldo = scanner2.nextInt();
                if(usuarios.get(indice_cliente).getSaldo() > nuevo_saldo) {
                    usuarios.get(indice_cliente).setSaldo(usuarios.get(indice_cliente).getSaldo() - nuevo_saldo);
                    System.out.println("\nPrestamo enviado correctamente");
                }else{
                    System.out.println("No tienes tanto dinero");
                }
            } else{
                System.out.println("\nCliente no encontrado");
            }
    
            
        }
    }

    

