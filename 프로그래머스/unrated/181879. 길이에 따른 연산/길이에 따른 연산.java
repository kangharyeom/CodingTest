class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if (num_list.length < 11){
            answer = num_list[0];
            for(int i=1; i<num_list.length; i++){
                answer *= num_list[i];  
            }
        } else {
            for(int j=0; j<num_list.length; j++){
                answer += num_list[j];  
            }
        }
        
        return answer;
    }
}