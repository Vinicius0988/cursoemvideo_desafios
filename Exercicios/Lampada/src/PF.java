public class PF extends Pessoa {
    String cpf;
    String dataNasc;

    public PF(String nome, String endereco, String ciade, String estado,
                String cpf, String dataNasc) {
        super(nome,endereco,ciade,estado);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(" cpf:" + cpf + " Data de nascimento:" + dataNasc);
    }
}
