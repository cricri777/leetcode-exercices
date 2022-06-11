package ca.cricri.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class RomanToInteger {

    /**
     * <a href="https://leetcode.com/problems/roman-to-integer/">link</a>
     *
     * @param s roman number in string format
     * @return corresponding value in integer
     * Algorithm : sum each character integer value
     */
    public int romanToInt(String s) {
        Map<Character, Integer> mapRomanToIntegerValue = new HashMap<>();
        mapRomanToIntegerValue.put('I', 1);
        mapRomanToIntegerValue.put('V', 5);
        mapRomanToIntegerValue.put('X', 10);
        mapRomanToIntegerValue.put('L', 50);
        mapRomanToIntegerValue.put('C', 100);
        mapRomanToIntegerValue.put('D', 500);
        mapRomanToIntegerValue.put('M', 1000);

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = mapRomanToIntegerValue.get(s.charAt(i));
            result += prev > current ? -current : current;
            prev = current;
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
//        assert romanToInteger.romanToInt("III")  == 3 : "Mauvaise réponse";
//        assert romanToInteger.romanToInt("LVIII")  == 58 : "Mauvaise réponse";
//        assert romanToInteger.romanToInt("MCMXCIV")  == 1994 : "Mauvaise réponse";
    }
}