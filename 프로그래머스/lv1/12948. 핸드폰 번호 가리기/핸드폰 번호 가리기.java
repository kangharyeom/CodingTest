class Solution {
    public String solution(String phone_number) {
        //*과 뒤에 숫자4개를 따로따로 구하고 서로 합치기로함
        
        //*을 받을 문자열 선언
        String a = "";
        
        //번호 개수-4 만큼 *을 a에 대입
        for (int i=0; i<phone_number.length()-4; i++){
            a+= "*";
        }
        
        //*를 출력하고 번호-4만큼 더해줌 
        return a+phone_number.substring(phone_number.length()-4);
    }
}