package AbastractizareGeneral;

public class Audi extends Car{
    public Audi(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void accelerate() {
        System.out.println("AbastractizareGeneral.Audi da talpa la acceleratie.");
    }
}
