import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String upper = "";
        String lower = "";

        for(int i=0; i<my_string.length(); i++){
            if((int)my_string.charAt(i)-'0'>=49&&(int)my_string.charAt(i)-'0'<=74){
                upper = String.valueOf(my_string.charAt(i));
                answer += upper.toUpperCase();
            } else if((int)my_string.charAt(i)-'0'>=17&&(int)my_string.charAt(i)-'0'<=42){
                lower = String.valueOf(my_string.charAt(i));
                answer += lower.toLowerCase();
            }
        }
        return answer;
    }
}
