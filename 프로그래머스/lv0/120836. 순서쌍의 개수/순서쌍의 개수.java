import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>(); 
        
        //반복문을 돌며 n%i==0인 수를 배열에 넣어준다.
        for(int i=1; i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        answer = arr.size();
        
        return answer;
    }
}