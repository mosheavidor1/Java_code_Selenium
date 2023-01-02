package InterviewPractice.Basic_Study.loops.pyramidSecondWay;

public class Pyramid {
int size;
int sumOfValues;



    private int sumOfValues(int size) {
        this.size=size;


//Definition of parameters;
        int  one = 1, k = 2, r = -1, s = -2, firstPlace, secondPlace;

        System.out.println(one);

        for (int i = 3; i < size; i++) {

            for (int j = 2; j <= i; j++, k++) {
                System.out.print(k + " ");
            }
//After the first print of 2 and 3  first line place (k=2) and second line place (k=3) will be added together to be 5 (first+second);
            System.out.println();
            firstPlace = k + s;
            secondPlace = k + r;
            k = firstPlace + secondPlace;
            --r;
            --s;
// r and s will be decremented after every cycle of i;


        }
        return k;
    }
//constructor of the class will be the one that will define the actual size of the function.
    Pyramid(int size){
        this.size=size;
        sumOfValues(size);

    }
//Because it is a private function we need to use GETTER method .
    public int getSumOfValues() {
        return sumOfValues;
    }
}