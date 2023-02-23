import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int i=0; i<=n; i++){
            if(i%2==1){
                intArr.add(i);
            }
        }
        int[] answer = new int[intArr.size()];
        for (int j = 0 ; j < intArr.size() ; j++) {
        answer[j] = intArr.get(j).intValue();
        }
        
        return answer;
    }
}