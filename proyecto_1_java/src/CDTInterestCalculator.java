import java.util.Scanner;

public class CDTInterestCalculator {
    /**
 * Este programa calcula el interés ganado en un Certificado de Depósito a Término (CDT)
 * basado en la cantidad de dinero ahorrado y la duración seleccionada del CDT.
 */
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
