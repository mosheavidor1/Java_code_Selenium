package InterviewPractice.Basic_Study;

public class CountLettersWithFunction {
    public static void main(String[] args) {

        String name = "Moshe Avidor";
        char[] text = name.toCharArray();
        System.out.println(GetLetters(text));

    }

    private static String GetLetters(char[] letters) {

        String sum = "";
        for (int i = 0; i < letters.length; i++) {

            while (i < letters.length && letters[i] != ' ') {
                sum = sum + letters[i];
                i++;
            }
            if (sum.length() > 0) {
                System.out.println(sum + "=" + sum.length());
                sum = "";

            }
        }
        return sum;

    }
}