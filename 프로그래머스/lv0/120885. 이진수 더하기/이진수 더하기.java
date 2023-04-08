class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        if(bin1.equals("0") && bin2.equals(bin1)){
            answer = "0";
            return answer;
        }
        int a = Integer.parseInt(bin1,2);
        int b = Integer.parseInt(bin2,2);
        int c = a+b;
        
        while(c > 0){
            answer = String.valueOf(c % 2) + answer;
            c /= 2;
        };
        return answer;
    }
}