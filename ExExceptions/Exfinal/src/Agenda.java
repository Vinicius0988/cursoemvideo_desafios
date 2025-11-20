import java.util.*;

public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList<>();

    public void listarContatos() {
        for (Contato c : contatos ) {
            System.out.println(c.getIdentificador() + "-" + c.getNome() + "-" + c.getTelefone());
        }
    }

    public void adicionarContato(Contato c) {
        contatos.add(c);

    }
}
