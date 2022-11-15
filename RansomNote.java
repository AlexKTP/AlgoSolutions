class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        
        List<Character> split = magazine.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        for(char c : ransomNote.toCharArray()){
            int index = split.indexOf(c);
            if(index<0) return false;
            else split.remove(index);
        }


        return true;
        
    }
}