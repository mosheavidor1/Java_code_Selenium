package Other_Tests;

public class Palindrome {

    public static void main(String[] args) {

        String name = "dood";
        if (get_pal(name)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not");
        }


    }

    public static boolean get_pal(String word) {


        int i = 0;
        int j = word.length()-1;

        while (i <= j) {
            if (word.charAt(i) != word.charAt(j)) {
                i++;
                j--;
                return false;

            }
return true;
        }
      return get_pal(word);
    }
}

//palindrome
