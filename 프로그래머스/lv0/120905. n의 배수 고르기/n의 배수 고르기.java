import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                arr.add(numlist[i]);
            }
        }
        int[] answer = arr.stream().mapToInt(i->i).toArray();
        return answer;
    }
}