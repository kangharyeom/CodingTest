class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // sign이 참이면 +, 거짓이면 -
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]==true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}