class Solution {
    public String solution(String s, int n) {
        String answer = "";
        //s를 char 배열에 담는다.
        char[] ch = s.toCharArray();
        
        //아스키 코드를 활용
        for(char num:ch){
            //공백 출력
            if(num==32) answer +=" ";
            else{
                //대문자일 경우
                if(num<=90){
                    num+=n;
                    if(num>90) num -=26;
                } else {
                    //소문자일 경우
                    num+= n;
                    if(num>122) num-=26;
                }
               answer+= num;
            }    
        }
        return answer;
    }
}