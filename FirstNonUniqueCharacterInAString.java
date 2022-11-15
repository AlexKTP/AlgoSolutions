class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length()==1) return 0;
        
         char[] arr = s.toCharArray();
        boolean[] b = new boolean[arr.length];
        HashMap<Character, Integer> map = new HashMap<>();

        int result = -1;
        if(s.length() >1) {
            for(int i = 0; i<arr.length; i++){
                Character c = arr[i];
                if(map.get(c)==null) {
                    map.put(c, i);
                }
                else {
                    b[map.get(c)] = true;
                    b[i] = true;
                }
            }


        }

        for(int i = 0; i<b.length; i++){
            if(!b[i]) {
                result = i;
                break;
            }
        }
        return result;
        
    }
}