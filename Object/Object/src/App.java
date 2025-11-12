public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno();

        a1.setCurso("ADS");
        double[] notas = {10,9,7};
        a1.setNotas(notas);


        System.out.println(a1.toString());
    }
}
