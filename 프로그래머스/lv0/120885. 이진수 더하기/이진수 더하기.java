class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        if(bin1.equals("0") && bin2.equals(bin1)){
            answer = "0";
            return answer;
        }
        int a = Integer.parseInt(bin1,2)+ Integer.parseInt(bin2,2);       
        
        while(a > 0){
            answer = String.valueOf(a % 2) + answer;
            a /= 2;
        };
        return answer;
    }
}