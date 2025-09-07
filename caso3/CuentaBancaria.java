    import java.util.Scanner;

/**
 * Caso 3: Clase CuentaBancaria con validación
 * 
 * Este programa implementa una clase CuentaBancaria que permite
 * operaciones básicas como depositar y retirar, validando que
 * no se retire más del saldo disponible.
 * 
 */
public class CuentaBancaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA BANCARIO ===");
        System.out.println("Vamos a crear una nueva cuenta bancaria:\n");
        
        System.out.print("Ingresa el nombre del titular: ");
        String titular = scanner.nextLine();
        
        System.out.print("Ingresa el número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        
        System.out.print("Ingresa el saldo inicial: $");
        double saldoInicial = scanner.nextDouble();
        
        Cuenta cuenta = new Cuenta(titular, numeroCuenta, saldoInicial);
        
    
        System.out.println("\n=== CUENTA CREADA EXITOSAMENTE ===");
        cuenta.mostrarInformacion();
        
      
        int opcion;
        do {
            System.out.println("\n=== MENÚ DE OPERACIONES ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Mostrar información de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción (1-5): ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\nSaldo actual: $" + cuenta.getSaldo());
                    break;
                    
                case 2:
                    System.out.print("Ingresa el monto a depositar: $");
                    double montoDeposito = scanner.nextDouble();
                    if (cuenta.depositar(montoDeposito)) {
                        System.out.println("Depósito realizado exitosamente!");
                        System.out.println("Nuevo saldo: $" + cuenta.getSaldo());
                    } else {
                        System.out.println("Error: El monto debe ser mayor a 0");
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingresa el monto a retirar: $");
                    double montoRetiro = scanner.nextDouble();
                    if (cuenta.retirar(montoRetiro)) {
                        System.out.println("Retiro realizado exitosamente!");
                        System.out.println("Saldo restante: $" + cuenta.getSaldo());
                    } else {
                        System.out.println("Error: No se puede realizar el retiro");
                        System.out.println("Motivo: " + cuenta.getMensajeError());
                    }
                    break;
                    
                case 4:
                    cuenta.mostrarInformacion();
                    break;
                    
                case 5:
                    System.out.println("¡Gracias por usar el sistema bancario!");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción del 1 al 5.");
            }
            
        } while (opcion != 5);
        
        scanner.close();
    }
}

/**
 * Clase Cuenta que representa una cuenta bancaria
 * Incluye validaciones para operaciones de depósito y retiro
 */
class Cuenta {
 
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private String mensajeError;
    

    public Cuenta(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.mensajeError = "";
    }
    
 
    public String getTitular() {
        return titular;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getMensajeError() {
        return mensajeError;
    }
    
 
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
  
    public boolean depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            mensajeError = "";
            return true;
        } else {
            mensajeError = "El monto debe ser mayor a 0";
            return false;
        }
    }
    
    public boolean retirar(double monto) {
        if (monto <= 0) {
            mensajeError = "El monto debe ser mayor a 0";
            return false;
        } else if (monto > saldo) {
            mensajeError = "Fondos insuficientes. Saldo disponible: $" + saldo;
            return false;
        } else {
            saldo -= monto;
            mensajeError = "";
            return true;
        }
    }
    
    /**
     * Método para mostrar toda la información de la cuenta
     */
    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DE LA CUENTA ===");
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}
