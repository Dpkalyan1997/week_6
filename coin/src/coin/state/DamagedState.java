package coin.state;


public class DamagedState implements State {

    Coin coin;
    public DamagedState(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void rustedCoin() {
        System.out.println("Coins can be used to buy or sell things");
        coin.setState(coin.getRustedState());
    }

    @Override
    public void bentCoin() {
        System.out.println("Coins are replaced by notes on higher value");
    }

    @Override
    public void corrodedCoin() {
        System.out.println("Coins are a form of currency");

    }

    @Override
    public void damagedCoin() {
        System.out.println("Coin damaged");

    }

}


