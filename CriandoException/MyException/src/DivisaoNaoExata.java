public class DivisaoNaoExata extends Exception {
    private int num;
    private int dem;

    public DivisaoNaoExata(int dem, int num) {
        super();
        this.dem = dem;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + dem + "nao e um numero inteiro";
    }

}
