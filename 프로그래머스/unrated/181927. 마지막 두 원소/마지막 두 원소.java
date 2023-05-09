import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<num_list.length; i++){
            answer.add(num_list[i]);    
        }
        int a = num_list[num_list.length-1];
        int b = num_list[num_list.length-2];
        if(a>b){
            answer.add(a-b);
        }
        
        else if (a<=b){
            answer.add(a*2);
        }
        
        
        return answer;
    }
}