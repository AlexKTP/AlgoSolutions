class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = 0;
        if(nums.length<1) return sum;
        else if(nums.length<2) return nums[0];
        else {
            max = nums[0];
            for(int i = 0; i<nums.length; i++){
                if(nums[i]>max) {
                    max = nums[i];
                } 
                sum = sum+nums[i] >0 ? (sum+nums[i]) : 0;
                if(sum > max && max >=0) max = sum;
            }
        }
        return max;
    }
}