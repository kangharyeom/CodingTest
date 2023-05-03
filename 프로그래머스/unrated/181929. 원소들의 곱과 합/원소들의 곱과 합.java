class Solution {
    public int solution(int[] num_list) {
        int times = 1;
        int square = 0;
        
        for(int i=0; i<num_list.length; i++){
            times *= num_list[i];
            square +=num_list[i];    
        }
        
        if(times<(square*square)){
            return 1;
        } else if(times>(square*square)){
            return 0;
        } 
        
        return 0;
    }
}