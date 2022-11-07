/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
   public int firstBadVersion(int n) {
       if(n>0){
           return find(n,1,n); 
       } else {
           return 0;
       }
    
    }


public int find(int n, int floor, int ceil) {
    
if(floor>=ceil) {
        return floor;
    }
    
    int middle = floor+(ceil-floor)/2;
    
    if(isBadVersion(middle)) {
        return find(n,floor,middle);
    } else {
        middle++;
        return find(n,middle,ceil);
    }
}
}