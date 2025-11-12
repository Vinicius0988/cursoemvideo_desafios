import java.util.Scanner;

public class Saque {
    
    // O método agora usa os Getters da classe Conta.
    public void sacar (Conta conta, Scanner sc) {
        
        // 1. Apresenta o saldo usando o Getter
        System.out.println("Olá " + conta.getName() + 
        "\nSeu saldo atual é de R$" + 
        String.format("%.2f", conta.getBalance()) + // Formata o saldo para 2 casas
        "\n(Há uma taxa de R$5,00 por saque)");
        System.out.print("Quanto deseja sacar? R$");
        
        double valorSaque;
        
        // Trata a entrada não numérica
        if (sc.hasNextDouble()) {
            valorSaque = sc.nextDouble();
        } else {
            System.out.println("Entrada inválida. Por favor, digite um valor numérico.");
            sc.next(); // Limpa a entrada inválida
            return;
        }
        
        // Consome o caractere de nova linha (boa prática após nextDouble)
        sc.nextLine(); 

        // Define a taxa
        final double TAXA = 5.00;
        double valorTotal = valorSaque + TAXA;

        // 2. Chama o método de saque da classe Conta para fazer a validação e a alteração
        // O método sacar() dentro de Conta deve retornar true ou false
        if (conta.sacar(valorTotal)) { 
            System.out.println("Saque de R$" + String.format("%.2f", valorSaque) + " (mais R$" + String.format("%.2f", TAXA) + " de taxa) realizado com sucesso!");
            System.out.println("Saldo atual: R$" + String.format("%.2f", conta.getBalance()));
        } else if (valorSaque <= 0) {
            System.out.println("Erro: O valor a ser sacado deve ser positivo.");
        } else {
            // Se o método sacar na Conta falhou, o saldo era insuficiente
            System.out.println("Saldo insuficiente para a operação (R$" + String.format("%.2f", valorTotal) + " necessários).");
        }
    }
}