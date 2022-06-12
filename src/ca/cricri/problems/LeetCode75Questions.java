package ca.cricri.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO = <a href="https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions">link</a>
 * TODO = <a href="https://www.techinterviewhandbook.org/coding-interview-study-plan/">link</a>
 */
public class LeetCode75Questions {

    /**
     * 1st problem
     * <a href="https://leetcode.com/problems/two-sum/">link</a>
     * Status : first time coded
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    /**
     * 2nd
     * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">link</a>
     * Status : TODO
     */
    public int maxProfit(int[] prices) {
        return 0;
    }
}
