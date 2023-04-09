class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long longP = Long.parseLong(p);
        
        for(int i=0; i<t.length()-p.length()+1; i++){
            Long longT = Long.parseLong(t.substring(i, i+p.length()));
            if(longT<=longP){
                answer++;
            }
        }  
        return answer;
    }
}