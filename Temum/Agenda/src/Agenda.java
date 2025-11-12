public class Agenda {
    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Nome da Agenda: ").append(nome).append("\n");

    if (contatos != null && contatos.length > 0) {
        sb.append("Contatos:\n");
        for (Contato c : contatos) {
            sb.append(c).append("\n");  // chama o toString() de Contato
        }
    } else {
        sb.append("Nenhum contato adicionado.\n");
    }

    return sb.toString();
    }
}
