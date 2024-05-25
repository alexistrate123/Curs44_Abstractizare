package Tema_Ex2;

public abstract class CryptoCurrency {
    protected double valueInUSD;

    public CryptoCurrency(double valueInUSD) {
        this.valueInUSD = valueInUSD;
    }


    public abstract void changeValue();
}


