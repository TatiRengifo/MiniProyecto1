import java.util.Scanner;

public class CDTInterestCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero ahorrado: ");
        double dineroAhorrado = scanner.nextDouble();

        System.out.print("Seleccione la duración del CDT (3 o 6 meses): ");
        int duracionCDT = scanner.nextInt();

        double interesAnual;
        if (duracionCDT == 3) {
            interesAnual = 0.03; // 3%
        } else if (duracionCDT == 6) {
            interesAnual = 0.05; // 5%
        } else {
            System.out.println("Duración inválida. Por favor seleccione 3 o 6 meses.");
            return;
        }

        double duracionEnAnios = duracionCDT / 12.0;
        double interesTotal = dineroAhorrado * interesAnual * duracionEnAnios;

        System.out.println("El interés total ganado después de " + duracionCDT + " meses es: " + interesTotal);
    }

}
