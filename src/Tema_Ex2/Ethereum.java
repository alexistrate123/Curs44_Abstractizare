package Tema_Ex2;

import java.util.Random;

public class Ethereum extends CryptoCurrency {
    public Ethereum(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {
        Random random = new Random();
        double chance = random.nextDouble();

        if (chance < 0.5) {
            valueInUSD += 50;
        } else {
            valueInUSD -= 50;
        }
    }
}
