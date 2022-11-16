package InterviewPractice.Basic_Study;

import java.util.Scanner;

public class PalindromeOtherWay {
    public static void main(String[] args) {
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a plaindrome word");
            String pal = sc.nextLine();


            if (GetPal(pal)) {
                System.out.println("This is a palindrome word");
            } else {
                System.out.println("This is not a palindrome word");
            }
            System.out.println(" Do you wish to continue");
            {

            }


            if (sc.nextLine().equals("yes")) ;


            else {
                sc.nextLine().equals("no");
                System.out.println("Thank you for playing ");
                break;

            }


        }

        while (true);
    }

    public static boolean GetPal(String name) {

        String original = "";
        original = name;

        String reverse = "";

        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

}


