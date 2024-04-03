public class CDTInterestCalculator {
    private double dineroAhorrado;
    private int duracionCDT; 
    private double interesAnual;
    private double duracionEnAnios;
    private double interesTotal;

    public CDTInterestCalculator(double dineroAhorrado, int duracionCDT, double interesAnual, double duracionEnAnios,
            double interesTotal) {
        this.dineroAhorrado = dineroAhorrado;
        this.duracionCDT = duracionCDT;
        this.interesAnual = interesAnual;
        this.duracionEnAnios = duracionEnAnios;
        this.interesTotal = interesTotal;
    }

    public double getDineroAhorrado() {
        return dineroAhorrado;
    }

    public void setDineroAhorrado(double dineroAhorrado) {
        this.dineroAhorrado = dineroAhorrado;
    }

    public int getDuracionCDT() {
        return duracionCDT;
    }

    public void setDuracionCDT(int duracionCDT) {
        this.duracionCDT = duracionCDT;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public double getDuracionEnAnios() {
        return duracionEnAnios;
    }

    public void setDuracionEnAnios(double duracionEnAnios) {
        this.duracionEnAnios = duracionEnAnios;
    }

    public double getInteresTotal() {
        return interesTotal;
    }

    public void setInteresTotal(double interesTotal) {
        this.interesTotal = interesTotal;
    }
    



}
