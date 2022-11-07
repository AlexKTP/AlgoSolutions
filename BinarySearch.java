class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums == null || nums[0]>target ||nums[nums.length-1]<target){
            return -1;
        }
        return binary_Search(nums, 0, nums.length, target);
    }
    
    private int binary_Search(int intArray[], int low, int high, int key){

        if (high>=low){  
            int mid = low + (high - low)/2;     
            if (mid <= high && intArray[mid] == key){  
            return mid;  
            }  
            if (intArray[mid] > key){  
            return binary_Search(intArray, low, mid-1, key);
            }
            else {
            if(mid+1>high){
                return -1;
            } 
            else return binary_Search(intArray, mid+1, high, key);
            }  
        }  
        return -1;  
    }
}