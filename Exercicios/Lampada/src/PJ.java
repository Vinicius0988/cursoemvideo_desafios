public class PJ extends Pessoa{
    String cnpj;
    String razaoSocial;

    public PJ(String nome, String endereco, String cidade, String estado,
                String cnpj, String razaoSocial) {
        super(nome, endereco, cidade, estado);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("cnpj:" + cnpj + "Razao social:" + razaoSocial);
    }
}
