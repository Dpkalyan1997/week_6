package coin.state;



public class Main {

    public static void main(String[] args) {

        CoinBuilder coin=new CoinBuilder();
        Coin builds=coin.Metal().Casting().Printing().build();


        builds.rustedCoin();

        builds.damagedCoin();

        builds.corrodedCoin();

        builds.bentCoin();

        builds.rustedCoin();

    }

}



