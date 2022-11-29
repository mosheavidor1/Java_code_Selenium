package Currency_Exchange_Project;

public class Shekel extends Coins {


    double ILS;
    double value;


    @Override
    public double Exchange() {

        value = ILS / Rate_Value;


        return value;
    }
}
