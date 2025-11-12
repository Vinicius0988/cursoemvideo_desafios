public class Professor extends Pessoa{
    private String meuCurso;
    private double salario;

    public String getMeuCurso() {
        return meuCurso;
    }

    public void setMeuCurso(String meuCurso) {
        this.meuCurso = meuCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
}
