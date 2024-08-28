import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos
        System.out.println("Ingrese la marca del vehículo:"); // Se ingrese marca
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehículo:"); // Se ingrese modelo
        String modelo = scanner.nextLine();

        System.out.println("Ingrese la cilindrada del vehículo:"); // Se ingrese cilindrada
        String cilindrada = scanner.nextLine();

        System.out.println("Ingrese el tipo de combustible del vehículo:"); // Se ingrese tipo de combustible
        String tipoCombustible = scanner.nextLine();

        System.out.println("Ingrese la capacidad de pasajeros del vehículo:"); // Se ingrese capacidad de pasajeros
        int capacidadPasajeros = scanner.nextInt();

        // Todo lo de acá muestra los datos ingresados por el usuario
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        // Cerrar el Scanner
        scanner.close();
    }
}
