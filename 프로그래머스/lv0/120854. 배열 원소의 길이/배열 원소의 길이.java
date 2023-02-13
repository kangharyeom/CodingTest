class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        // atrlist의 길이만큼 반복문을 돌며 인덱스 길이만큼 int[]에 더해줌
        for(int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}