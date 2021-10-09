package coin.state;

public interface Builder {
    Builder Metal();
    Builder Casting();
    Builder Printing();
    Coin build();
}