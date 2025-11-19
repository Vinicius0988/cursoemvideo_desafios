public class App {
    public static void main(String[] args) throws Exception {
        
        int[] numeros = {4,6,88,40,5,6,6,7};
        int[] demon = {2,0,4,8,0,2};

        for (int i=0;i<numeros.length;i++) {
            try {
                if (numeros[i] %2 !=0){
                    throw new DivisaoNaoExata(numeros[i], demon[i]);
                }
                System.out.println(numeros[i]/demon[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Deu erro");
            }
        }
    }
}
