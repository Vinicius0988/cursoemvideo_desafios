public class Aluno {
    private String curso;
    private double[] notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularmedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    @Override
    public String toString() {
        String S = curso + "\n";
        for (double n : notas) {
            S += n + " ";
        }
        return S;
    }

    
}
