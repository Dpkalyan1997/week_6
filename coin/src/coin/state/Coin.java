package coin.state;


public class Coin
{
    BentState bentState;
    CorrodedState corrodedState;
    RustedState rustedState;
    DamagedState damagedState;
    State state;

    Coin()
    {
        bentState = new BentState(this);
        corrodedState= new CorrodedState(this);
        damagedState = new DamagedState(this);
        rustedState=new RustedState(this);
        state=rustedState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public BentState getBentState() {
        return bentState;
    }

    public CorrodedState getCorrodedState() {
        return corrodedState;
    }

    public RustedState getRustedState() {
        return rustedState;
    }

    public DamagedState getDamagedState() {
        return damagedState;
    }

    public void rustedCoin()  {
        state.rustedCoin();
    }

    public void bentCoin()  {
        state.bentCoin();
    }

    public void corrodedCoin() {
        state.corrodedCoin();
    }
    public void damagedCoin() {
        state.damagedCoin();
    }

}

