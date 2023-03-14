class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n%6==0){
            answer = n/6;
        } else if (n%2==0 && n%6!=0){
            answer = (6*(n/2))/6;
        } else if (n%3==0 && n%6!=0){
            answer = (6*(n/3))/6;
        } else {
            answer = (6*n)/6;
        }        
        return answer;
    }
}