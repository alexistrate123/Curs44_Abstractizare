package Tema_Ex2;

import java.util.Random;

public class BitCoin extends CryptoCurrency {
    public BitCoin(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {
        Random random = new Random();
        double chance = random.nextDouble();

        if (chance < 0.6) {
            valueInUSD += 100;
        } else {
            valueInUSD -= 80;
        }
    }
}

