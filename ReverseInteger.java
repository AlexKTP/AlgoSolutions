class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        int result = 0;
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE) return 0;
        if (x<10 && x>-1) return x;
        if(x<0) isNeg = true;
        if(isNeg) x*=-1;
        try{
        String s = new StringBuilder().append(Integer.toString(x)).reverse().toString();
        result = Integer.parseInt(s);
        if (isNeg) result *=-1;
        } catch(NumberFormatException ex){
            System.err.print(ex.getMessage());
            result = 0;
        }
    

        return result;
    }
}