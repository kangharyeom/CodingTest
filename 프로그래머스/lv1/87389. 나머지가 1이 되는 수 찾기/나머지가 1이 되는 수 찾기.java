import java.util.*;

class Solution {
    public int solution(int n) {
            ArrayList<Integer> Arr =new ArrayList<>();

            for (int i=2; i<n; i++){
                if (n%i==1){
                    Arr.add(i);
                }
            }
        return Collections.min(Arr);
    }
}