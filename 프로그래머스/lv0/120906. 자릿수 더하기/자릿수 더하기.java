class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i=0; i<=str.length(); i++){
            answer += n%10;
            n= n/10;
        }
        return answer;
    }
}