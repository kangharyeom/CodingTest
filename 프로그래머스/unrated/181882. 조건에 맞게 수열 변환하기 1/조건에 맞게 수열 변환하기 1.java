import java.util.*;
class Solution {
    public  ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=50&&arr[i]%2==0){
                answer.add(arr[i]/2);
            } else if(arr[i]<50&&arr[i]%2==1){
                answer.add(arr[i]*2);
            } else {
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}