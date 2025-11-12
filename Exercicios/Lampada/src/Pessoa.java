public class Pessoa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;

    public Pessoa(String nome, String endereco, String ciadde, String estado) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = ciadde;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome()+ " Endereco: " + getEndereco() +
        " Cidade: " + getCidade() + " Estado: " + getEstado());
    }
    
}
