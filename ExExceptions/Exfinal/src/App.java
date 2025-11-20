import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Agenda agenda1 = new Agenda();

        System.out.println("Digite 1 para consultar ou 2 para adicionar");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao==1) {
            agenda1.listarContatos();
        } else if (opcao==2) {

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Telefone");
            String telefone = sc.nextLine();

            Contato c = new Contato(nome, telefone);

            agenda1.adicionarContato(c);
        }

        sc.close();
    }
}
