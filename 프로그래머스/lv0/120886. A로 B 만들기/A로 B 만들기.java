import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] a = after.toCharArray();
        char[] b = before.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        String as = new String(a);
        String bs = new String(b);
        
        if(as.equals(bs)){
            return 1;
        } else {
            return 0;
        }
    }
}