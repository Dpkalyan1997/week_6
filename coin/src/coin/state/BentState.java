package coin.state;





public class BentState implements State{

    Coin coin;
    public BentState(Coin coin) {
        this.coin = coin;
    }

    @Override
    public void rustedCoin() {
        System.out.println("Coins are made of metal");
        coin.setState(coin.getRustedState());

    }

    @Override
    public void bentCoin() {
        System.out.println("Metals are ductile hence a have the property to bend");
    }

    @Override
    public void corrodedCoin() {
        System.out.println("The coin has a disadvantage of getting rusted");
        coin.setState(coin.getCorrodedState());
    }

    @Override
    public void damagedCoin() {
        System.out.println("Coin Destroyed");
        coin.setState(coin.getDamagedState());
    }



}

