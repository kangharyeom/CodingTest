class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2==1){
            for(int i=1; i<=n; i=i+2){
                answer+=i;
            }
        }
        else{
            answer =0;
            for(int j=2; j<=n; j=j+2){
                answer+= (j*j);
            }
        }
        return answer;
    }
}