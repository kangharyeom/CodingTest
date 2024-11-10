class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int idx = -1;
            
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            // char이 숫자인 경우 score 배열에 값 주입 
            if (Character.isDigit(c)) {
                // 새로운 점수를 저장할 때마다 인덱스 증가
                idx++; 
                // 현재 점수가 10인 경우(현재 점수가 1이지만 다음 문자가 숫자면서 0인경우 == 10)
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    scores[idx] = 10;
                    // 다음 정수 건너뜀(10인경우로 0을 이미 체크함)
                    i++; 
                } else {
                    // 정수가 10이 아닌 다른 경우 charAt value 주입
                    scores[idx] = c - '0';
                }
            }
            // 보너스 점수
            else if (c == 'S') {
                scores[idx] = (int) Math.pow(scores[idx], 1);
            } else if (c == 'D') {
                scores[idx] = (int) Math.pow(scores[idx], 2);
            } else if (c == 'T') {
                scores[idx] = (int) Math.pow(scores[idx], 3);
            }
            
            // 옵션
            // 스타상
            else if (c == '*') {
                scores[idx] *= 2;
                // idx가 0보다 크면 이전 점수도 2배
                if (idx > 0) scores[idx - 1] *= 2; 
            // 아차상
            } else if (c == '#') {
                scores[idx] *= -1;
            }   
        }
        // 스코어 합계 
        for (int score : scores) {
            answer += score;
        }
        
        return answer;
    }
}