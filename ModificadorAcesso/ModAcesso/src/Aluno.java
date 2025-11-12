public class Aluno extends Pessoa{
    private String curso;
    private double[][] notas;

    public void verificarAcesso() {
        
    }

    public Aluno(String curso, double[][] notas, String cpf, String endereco, String nome, String telefone) {
        super(cpf, endereco, nome, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public double calcularmedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }











}
