package ca.cricri.problems;

import java.util.Arrays;

public class TwoSums2 {

    /**
     * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">lien</a>
     *
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];

        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            }

            if(numbers[i] + numbers[j] < target){
                i++;
            }

            if(numbers[i] + numbers[j] > target) {
                j--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSums2 twoSums2 = new TwoSums2();
        System.out.println(Arrays.toString(twoSums2.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
