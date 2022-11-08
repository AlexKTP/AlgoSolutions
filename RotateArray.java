class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<2){
            System.out.println(Arrays.toString(nums));
        } else{
            k = k>nums.length ? k%nums.length : k;
            int[] tail = Arrays.copyOfRange(nums, nums.length-k, nums.length);
            int[] head = Arrays.copyOfRange(nums, 0, nums.length-k);
            int t = tail.length;          
            int h = head.length;   
            int[] res = new int[tail.length + head.length];  
            System.arraycopy(tail, 0, nums, 0, t);  
            System.arraycopy(head, 0, nums, t, h);
            System.out.println(Arrays.toString(res)); 
        }
        
    }
}