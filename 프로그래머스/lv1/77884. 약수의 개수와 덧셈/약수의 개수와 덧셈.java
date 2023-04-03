class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<right+1; i++){
            int sum = 0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    sum+=1;    
                }                
            }
            if(sum%2==0){answer-=i;} 
            else if(sum%2!=0) {answer+=i;}
        }
        return answer;
    }
}