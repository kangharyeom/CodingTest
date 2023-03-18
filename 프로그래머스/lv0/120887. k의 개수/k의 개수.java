class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        
        
        for(int num = i; num<= j; num++){
            String str = Integer.toString(num);               
            for(int num2 = 0; num2<str.length(); num2++){
                if(Integer.toString(k).equals(str.substring(num2,num2+1))){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}