import java.util.Scanner;

public class UsuarioSimple {
    
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("=== PROGRAMA DE LECTURA DE DATOS SIMPLES ===");
        System.out.println("Por favor, ingresa los siguientes datos:\n");
        
     
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
  
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        // Limpiar el buffer del scanner
        scanner.nextLine();
        
  
        System.out.print("Ingresa tu ciudad: ");
        String ciudad = scanner.nextLine();
        
    
        System.out.print("Ingresa tu altura (en metros, ej: 1.65): ");
        double altura = scanner.nextDouble();
        
  
        System.out.println("\n=== DATOS INGRESADOS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Altura: " + altura + " metros");
        
      
        System.out.println("\n¡Hola " + nombre + "! Tienes " + edad + " años y vives en " + ciudad + ".");
        System.out.println("Tu altura es de " + altura + " metros.");
        

        scanner.close();
        
        System.out.println("\n¡Gracias por usar el programa!");
    }
}
