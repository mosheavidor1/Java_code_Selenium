package Other_Tests.Exchange_Program;

public class Shekel extends Coins {


    double ILS;
    double value;


    @Override
    public double Exchange() {

value=ILS/Rate_Value;


        return value;
    }
}
