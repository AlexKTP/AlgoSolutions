class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i< nums1.length; i++){
            for (int j = 0; j< nums2.length; j++){
                if(nums1[i] == nums2[j] && (map.isEmpty() || map.get(j) == null || map.get(j) != nums2[j])){
                    map.put(j, nums2[j]);
                    break;
                }
            }
        }
        
        int[] res = new int[map.size()];
              for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res[count] = entry.getValue();
            count++;
        }
        
        return res;
    }
}