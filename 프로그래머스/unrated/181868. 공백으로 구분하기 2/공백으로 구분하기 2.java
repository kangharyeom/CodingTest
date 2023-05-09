import java.util.*;
class Solution {
    public ArrayList<String> solution(String my_string) {
        String[] answer = {};
        ArrayList<String> strArr= new ArrayList<>();
        answer = my_string.split(" ");
        
        for(int i=0; i<answer.length; i++){
            if(!answer[i].equals("")){
                strArr.add(answer[i]);
            }
        }
        
        return strArr;
    }
}