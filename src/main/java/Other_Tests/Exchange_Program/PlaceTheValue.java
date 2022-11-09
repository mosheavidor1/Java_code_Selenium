package Other_Tests.Exchange_Program;

public class PlaceTheValue implements  Messages {

    double coin_value;
    Dollar D = new Dollar();
    Shekel IL = new Shekel();


    public void setCoin_value(double coin_value) {
        this.coin_value = coin_value;

    }

    public double getCoin_Dollar(){
        D.USD=coin_value;

        return D.Exchange();

    }

    public double getCoin_ILS(){

        IL.ILS=coin_value;
        return IL.Exchange();
    }


}