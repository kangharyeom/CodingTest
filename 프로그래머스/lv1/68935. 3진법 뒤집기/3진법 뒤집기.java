import java.util.*;
class Solution {
    public int solution(int n) {
        String a = "";

        while(n>0){
            // a += Integer.toString(n%3);
            a += (n%3);
            n /=3;
        }
        return Integer.parseInt(a, 3);
    }
}