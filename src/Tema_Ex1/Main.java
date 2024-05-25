package Tema_Ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*
     Creeaza clasa Passenger cu proprietatea String name si metoda abstracta void useBenefits();
 Creeaza clasele copii First(sampanie)/Second(Alune si apa)/ThirdClassPassenger(sendvisuri);
 Adauga 5 pasangeri de fiecare tip intr-o lista si fa-i pe toti sa se bucure de beneficiile clasei.
     */

    public static void main(String[] args) {
        ArrayList<Passenger> pasageri = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            pasageri.add(new FirstClassPassenger("FirstClassPassenger" + i));
            pasageri.add(new SecondClassPassenger("SecondClassPassenger" + i));
            pasageri.add(new ThirdClassPassenger("ThirdClassPassenger" + i));
        }

        for (Passenger pasager : pasageri) {
            pasager.useBenefits();
        }
    }
}
