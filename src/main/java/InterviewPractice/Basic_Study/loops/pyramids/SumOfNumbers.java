package InterviewPractice.Basic_Study.loops.pyramids;

public class SumOfNumbers {

    public static void main(String[] args) {
int size=6;
int x=1;
int num=0;
int firstNumber;
int secondNumber;
int sum=0;
System.out.println(x);
num++;

for(int i=3;i<=size;i++){

    for(int j=2;j<=i;j++) {
        System.out.print(j+" ");
        {

            firstNumber = j - num;
            secondNumber = firstNumber + 1;
            sum = firstNumber + secondNumber;


        }



    }
    System.out.println();
    i=sum;

    System.out.print(sum+" ");
    sum=sum+num;


    }


}

    }






//1
//2 3
//5 6 7
//11 12 13 14
//23 24 25 26 27
