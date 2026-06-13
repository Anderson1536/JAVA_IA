import java.util.Scanner;

public class RepasoClase {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresar nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = entrada.nextInt();

        System.out.print("Ingresar esatatura: ");
        double estatura = entrada.nextDouble();

        System.out.println("\nDATOS:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
}