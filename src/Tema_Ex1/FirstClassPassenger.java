package Tema_Ex1;

public class FirstClassPassenger extends Passenger {
    public FirstClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println(name + " beneficiaza de sampanie in clasa intai.");
    }
}
