package ca.cricri.learn.array;

import java.util.Arrays;

public class DuplicateZero {
    /**
     * TODO
     * <a href="https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/">link</a>
     * @param arr fixed-length integer array
     */
    public void duplicateZeros(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
               shiftArrayFromPosition(i, arr);
               arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void shiftArrayFromPosition(int position, int[] shiftArray) {
        int[] results = new int[shiftArray.length + 1];
        for(int i=0; i < shiftArray.length; i++) {
            if(i < position) {
                results[i] = shiftArray[i];
            } else {
                results[i+1] = shiftArray[i];
            }
        }
        shiftArray = results;
    }


    public static void main(String[] args) {
        DuplicateZero duplicateZero = new DuplicateZero();
        duplicateZero.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}
