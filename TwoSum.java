class Solution {
    public int[] twoSum(int[] nums, int target) {
                
        int[] result = new int[2];

        int i=0; 
        int j=nums.length-1;
        
         while(true){
            if(nums[i]+nums[j]==target){
                result[0]=i;
                result[1]=j;
                break;
            }
            else j--;
            if (i==j || j==0) {
                i++;
                j = nums.length-1;
            }
        }
        
        return result;
        
    }
}