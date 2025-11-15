public class Gato extends Mamifero{
    private String raca;

    public Gato(String raca, String nome) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {
        
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
