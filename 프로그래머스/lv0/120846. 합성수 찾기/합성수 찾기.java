class Solution {
    public int solution(int n) {
        // 완성하고 싶은 로직 = 합성수의 개수 = n까지의 수 - 소수 -1(1은 소수도 아니고 합성수도 아님)
        
        // 합성수의 개수 = answer
        int answer = 0;
        
        // 소수의 개수
        int countN = 0;
        
        //소수를 먼저 구함
        for(int i=2; i<=n; i++){
            boolean a = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    a = false;
                    break;
                }
            }
            if(a==true){
                countN++;
            }
        }
        
        if(n>2){
            answer =  n-countN-1;
        }
        
        return answer;
    }
}