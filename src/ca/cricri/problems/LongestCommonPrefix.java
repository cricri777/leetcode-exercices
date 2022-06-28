package ca.cricri.problems;

public class LongestCommonPrefix {

    /**
     *
     * @param strs array of string to search for longest prefix
     * @return longest prefix or ""
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<strs[0].length(); i++){
            for(String str : strs) {
                if(i == str.length() || str.charAt(i) != strs[0].charAt(i)){
                    return res.toString();
                }
            }
            res.append(strs[0].charAt(i));
        }

        return res.toString();
    }


    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
