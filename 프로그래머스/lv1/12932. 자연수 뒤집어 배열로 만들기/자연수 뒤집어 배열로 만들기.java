import java.util.*;

class Solution {
    public ArrayList<Integer> solution(long n) {
    ArrayList<Integer> answer = new ArrayList<>();
        while (0<n){
            answer.add((int)(n%10));
            n/=10;
        }
        return answer;
    }
}
                      