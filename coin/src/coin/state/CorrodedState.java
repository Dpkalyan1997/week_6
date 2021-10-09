package coin.state;



public class CorrodedState implements State {

    Coin coin;
    public CorrodedState(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void rustedCoin() {
        System.out.println("Coin are a form of exchange");
        coin.setState(coin.getRustedState());
    }

    @Override
    public void bentCoin() {
        System.out.println("Coins are stored in wallets");
        coin.setState(coin.getBentState());
    }

    @Override
    public void corrodedCoin() {
        System.out.println("Coins cannot be broken");
    }

    @Override
    public void damagedCoin() {
        System.out.println("Coin can be bent or rusted");
        coin.setState(coin.getDamagedState());
    }

}