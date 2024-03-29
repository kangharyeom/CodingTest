class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] num = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < num.length; i++){
            int a = Integer.parseInt(num[i]);
            min = Math.min(min, a);
            max = Math.max(max, a);
        }
        answer = min+ " " +max;
        
        return answer;
    }
}