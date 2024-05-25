package AbastractizareGeneral;

public class Mercedes extends Car {
    public Mercedes(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedesul a accelerat.");
    }
}
