class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        //문자열을 문자 배열로 형변환
        char[] charArray = my_string.toCharArray();
        //charArray 길이만큼 반복
        for(int i=0; i<charArray.length; i++){
            // n만큼 해당 인덱스 반복
            for(int j=0; j<n;j++){
                answer += charArray[i];
            }
        }
        return answer;
    }
}