class Solution {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(num -> Math.abs(num*num)).sorted().toArray();
    }
}