package ca.cricri.problems;

import java.util.HashMap;
import java.util.Map;

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
     * Aisance : nulle + TODO
     * Algorithme :
     *
     * Theme : Tableau, Table Hachage, Tri
     */
    public boolean containsDuplicate(int[] nums) {
        return false;
    }
    public static void main(String[] args) {
        LeetCode75Questions leetCode75Questions = new LeetCode75Questions();
        System.out.println(leetCode75Questions.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(leetCode75Questions.maxProfit(new int[] {2,1,4}));
    }
}
