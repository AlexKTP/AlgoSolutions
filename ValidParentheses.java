class Solution {
    public boolean isValid(String s) {
    if(s.length()%2 != 0) return false;
     Deque<Character> open = new LinkedList<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                open.add(c);
            } else {
                if(open.size()>0){
                    switch (open.getLast()){
                        case '(':
                            if(c != ')') return false;
                            break;
                        case '{':
                            if(c != '}') return false ;
                            break;
                        case '[':
                            if(c != ']') return false;
                            break;
                    }
                } else {
                    return false;
                }
                open.removeLast();
            }
        }
        return open.isEmpty();
    }
}