class Solution {
    public int solution(int n) {
        long num = n; 
        int count = 0;
        
        while (num != 1) {
            // 짝수일 경우
            if (num % 2 == 0) {
                num /= 2;
                
            // 홀수일 경우 
            } else {
                num = num * 3 + 1;
            }
            count++;
            
            if (count > 500)
                return -1;
        }
        
        return count;
    }
}