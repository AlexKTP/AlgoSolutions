class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        if(s.length()<2) return s.length();

        String test = "";

        int max = -1;

       
        for (char c : s.toCharArray()) {
            String current = String.valueOf(c);

            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + current;
            max = Math.max(test.length(), max);
        }

        return max;
    }
}