public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado{
    private String tamanho;
    private String raca;

    public Cachorro(String nome, String tamanho, String raca) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {
        
    }     

    @Override
    public void brincar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void LevarPassear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void levarVeterinario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
