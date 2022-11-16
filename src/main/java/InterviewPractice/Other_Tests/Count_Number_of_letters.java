package InterviewPractice.Other_Tests;

public class Count_Number_of_letters {

    public static void main(String[] args) {

        String text = "Hello world";
        String sum="";

        char[] word= text.toCharArray();





        for (int i = 0; i < word.length; i++) {


      while (i<word.length&&word[i]!=' '){
          sum=sum+word[i];
          i++;

            }
      if(sum.length()>0){
          System.out.println(sum+"="+sum.length());
      }
        }
    }
}



