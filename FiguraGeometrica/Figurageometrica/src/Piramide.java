public class Piramide extends Figura3D implements DimensaoVolumetrica{

    private double altura;
    private double aretasBase;
    private double apotema;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAretasBase() {
        return aretasBase;
    }

    public void setAretasBase(double aretasBase) {
        this.aretasBase = aretasBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    private Figura2D base;

    @Override
    public void CalcularVolumne() {
        // TODO Auto-generated method stub
        
    }
}
