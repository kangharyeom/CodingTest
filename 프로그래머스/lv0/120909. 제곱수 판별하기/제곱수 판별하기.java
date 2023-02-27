class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // Math.sqrt()이 제곱근을 구하는 변수임
        Double sqrt = Math.sqrt(n);
        
        if(sqrt == sqrt.intValue()) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}