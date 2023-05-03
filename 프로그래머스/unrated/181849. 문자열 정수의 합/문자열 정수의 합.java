class Solution {
    public int solution(String num_str) { 
        String[] strArr = num_str.split(""); 
        int sum = 0;
        
        for(int i=0; i<num_str.length(); i++){
            sum += Integer.parseInt(strArr[i]);
        }
        
        return sum;
    }
}