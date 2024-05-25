package Tema_Ex1;

public class SecondClassPassenger extends Passenger {
    public SecondClassPassenger(String name) {
        super(name);
    }

    @Override
    public void useBenefits() {
        System.out.println(name + " beneficiaza de alune si apa in clasa a doua.");
    }
}
