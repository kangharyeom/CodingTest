import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        //배열 정렬
        Arrays.sort(sides);
        
        //[0] * [1] = [2]
        if ((sides[0]+sides[1]) <= sides[2]){ return answer = 2;} 
        
        else {return answer = 1;}
    }
}