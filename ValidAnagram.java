class Solution {
    public boolean isAnagram(String s, String t) {
        
         boolean result= true;
        
        if(s.length() != t.length()) return false;
        else {
            char[] first = s.toCharArray();
            char[] second = t.toCharArray();
            Arrays.sort(first);
            Arrays.sort(second);
            for(int i = 0; i<first.length; i++){
                if(second[i]!= first[i]) return false;
                
            }
        }

        return true;
    }
}