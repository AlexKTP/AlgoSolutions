class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int currentRows = 0;


        List<Integer> list =  new ArrayList();
        List<List<Integer>> result = new ArrayList();

        if(currentRows == 0) {
            list.add(1);
            result.add(list);
        }
        
    
        currentRows++;
        list = new ArrayList<>();
        if(currentRows == 1 && numRows > 1) {
            list.add(1);
            list.add(1);
            result.add(list);
        }
        list = new ArrayList<>();

        currentRows++;
        
        if(numRows <3) return result;

        while(currentRows < numRows){

            for(int i = 0; i< result.get(currentRows-1).size(); i++){
                if(i == 0) list.add(result.get(currentRows-1).get(i));
                else if(i<=result.get(currentRows-1).size()-1) list.add(result.get(currentRows-1).get(i-1) + result.get(currentRows-1).get(i));
            }
            list.add(1);
            result.add(list);
            currentRows++;
            list = new ArrayList<>();
        }
        return result;
        
    }
}