package InterviewPractice.Basic_Study;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {15, 16, 7, 2};
        System.out.println(SumOfTwo(nums,9));



    }


    public static int SumOfTwo(int[] numbers, int t) {
        int target;
        target = t;
        int first;
        int second;

        for (int i = 0; i < numbers.length; i++) {

            first = numbers[i];

            try {


                second = numbers[i + 1];
                if (target == first + second) {
                    System.out.println(first + " " + second);
                }
                System.out.println();
            } catch (ArrayIndexOutOfBoundsException e) {

            }


        }
        return target;
    }
}





//
//We need to put target number and code checks if there are any numbers of the array that creates the sum of this number;
//For example if target is 9 , than code will look at the array and see if there are any numbers that sum of two of them creates 9 ;
////From - https://leetcode.com/problems/two-sum/
//
////Input: nums = [2,7,11,15], target = 9
////Output: [0,1]
////Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
