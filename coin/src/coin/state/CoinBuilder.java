package coin.state;


public class CoinBuilder implements Builder{

    CoinBuilder(){

    }

    @Override
    public Builder Metal() {
        System.out.println("Coins are a form of currency");
        return this;
    }

    @Override
    public Builder Casting() {
        System.out.println("If the coin is not stored properly there are chances of getting rusted");
        return this;
    }

    @Override
    public Builder Printing() {
        System.out.println("Polishing can be done to reastore a coincoin");
        return this;
    }

    @Override
    public Coin build() {
        Coin s=new Coin();
        System.out.println("Coins are casted with metal!");
        return s;
    }
}


