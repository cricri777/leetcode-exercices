package ca.cricri.exercices.learn;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array//">links</a>
 */
public class ArrayLesson {

    /**
     * Algorithme : parcourir array dans les 2 sens prendre la plus grande valeur absolue des 2 et continuer
     * à itérer.
     * <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/">link</a>
     */
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] results = new int[nums.length];
        int k = nums.length-1;
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                results[k] = Math.abs(nums[left] * nums[left]);
                left++;
            } else {
                results[k] = Math.abs(nums[right] * nums[right]);
                right--;
            }
            k--;
        }
        return results;
    }


    /**
     * TODO
     * <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/">links</a>
     */
    public void duplicateZeros(int[] arr) {

    }

    public static void main(String[] args) {
        ArrayLesson squaresOfSortedArray = new ArrayLesson();

        System.out.println(Arrays.toString(squaresOfSortedArray.sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}
