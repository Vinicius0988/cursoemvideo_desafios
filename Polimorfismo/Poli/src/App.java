public class App {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa1 = new Pessoa();
        Pessoa aluno1 = new Aluno();
        Pessoa professor1 = new Professor();

        pessoa1.setEndereco("Rua 1, numero 1 ");
        aluno1.setEndereco("Rua 2, numero 2");
        professor1.setEndereco("Rua 3, numero 3");

        System.out.println(pessoa1.obterEtiquetaEndereco());
        System.out.println(aluno1.obterEtiquetaEndereco());
        System.out.println(professor1.obterEtiquetaEndereco());
    }
}
