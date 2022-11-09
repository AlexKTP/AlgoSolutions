class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        
        while(true){
            if(numbers[i]+numbers[j]==target){
                result[0]=i+1;
                result[1]=j+1;
                break;
            }
            else if(numbers[i]+numbers[j]>target)
                j--;
            else
                i++;
        }
        
        return result;
        
    }
}