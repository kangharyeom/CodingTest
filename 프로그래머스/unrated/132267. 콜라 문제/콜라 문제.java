class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            if (a>n){
                break;
            }
            // 1/2 * 20 = 10 
            answer += (n/a)*b;
            
            //나머지 = r
            int r = n%a;
            
            //  1/2 * 20 = 10+r
            n = (n/a)*b+r;
            
        }
        
        return answer;
    }
}