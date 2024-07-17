class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s);
        String tailStr = my_string.substring(s+overwrite_string.length(),my_string.length());
        answer += overwrite_string+tailStr;
        return answer;
    }
}