class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(image[sr][sc] == color) return image;
        explore(sr, sc, color, image, image[sr][sc]);
        return image;
    }

    private void explore(int sr, int sc, int color, int[][] arr, int pixel){
        if(sr>arr.length-1 || sr<0||sc>arr[0].length-1||sc<0) return;
        if(pixel != arr[sr][sc]){
            return;
        }
        else{
            arr[sr][sc] = color;
        }

        explore(sr -1, sc, color, arr, pixel);
        explore(sr+1, sc, color, arr, pixel);
        explore(sr, sc-1, color, arr, pixel);
        explore(sr, sc+1, color,arr, pixel);
    }
}