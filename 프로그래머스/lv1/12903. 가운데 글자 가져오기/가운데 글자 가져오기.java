class Solution {
    public String solution(String s) {
        String answer = "";
      
        if(s.length()%2!=0){
           return String.valueOf(s.charAt(s.length()/2));
        }
        
        if(s.length()%2==0){
            for (int i=s.length()/2-1; i<s.length()/2+1; i++){
             answer += s.charAt(i);
            }
        }
        return answer;
    }
}