package coin.state;



public class RustedState implements State {

    Coin coin;
    public RustedState(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void rustedCoin() {
        System.out.println("Coins are made of alloy metals");

    }

    @Override
    public void bentCoin() {
        System.out.println("Coins are casted into circular shape");
        coin.setState(coin.getBentState());

    }

    @Override
    public void corrodedCoin() {
        System.out.println("cleaning Coin");
        coin.setState(coin.getCorrodedState());
    }

    @Override
    public void damagedCoin() {
        System.out.println("Coins can't be easily destroyed ");
        coin.setState(coin.getDamagedState());
    }

}



