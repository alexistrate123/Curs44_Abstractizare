package AbstractizarePractica1;

public class Main {
    /*  Part I
    Creeaza clasa MuzicalInstruments care are metoda playMuzic();
    Clasele copii Guitar, Saxophone, Piano
    Initializeaza cate un obiect de fiecare tip de instrument si fa-l sa cante.
    Fiecare instrument trebuie sa aiba propria lui implementare a metodei playMsuic();

    Part II
    Creeaza clasa SalesPerson care are metoda MuzicalInstrument() si metoda sellInstrument()
    Metoda noastra va intreba utilizatorul ce instrument doreste, iar daca acesta va introduce un instrument valabil,
    ii va face un sound test apoi il va returna.
    In caz ca i m, nu este valabil se va afisa un mesaj corespunzator.
     */

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Saxophone saxophone = new Saxophone();

        guitar.playMuzic();
        piano.playMuzic();
        saxophone.playMuzic();

        System.out.println();

        SalesPerson salesPerson = new SalesPerson();
        MuzicalInstrument instrument1= salesPerson.SellInstrument("Guitar");
        MuzicalInstrument instrument2 = salesPerson.SellInstrument("Piano");
        MuzicalInstrument instrument3 = salesPerson.SellInstrument("Saxophone");
        MuzicalInstrument instrument4 = salesPerson.SellInstrument("Muzicuta");

        instrument1.playMuzic();
        instrument2.playMuzic();
        instrument3.playMuzic();
    }
}
