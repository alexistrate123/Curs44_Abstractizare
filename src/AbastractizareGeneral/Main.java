package AbastractizareGeneral;

public class Main {
   /*
 -  O clasa abstracta este o clasa care niciodata nu va putea fi instantiata;

  - Clasele abstracte pot avea 2 tipuri de metode:

 -  a) normale , ( ca pana acum ) -> care pot fi mostenite de toate clasele (Copii);

 -  b) abstracte, pot fi declarate doar intr-o clasa abstracta, specificand keyword-ul "abstract" inainte de
   return-type-ul metodei noastre.

   Ex: public abstract void() {
   doSomething;
   }

 -  Metodele abstracte nu au o implementare;

 -  O metoda abstracta este o metoda care isi forteaza toate clasele copil sa aiba propria ei implementare a acelei
 functionalitati sau acelei metode;

    */

    public static void main(String[] args) {
        Audi audi1 = new Audi("AbastractizareGeneral.Audi", "A7");
        Mercedes mercedes1 = new Mercedes("AbastractizareGeneral.Mercedes", "A Class");

        audi1.startEngine();
        mercedes1.accelerate();
    }
}
