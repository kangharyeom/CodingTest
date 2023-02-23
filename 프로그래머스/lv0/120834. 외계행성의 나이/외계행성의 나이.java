import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        //int 배열 선언
        int[] arrNum = Arrays.asList(String.valueOf(age).split("")).stream().mapToInt(Integer::parseInt).toArray();
        
        //인덱스 0-9
        String[] strArr = {"a","b","c","d","e","f","g","h","i","j"};
        
        //int 배열의 숫자가 String 배열의 인덱스가 됨
        for(int i=0; i<arrNum.length; i++){
            answer += strArr[arrNum[i]];
        }
        
        
        
        return answer;
    }
}