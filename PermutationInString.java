class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        
  char[] s = s1.toCharArray();
        char[] sbis = s2.toCharArray();
        Arrays.sort(s);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            char[] sub = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(sub);
            if (Arrays.equals(s, sub)) {
                return true;
            }
        }


        return false;
        
    }
}