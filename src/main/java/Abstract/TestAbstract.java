package Abstract;

import java.util.Scanner;

public class TestAbstract {
public int Testing(){

        Scanner sc= new Scanner(System.in);
        System.out.println(SumConst.message);
        int x= sc.nextInt();
        int y=sc.nextInt();

        A numbers = new C(x,y);

        numbers.run();

        System.out.println(numbers.print());

        return numbers.print();
        }
        }
