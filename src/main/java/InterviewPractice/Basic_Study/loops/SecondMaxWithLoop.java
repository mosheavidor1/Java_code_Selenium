package InterviewPractice.Basic_Study.loops;

public class SecondMaxWithLoop {


    public static void main(String[] args) {

        int arr[] = {98, 48, 900, 130, 100, 7};
        System.out.println(getSecondMax(arr));



    }

    private static int getSecondMax(int numbers[]){

        int Second;

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){

                    Second=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=Second;
                }
            }
        }
        return (numbers[numbers.length-2]);
    }

}


