class Solution {
    public void moveZeroes(int[] nums) {
        
        
        int size = nums.length;
        int indexToReplace = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                int temp = nums[indexToReplace];
                nums[indexToReplace] = nums[i];
                nums[i] = temp;
                indexToReplace++;
            }
        }
        
    }
 
   
}
 