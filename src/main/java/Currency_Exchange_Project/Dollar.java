package Currency_Exchange_Project;


public class Dollar extends Coins {


    double USD;
    double value;

    @Override
    public double Exchange() {

        value = USD * Rate_Value;

        return value;
    }
}
