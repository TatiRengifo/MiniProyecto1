public class Cliente {
    private String nombre;
    private String cedula;
    private int nivel_ingresos;
    private int fecha_creacion;
    private double saldo;
    private int duracionCDT; 
    private double durationenAnios; 
    private double interestotal; 
    public Cliente(){      
    }
    public Cliente(String nombre, String cedula, int nivel_ingresos, 
    int fecha_creacion, int saldo,int duracionCDT, double durationenAnios,
     double interestotal){
        this.nombre = nombre;
        this.cedula = cedula;
        this.nivel_ingresos = nivel_ingresos;
        this.fecha_creacion = fecha_creacion;
        this.saldo = saldo;
        this.duracionCDT = duracionCDT;
        this.durationenAnios = durationenAnios;
        this.interestotal = interestotal;
    }
    

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public int getNivel_ingresos() {
        return nivel_ingresos;
    }
    
    public void setNivel_ingresos(int nivel_ingresos) {
        this.nivel_ingresos = nivel_ingresos;
    }
    
    public int getFecha_creacion() {
        return fecha_creacion;
    }
    
    public void setFecha_creacion(int fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double d) {
        this.saldo = d;
    }

    public int getDuracionCDT() {
        return duracionCDT;
    }

    public void setDuracionCDT(int duracionCDT) {
        this.duracionCDT = duracionCDT;
    }

    public double getDurationenAnios() {
        return durationenAnios;
    }

    public void setDurationenAnios(double durationenAnios) {
        this.durationenAnios = durationenAnios;
    }

    public double getInterestotal() {
        return interestotal;
    }

    public void setInterestotal(double interestotal) {
        this.interestotal = interestotal;
    }
}