package Tema_Ex1;

public class ThirdClassPassenger extends Passenger {
    public ThirdClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println(name + " beneficiaza de sendvisuri in clasa a treia.");
    }
}
