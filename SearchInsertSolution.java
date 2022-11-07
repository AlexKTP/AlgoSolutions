class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(nums[nums.length-1]<target) return nums.length;
        if(nums.length<1) {
            return 0;
        }
        if(nums[0]>target) {
            return 0;
        }
        else {
            return runBinarySearchIteratively(nums, target, 0, nums.length);
        }
        
        
    }
    
    public int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        
    int middle = low  + ((high - low) / 2);
        System.out.print("high: "+high);
        System.out.print("low: "+ low);
        
    if (high < low) {
        return low;
    }

    if (key == sortedArray[middle]) {
        return middle;
    } else if (key < sortedArray[middle]) {
        return runBinarySearchIteratively(
          sortedArray, key, low, middle - 1);
    } else {
        return runBinarySearchIteratively(
          sortedArray, key, middle + 1, high);
    }
}
}