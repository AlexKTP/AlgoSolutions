class Solution {
    public String reverseWords(String s) {
        
        
        if (s.length()<2) return s;
        
        StringBuilder result = new StringBuilder();
        String[] split = s.split(" ");
        
        for(String sp : split){
            StringBuilder sb = new StringBuilder();
            result.append(sb.append(sp).reverse().append(" ").toString());
        }
        
        return result.toString().substring(0, result.length()-1);
        
    }
}