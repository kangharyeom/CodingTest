import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] strArr = my_string.toCharArray();
        
        Arrays.sort(strArr);
        
        answer = String.valueOf(strArr);
        return answer;
    }
}