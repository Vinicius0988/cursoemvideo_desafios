public class App {
    public static void main(String[] args) throws Exception {

        try {
            int[] vetor = new int[4];
        
            System.out.println("Antes da execao");

            vetor[4] = 1;

            System.out.println("nao sera impresso");
        } catch (lala exception) {
            System.out.println("Exeçao ao acessar um indice do vetor que nao exixte");
        }

        System.out.println("Esse texto sera impresso apos a exeption");
        

        

    }
}
