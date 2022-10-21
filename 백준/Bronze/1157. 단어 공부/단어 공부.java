import java.util.*;

public class Main {
    public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            int apb[] = new int[26]; // A~Z까지
    
            String str = input.next(); // 단어 입력
            str = str.toUpperCase(); // 대문자로 통일
    
            // 인덱스 값 1씩 증가
            for (int i = 0; i < str.length(); i++) {
                apb[str.charAt(i) - 'A']++;
            }
    
            int max = 0;
            int answer = 0;
            for (int i = 0; i < apb.length; i++) {
                if (max < apb[i]){
                    max = apb[i];
                answer = i;
            }
                else if (max == apb[i]) {
                answer = -2;
            }
        }
        System.out.printf("%s",Character.toString(answer+'A'));
    }
}