package Currency_Exchange_Project;

public class Action extends Scanner_Actions implements Messages {
    PlaceTheValue P = new PlaceTheValue();

    @Override
    public void Scan_Message() {

        do {
            System.out.println(Welcome_message);

            int Choose_USD = 1;
            int Choose_ILS = 2;

            if (Choose_USD == sc.nextInt()) {
                System.out.println(Choose_USD_message);

                P.setCoin_value(sc.nextDouble());
                System.out.println(Dollar_Rate_Message + " " + P.getCoin_Dollar());


            } else if (Choose_ILS == sc.nextInt()) {
                System.out.println(Choose_ILS_message);
                P.setCoin_value(sc.nextDouble());
                System.out.println(ILS_Rate_Message + " " + P.getCoin_ILS());


            } else {
                System.out.println(Value_Not_valid);

            }

            System.out.println(DO_You_Wish_TO_Continue);


            sc.nextLine();


        }
        while (sc.nextLine().equals("yes"));


        while (sc.nextLine().equals("no")) {


            System.out.println("Thank you for your time ");
            break;


        }

    }
}




