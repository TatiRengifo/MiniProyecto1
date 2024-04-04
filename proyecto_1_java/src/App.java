import javax.swing.JOptionPane;

import java.util.ArrayList;






public class App {
    //Cliente clien = new Cliente();
    public static void main(String[] args) throws Exception {
        ArrayList<Cliente> usuarios = new ArrayList<>();
        menu(usuarios);
    }
    private static void menu(ArrayList<Cliente> usuarios){



    

        while(true){
            System.out.println("----------Menu de usuarios---------");
            System.out.println("1. Agregar clientes");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar clientes");
            System.out.println("4. Modificar cliente");
            System.out.println("5. Buscar cliente por nombre y mostrar saldo");
            System.out.println("6. Pedir un prestamo");

            System.out.println("0. Salir");
            int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca una opcion: ","",1));

            switch (opc) {
                case 1:agregar_cliente(usuarios);break;
                case 2:listar_clientes(usuarios);break;
                case 3:buscar_cliente(usuarios);break;
                case 4:eliminar_saldo(usuarios);break;
                case 5:buscar_cliente(usuarios);break;
                case 6:prestamo(usuarios);break;
                case 7:solicitar_CDT(usuarios);break;

                case 0:System.out.println("Salida del programa");return;
                    
            
                default:System.out.println("Ingrese una opcion valida");break;
                    
            }
        }
    }

    private static void agregar_cliente(ArrayList<Cliente> usuarios){

        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre:");

        String cedula =JOptionPane.showInputDialog(null,"Ingrese el numero de cedula:");

        int nivel_ingresos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su nivel de ingresos"));

        int fecha_creacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su fecha de creacion"));
    
        int saldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero ahorrado"));
       

   
        Cliente client = new Cliente(nombre,cedula,nivel_ingresos,fecha_creacion,saldo);
        usuarios.add(client);  
        System.out.println("\nCliente agregado exitosamente!");
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

    public static void agregar_saldo(ArrayList<Cliente> usuarios){
        String cedula = JOptionPane.showInputDialog(null,"Ingrese el numero de cedula:");


        int indice_cliente = buscar_cliente_cedula(usuarios, cedula);

        System.out.println("Este es el indice: " + indice_cliente);

        if(indice_cliente != -1) {
            
            int nuevo_saldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el saldo a añadir:"));

            
            usuarios.get(indice_cliente).setSaldo(usuarios.get(indice_cliente).getSaldo() + nuevo_saldo);
            System.out.println("Saldo agregado correctamente");
        } else{
            System.out.println("\nCliente no encontrado");
        }
    
    }


    public static void  eliminar_saldo(ArrayList<Cliente> usuarios){
        String cedula = JOptionPane.showInputDialog(null,"Ingrese el numero de cedula:");


        int indice_cliente = buscar_cliente_cedula(usuarios, cedula);

        System.out.println("Este es el indice: " + indice_cliente);

        if(indice_cliente != -1) {
            int nuevo_saldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el saldo a eliminar:"));
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
            
            String nombre = (JOptionPane.showInputDialog(null,"Ingrese su nombre"));

    
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
        public static void prestamo(ArrayList<Cliente> usuarios){
            
            String cedula = JOptionPane.showInputDialog(null,"Ingrese el numero de cedula:");

    
            int indice_cliente = buscar_cliente_cedula(usuarios, cedula);
    
    
            if(indice_cliente != -1) {
            
                int nuevo_saldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero del prestamo:"));


                if(usuarios.get(indice_cliente).getSaldo() > nuevo_saldo) {
                    usuarios.get(indice_cliente).setSaldo(usuarios.get(indice_cliente).getSaldo() - nuevo_saldo);
                    System.out.println("\nPrestamo enviado correctamente");
                }else if (nuevo_saldo > usuarios.get(indice_cliente).getSaldo() && nuevo_saldo < (usuarios.get(indice_cliente).getSaldo() * 2) ) {
                    int cantidad_cuotas = 6;
                    double interes_mensual = 0.02 / 12;
                    double cuota_mensual = nuevo_saldo * (interes_mensual * Math.pow(1 + interes_mensual, cantidad_cuotas)) / (Math.pow(1 + interes_mensual, cantidad_cuotas) - 1);
                    System.out.println("El valor de tu cuota mensual será de: " + cuota_mensual);
                    System.out.println("Tu préstamo se pagará en " + cantidad_cuotas + " cuotas mensuales.");

                }else{
                    System.out.println("No tienes tanto dinero");
                }
            } else{
                System.out.println("\nCliente no encontrado");
            }
    
            
        }

        public static void solicitar_CDT(ArrayList<Cliente> usuarios){


            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre:");
    
            String cedula =JOptionPane.showInputDialog(null,"Ingrese el numero de cedula:");
        
            int nivel_ingresos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su nivel de ingresos"));
            
            int saldo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero ahorrado"));
            // Solicitar al usuario seleccionar la duración del CDT (3 o 6 meses)
        
            int duracionCDT = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la duración del CDT (3 o 6 meses)"));
            // Determinar la tasa de interés anual según la duración del CDT seleccionada
            
            double interesAnual = 0;
            if (duracionCDT == 3) {
                interesAnual = 0.03; // 3%
            } else if (duracionCDT == 6) {
                interesAnual = 0.05; // 5%
            // Si la duración seleccionada no es válida, mostrar un mensaje de error y salir del programa
            } else {
                System.out.println("Duración inválida. Por favor seleccione 3 o 6 meses.");
            }
            // Convertir la duración del CDT de meses a años para calcular el interés total
            double duracionEnAnios = duracionCDT / 12.0;
            // Calcular el interés total ganado
            double interestotal = saldo * interesAnual * duracionEnAnios;
            // Mostrar el interés total ganado después de la duración del CDT seleccionada
            System.out.println("El interés total ganado después de " + duracionCDT + " meses es: " + interestotal);



        }





}

