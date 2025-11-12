import java.util.Scanner;

public class Conta {
    // Fields - It's best practice to make these private (Encapsulation)
    private int accountNumber;
    private String name;
    private double balance = 0.0; // Initialize balance

    // Optional: Getters for other classes to read the data
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    // 1. Method to register the account
    public void register(Scanner sc) {
        // Since the previous read (in Main) was an int, we clear the buffer first
        sc.nextLine(); 
        
        System.out.println("--- REGISTRO DE CONTA ---");
        System.out.print("Digite seu nome: ");
        this.name = sc.nextLine();

        System.out.print("Digite o numero da conta: ");
        // We use nextLine() and parse to safely read inputs after nextLine() in name
        this.accountNumber = Integer.parseInt(sc.nextLine()); 

        System.out.print("Digite o valor de deposito inicial: R$");
        this.balance = sc.nextDouble();
        
        // Consume the remaining newline character
        sc.nextLine(); 
        
        System.out.println("Conta registrada com sucesso para " + this.name + ".");
    }

    // 2. The MISSING 'depositar' method that your Main class needs
    public void depositar(Scanner sc) {
        System.out.println("--- DEPOSITAR ---");
        System.out.println("Saldo atual: R$" + String.format("%.2f", this.balance));
        System.out.print("Digite o valor para depositar: R$");
        
        // Use nextDouble() to read the amount
        if (sc.hasNextDouble()) {
            double depositAmount = sc.nextDouble();

            if (depositAmount > 0) {
                this.balance += depositAmount;
                System.out.println("Depósito de R$" + String.format("%.2f", depositAmount) + " realizado.");
                System.out.println("Novo saldo: R$" + String.format("%.2f", this.balance));
            } else {
                System.out.println("Erro: O valor do depósito deve ser positivo.");
            }
        } else {
            System.out.println("Erro: Entrada inválida. Por favor, digite um valor numérico.");
            sc.next(); // Consume the invalid token
        }
        
        // Consume the remaining newline character
        sc.nextLine();
    }
    
    // 3. Helper method for the Saque class to use
    public boolean sacar(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}