package ca.cricri.problems;

import java.util.*;

public class ThreeSums {

    /**
     *
     * @param nums
     * @return List of List 3Tuple sum results
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> myResult = new HashSet<>();

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        //fill map
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++) {
                int tmp = - nums[i] - nums[j];
                if(map.containsKey(tmp) && map.get(tmp) > j){
                    myResult.add(List.of(new Integer[]{nums[i], nums[j], tmp}));
                }
            }
        }
        return new ArrayList<>(myResult);
    }
}
