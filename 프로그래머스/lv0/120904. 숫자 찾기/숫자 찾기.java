class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String str = Integer.toString(num);
        String[] strArr = str.split("");
        
        for(int i=0; i<strArr.length; i++){
            if(k==Integer.parseInt(strArr[i])){
                answer = i+1; 
                break;
            }
        } 
        
        return answer;
    }
}