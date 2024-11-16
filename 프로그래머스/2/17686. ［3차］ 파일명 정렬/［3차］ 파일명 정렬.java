import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        // Arrays.sort를 사용하여 정렬
        Arrays.sort(files, (file1, file2) -> {
            // 파일명을 HEAD, NUMBER, TAIL로 분리
            String[] parsed1 = parseFile(file1);
            String[] parsed2 = parseFile(file2);

            // HEAD 비교 (대소문자 무시)
            int headCompare = parsed1[0].compareToIgnoreCase(parsed2[0]);
            if (headCompare != 0) {
                return headCompare;
            }

            // NUMBER 비교 (숫자 크기로 비교)
            int num1 = Integer.parseInt(parsed1[1]);
            int num2 = Integer.parseInt(parsed2[1]);
            if (num1 != num2) {
                return Integer.compare(num1, num2);
            }

            // HEAD와 NUMBER가 같으면 원래 순서 유지
            return 0;
        });

        return files; // 정렬된 배열 반환
    }

    // 파일명을 HEAD, NUMBER, TAIL로 분리하는 함수
    private String[] parseFile(String file) {
        Pattern pattern = Pattern.compile("([a-zA-Z-. ]+)(\\d{1,5})(.*)");
        Matcher matcher = pattern.matcher(file);

        if (matcher.matches()) {
            String head = matcher.group(1);  // HEAD
            String number = matcher.group(2); // NUMBER
            String tail = matcher.group(3);  // TAIL (사용하지 않음)
            return new String[] { head, number, tail };
        }
        return new String[] { "", "0", "" }; // 비정상 입력 처리
    }
}
