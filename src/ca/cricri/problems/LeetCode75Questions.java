package ca.cricri.problems;

import java.util.*;
import java.util.stream.Stream;

/**
 * TODO = <a href="https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions">link</a>
 * TODO = <a href="https://www.techinterviewhandbook.org/coding-interview-study-plan/">link</a>
 *
 * Aisance : nulle / faible / moyen / fort / maitrise
 * Theme : Tableau, Table Hachage, Programmation Dynamique, Tri
 */
public class LeetCode75Questions {

    /**
     * 1st problem
     * <a href="https://leetcode.com/problems/two-sum/">link</a>
     * Aisance : moyen
     * Algorithme :
     *  - parcourir le tableau
     *      - sauvegarder la clé (target - valeur courante), valeur : position du tableau dans une Map
     *      - si valeur courante est trouver comme clé dans Map
     *      - retourner position courante et valeur de clé dans Map (position)
     * Theme : Tableau, Table Hachage
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
     * Aisance : nulle
     * Algorithme :
     *  - parcours le tableau de stock
     *      - pointer le minimum
     *      - si valeur courant moins le minimum est plus grand que le resultat
     *      - mettre a jour le resultat
     * - fin de la boucle, retourner le resultat
     * Theme : Tableau, Programmation Dynamique
     */
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int res = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            }
            int operation = prices[i] - minValue;
            if(operation > res) {
                res = operation;
            }
        }
            return res;
    }

    /**
     * 3rd
     * <a href="https://leetcode.com/problems/contains-duplicate/">link</a>
     * Aisance : fort
     * Algorithme :
     *      - utiliser HashSet
     *
     * Theme : Tableau, Table Hachage, Tri
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> noDuplicateSet = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(noDuplicateSet.contains(nums[i])) {
                return true;
            } else {
              noDuplicateSet.add(nums[i]);
            }
        }
        return false;
    }

    /**
     * 4th
     * <a href="https://leetcode.com/problems/product-of-array-except-self/">lien</a>
     * Aisance : faible
     * Algorithme :
     *  - on parcour l'input pour calculer les prefix du tableau qu'on store dans resultat
     *  - on parcour l'input à l'envers pour calculer les suffix
     * Theme : Tableau, Prefix Sum
     */
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i-1] * res[i-1];
        }

        for (int i = nums.length-1; i >= 0; i--) {
            if(i == nums.length - 1) {
                continue;
            }
            res[i] = res[i] * nums[i+1];
            nums[i] *= nums[i+1];
        }

        return res;
    }

    /**
     * 5th
     * <a href="https://leetcode.com/problems/maximum-subarray/">lien</a>
     * Aisance: nulle
     * Algorithme :
     *
     * Theme : Tableau, Diviser pour régner, Dynamic Programming
     */
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int current = 0;
        for (int num : nums) {
            if (current < 0) {
                current = 0;
            }

            current += num;
            max = Math.max(max, current);
        }

        return max;
    }

    /**
     * 6th
     * <a href="https://leetcode.com/problems/maximum-product-subarray/">lien</a>
     * Aisance: Nulle
     * Algorithme :
     *
     * Theme : Tableau, Programmation Dynamique
     */
    public int maxProduct(int [] nums) {
        int res = Arrays.stream(nums).max().orElse(0);
        int min = 1;
        int max = 1;

        for (int n : nums) {
//            if(n == 0) {
//                min = 1;
//                max = 1;
//                continue;
//            }
            int tmp = n * max;
            max = Math.max(Math.max(tmp, n * min), n);
            min = Math.min(Math.min(tmp, n * min), n);

            res = Math.max(res, max);
        }
        return res;
    }

    /**
     * 7th
     * <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/">lien</a>
     * Aisance : Nulle
     * Algorithme :
     *
     * Theme : Tableau, Recherche Binaire
     */
    public int findMin(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        LeetCode75Questions leetCode75Questions = new LeetCode75Questions();
        leetCode75Questions.productExceptSelf(new int[]{1, 2, 3, 4});
    }
}
