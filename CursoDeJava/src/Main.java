import java.util.Scanner;
// Assumindo que Conta e Saque existem e estão no mesmo pacote.

public class Main {
    public static void main(String[] args) {
        // ... (Instanciação de Conta e Saque)
        Conta minhaConta = new Conta();
        Saque saqueObj = new Saque();

        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        System.out.println("--- INÍCIO DO SISTEMA BANCÁRIO ---");

        while (rodando) {
            System.out.println(
            "------------------------------------\n" +
            "Qual operacao deseja realizar?\n" +
            "Digite 1 para Registrar\n" +
            "Digite 2 para Sacar\n" +
            "Digite 3 para Depositar\n" +
            "Digite 4 para Sair");

            // Verifica se a entrada é um número antes de ler
            if (!sc.hasNextInt()) {
                System.out.println("Por favor, digite um número de opção válido (1 a 4).");
                sc.next(); // Limpa a entrada inválida (ex: texto)
                continue;  // Reinicia o loop
            }

            int la = sc.nextInt();
            
            // Consome a quebra de linha pendente após o nextInt()
            // Isso evita que o próximo nextLine() em 'register' pule a entrada.
            sc.nextLine(); 
            
            switch (la) {
                case 1:
                    minhaConta.register(sc);
                    break;
                case 2:
                    saqueObj.sacar(minhaConta, sc);
                    break;
                case 3:
                    // CORREÇÃO: Chama o método depositar.
                    minhaConta.depositar(sc); 
                    break;
                case 4:
                    // CORREÇÃO: Adiciona a opção de SAIR.
                    rodando = false;
                    System.out.println("Obrigado por usar nossos serviços. Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção invalida. Por favor, digite um número de 1 a 4.");
            }
        }
        sc.close(); // Boa prática: fechar o Scanner no final.
    } 
}