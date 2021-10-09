package coin.state;


public interface State
{
    public abstract void rustedCoin();
    public abstract void bentCoin();
    public abstract void corrodedCoin();
    public abstract void damagedCoin();
}
