package laboratorio9;

import java.util.Scanner;

class DepositoInvalidoException extends Exception{
    public DepositoInvalidoException(String mensaje){
        super(mensaje);
    }
}

class RetiroInvalidoException extends Exception{
    public RetiroInvalidoException(String mensaje){
        super(mensaje);
    }
}

class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}

class CuentaBancaria{
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void Depositar(double n_saldo){
        try {
            if (n_saldo<0) {
                throw new DepositoInvalidoException("No se puede depositar una cantidad negativa");
            }
            this.saldo += n_saldo;
            System.out.println("Deposito exitoso. Saldo total: " + saldo);
        } catch (DepositoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void Retirar(double n_saldo){
        try {
            if (n_saldo<0) {
                throw new RetiroInvalidoException("No se puede retirar una cantidad negativa");
            }
            if (n_saldo > saldo) {
                throw new FondosInsuficientesException("No se puede retirar una cantidad mayor a la de su saldo");
            }
            saldo -= n_saldo;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } catch (RetiroInvalidoException | FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Excepciones{
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("CWXS", 500.0);

        try(Scanner myObj = new Scanner(System.in)){
            int Option=0;
            double monto;
            do {
                try {
                    System.out.println("\n--- Menu ---");
                    System.out.println("Saldo actual: $" + cuenta.saldo);
                    System.out.println("1.- Deposito");
                    System.out.println("2.- Retiro");
                    System.out.println("3.- Exit");

                    System.out.println("Ingresa una opcion: ");
                    Option = myObj.nextInt();

                    switch (Option) {
                        case 1 -> {
                            System.out.println("Ingresa el monto a depositar:");
                            monto = myObj.nextDouble();

                            cuenta.Depositar(monto);
                        }

                        case 2 -> {
                            System.out.println("Ingresa el monto a retirar:");
                            monto = myObj.nextDouble();

                            cuenta.Retirar(monto);
                        }

                        case 3 -> {
                            System.out.println("Saliendo del programa...");
                            break;
                        }
                    
                        default -> System.out.println("Escoge una opcion dentro de lo requerido");
                    }
                } catch (Exception e) {
                    System.out.println("Error: Entrada inválida. Por favor, ingresa un número.");
                    myObj.nextLine(); // Limpiar el buffer
                }
            } while(Option != 3);
        }        
    }
}