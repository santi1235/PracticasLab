import java.util.Scanner;

public class PotenciaDeDos {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in))
        {
            int numero;

            while (true) {
                System.out.print("Introduce un numero positivo: ");
                numero = scanner.nextInt();
                
                if (numero > 0) {
                    break; // Salir del bucle si el número es positivo
                } else {
                    // Limpiar la pantalla (esto funciona en la consola de Windows)
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Por favor, introduce un numero positivo.");
                }
            }

            int potencia = 1; // Iniciamos con 2^0
            int exponente = 0; // Exponente correspondiente

            while (potencia * 2 <= numero) {
                potencia *= 2; // Multiplicamos por 2
                exponente++; // Aumentamos el exponente
            }

            System.out.println("La potencia de 2 mas proxima sin pasarse es: 2^" + exponente + " = " + potencia);
            
            scanner.close();
        }
    }
}
