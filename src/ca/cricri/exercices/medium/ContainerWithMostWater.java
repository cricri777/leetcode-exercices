package ca.cricri.exercices.medium;

public class ContainerWithMostWater {
    /**
     * <a href="https://leetcode.com/problems/container-with-most-water/">link</a>
     */
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxAire = -1;

        while (left < right) {
            int currentAire = Math.min(height[left], height[right]) * (right - left);

            if(currentAire > maxAire) {
                maxAire = currentAire;
            }

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }

        }

        return maxAire;
    }
}


class ContainerWithMostWaterMain {
    public static void main(String[] args)
    {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] a = {1, 5, 4, 3};
        int[] b = {3, 1, 2, 4, 5};

        System.out.print( container.maxArea(a)+"\n" );

        System.out.print( container.maxArea(b) );
    }
}