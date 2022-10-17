class Solution {
    public long[] solution(int x, int n) {
        //n의 개수만큼 배열길이
        long[] answer = new long[n];
        
        //x를 담을 변수 선언
        long sum = x;
        
        //인덱스에 x할당 및 x 만큼 커지도록함
        for(int i =0; i<answer.length; i++){
            answer[i]= sum;
            sum+=x;
        }
        return answer;
    }
}