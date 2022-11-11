class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        System.out.print(r);
        System.out.print(c);
        
        int[][] copy = new int[r][c];

        int colum = 0;
        int row = 0;
        int[] subArray = new int[c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int w = mat[i][j];
                if(colum< c){
                    subArray[colum] = w;
                    colum++;
                }
                
                if(row == r) return mat;
                if(colum== c){;
                    copy[row] = subArray;
                    colum =0;
                    row++;
                    subArray = new int[c];
                }
            }
        }
        
        if(row<r) return mat;
        
        return copy;
        
    }
}