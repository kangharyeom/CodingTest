class Solution {
    public String solution(String s) {
        String answer = "";
        //문자를 담을 베열 선언 / 띄어쓰기를 할 때마다 나눠줌
        String[] str = s.split("");


        //index의 여부에 따라 짝수, 홀수를 나눔
        int index = 0;
        for (int i=0; i<str.length; i++){
            //빈 배열일 경우
            if(str[i].equals(" ")){
                index = 0;

            // 짝수일 경우 대문자
            } else if (index %2 == 0) {
                str[i] = str[i].toUpperCase();
                index++;
            } else if (index %2 != 0 ) {
                str[i] = str[i].toLowerCase();
                index++;
            }
            answer += str[i];
        }
        return answer;
    }
}