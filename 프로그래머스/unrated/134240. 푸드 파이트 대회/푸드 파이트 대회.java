class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        // 1번부터 시작 
        for(int i=1; i<food.length; i++){
            for (int j=0; j<food[i]/2; j++){
                answer += Integer.toString(i);
            }
        }
        
        answer += "0";
        
        for (int k=answer.length()-2; k>=0; k--){
            answer += answer.charAt(k);
        }
        
        return answer;
    }
}