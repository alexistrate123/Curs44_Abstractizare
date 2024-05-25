package Tema_Ex2;

public class Main {
    /*
    Creeaza clasa abstracta CryptoCurrency cu Double valueInUSD si metoda abstracta void changValue();
 Creeaza clasele copii BitCoin, Ethereum si XRP care vor avea prorpia lor implementare de metoda;
 BitCoin are o sansa de 60% sa creasca cu 100 de dolari, si 40% sa scada cu 80 de dolari;
 Ethereum are o sansa de 50% sa creasca cu 50 de dolari, si 50% sa scada cu 50 de dolari;
 XRP are o sansa de 80% sa creasca cu 10 de dolari, si 20% sa scada cu 30 de dolari;
     */

    public static void main(String[] args) {
        CryptoCurrency bitCoin = new BitCoin(1000);
        CryptoCurrency ethereum = new Ethereum(1000);
        CryptoCurrency xrp = new XRP(1000);

        bitCoin.changeValue();
        ethereum.changeValue();
        xrp.changeValue();

        // Fluctuare de 30 de ori pentru fiecare moneda
        for (int i = 1; i <= 30; i++) {
            bitCoin.changeValue();
            ethereum.changeValue();
            xrp.changeValue();
        }

        System.out.println("Valoarea finala a BitCoin: $" + bitCoin.valueInUSD);
        System.out.println("Valoarea finala a Ethereum: $" + ethereum.valueInUSD);
        System.out.println("Valoarea finala a XRP: $" + xrp.valueInUSD);
    }
}

