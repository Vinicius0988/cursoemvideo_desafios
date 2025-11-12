public class Lampada {
    private String tipoDeLuz;
    private int qntWtz;
    private String tamanho;


    public void ligarLmapada() {
        System.out.println("a lampada esta liagada");
    }

    public void desligarLampada() {
        System.out.println("a lamapada esta desligada");
    }

    public Lampada(String tipoDeLuz, int qntWtz, String tamanho) {
        this.tipoDeLuz = tipoDeLuz;
        this.qntWtz = qntWtz;
        this.tamanho = tamanho;
    }

    
}
