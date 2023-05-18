import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> set = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                }
                set.add(i);
            }
        }
        Collections.sort(set);
        return set;
    }
}