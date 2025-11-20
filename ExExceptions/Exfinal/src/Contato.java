public class Contato {
    private String nome;
    private String telefone;
    private int identificador;

    private static int contador = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        
        contador++;
        this.identificador = contador;
    }

    @Override
    public String toString() {
        String s = "[";
        s += ", Nome: " + nome;
        s += ", Telefone: " + telefone;
        s += "]";
        return super.toString();
    }
}
