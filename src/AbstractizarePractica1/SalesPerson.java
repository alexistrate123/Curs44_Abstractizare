package AbstractizarePractica1;

public class SalesPerson {

    public MuzicalInstrument SellInstrument(String instrumentDorit) {
        if (instrumentDorit.equalsIgnoreCase("Guitar")) {
            return new Guitar();
        } else if (instrumentDorit.equalsIgnoreCase("Piano")) {
            return new Piano();
        } else if (instrumentDorit.equalsIgnoreCase("Saxophone")) {
            return new Saxophone();
        } else {
            System.err.println("Nu avem acest tip de instrument.");
            return null;
        }

    }
}
