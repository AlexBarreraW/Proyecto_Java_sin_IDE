import java.util.Scanner;
import java.util.Scanner;

import java.util.Scanner; // Importa la clase Scanner del paquete java.util, que se utiliza para leer la entrada del usuario desde la consola.

public class Menu { // Define una clase pública llamada Menu.
    public static void main(String[] args) { // Método principal donde comienza la ejecución del programa.
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario desde el teclado.

        // Solicitar al usuario su nombre y edad
        System.out.println("Ingrese su nombre:"); // Muestra un mensaje solicitando el nombre del usuario.
        String nombre = scanner.nextLine(); // Lee la entrada del usuario y la almacena en la variable nombre.

        System.out.println("Ingrese su edad:"); // Muestra un mensaje solicitando la edad del usuario.
        int edad = scanner.nextInt(); // Lee la edad del usuario como un entero.
        scanner.nextLine(); // Limpia el buffer después de leer un entero, para evitar problemas en la siguiente entrada.

        // Solicitar al usuario que ingrese los datos del vehículo
        System.out.println("Ingrese la marca del vehículo:"); // Solicita la marca del vehículo.
        String marca = scanner.nextLine(); // Lee la marca ingresada por el usuario.

        System.out.println("Ingrese el modelo del vehículo:"); // Solicita el modelo del vehículo.
        String modelo = scanner.nextLine(); // Lee el modelo ingresado por el usuario.

        System.out.println("Ingrese la cilindrada del vehículo:"); // Solicita la cilindrada del vehículo.
        String cilindrada = scanner.nextLine(); // Lee la cilindrada ingresada por el usuario.

        System.out.println("Ingrese el tipo de combustible del vehículo:"); // Solicita el tipo de combustible del vehículo.
        String tipoCombustible = scanner.nextLine(); // Lee el tipo de combustible ingresado por el usuario.

        System.out.println("Ingrese la capacidad de pasajeros del vehículo:"); // Solicita la capacidad de pasajeros del vehículo.
        int capacidadPasajeros = scanner.nextInt(); // Lee la capacidad de pasajeros como un entero.

        // Mostrar los datos ingresados por el usuario
        System.out.println("\nDatos del Usuario:"); // Muestra un encabezado para los datos del usuario.
        System.out.println("Nombre: " + nombre); // Muestra el nombre ingresado por el usuario.
        System.out.println("Edad: " + edad); // Muestra la edad ingresada por el usuario.

        System.out.println("\nDatos del Vehículo:"); // Muestra un encabezado para los datos del vehículo.
        System.out.println("La marca que ha ingresado es: " + marca); // Muestra la marca del vehículo.
        System.out.println("El modelo que ha ingresado es: " + modelo); // Muestra el modelo del vehículo.
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); // Muestra la cilindrada del vehículo.
        System.out.println("El tipo de combustible es: " + tipoCombustible); // Muestra el tipo de combustible del vehículo.
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros."); // Muestra la capacidad de pasajeros del vehículo.

        scanner.close(); // Cierra el objeto Scanner para liberar los recursos asociados.
    }
}