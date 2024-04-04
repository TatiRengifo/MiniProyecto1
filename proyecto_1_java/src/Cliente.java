public class Cliente {
    // Atributos de la clase
    private String nombre; // Nombre del cliente
    private String cedula; // Cedula del cliente
    private int nivel_ingresos; // Nivel de ingresos del cliente
    private int fecha_creacion; // Fecha de creacion del cliente
    private int saldo; // Saldo del cliente

    //Constructor por defecto de la clase Cliente.

    public Cliente(){
        
    }

    //Constructor de la clase Cliente

    public Cliente(String nombre, String cedula, int nivel_ingresos, int fecha_creacion, int saldo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.nivel_ingresos = nivel_ingresos;
        this.fecha_creacion = fecha_creacion;
        this.saldo = saldo;
    }
    
    // Métodos getters y setters para acceder y modificar los atributos de la clase

    //Obtiene el nombre del cliente.
    public String getNombre() {
        return nombre;
    }
    

    //Establece el nombre del cliente.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Obtiene la cedula del cliente.
    public String getCedula() {
        return cedula;
    }
    

    //Establece la cedula del cliente.
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    

    //Obtiene el nivel de ingresos del cliente.
    public int getNivel_ingresos() {
        return nivel_ingresos;
    }
    

    //Establece el nivel de ingresos del cliente.
    public void setNivel_ingresos(int nivel_ingresos) {
        this.nivel_ingresos = nivel_ingresos;
    }
    

    //Obtiene la fecha de creacion del cliente.
    public int getFecha_creacion() {
        return fecha_creacion;
    }
    

    //Establece la fecha de creacion del cliente.
    public void setFecha_creacion(int fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }


    //Obtiene el saldo del cliente.
    public int getSaldo() {
        return saldo;
    }


    //Establece el saldo del cliente.
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}