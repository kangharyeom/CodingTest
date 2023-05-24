import java.util.*;
class Solution {
    public ArrayList<String> solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}