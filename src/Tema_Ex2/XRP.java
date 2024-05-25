package Tema_Ex2;

import java.util.Random;

public class XRP extends CryptoCurrency{
    public XRP(double valueInUSD) {
        super(valueInUSD);
    }

    @Override
    public void changeValue() {
        Random random = new Random();
        double chance = random.nextDouble();

        if (chance < 0.8) {
            valueInUSD += 10;
        } else {
            valueInUSD -= 30;
        }
    }
}
