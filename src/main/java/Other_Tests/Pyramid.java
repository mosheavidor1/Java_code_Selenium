package Other_Tests;

public class Pyramid {
    public static void main(String[] args) {


        int x = 11;

        for (int i = 1; i <x; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
