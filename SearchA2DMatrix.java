class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowLength = 0;
        int columLength = matrix.length;

        for(int i = 0; i<columLength; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(i+1<=columLength-1 && matrix[i+1][j]<= target){
                    break;
                }
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}