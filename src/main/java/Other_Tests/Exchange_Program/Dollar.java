package Other_Tests.Exchange_Program;



public class Dollar extends Coins {


    double USD;
    double value;

    @Override
    public double Exchange() {

      value=USD*Rate_Value;

        return value;
    }
}
