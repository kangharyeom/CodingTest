import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // SrringBuilder 활용 append로 붙이면 됨
        StringBuilder sb = new StringBuilder();

        // 정렬할 리스트 선언
        ArrayList<Integer> list = new ArrayList<>();

        // N만큼 넣어줄 수 입력
        for(int i=0; i<N; i++){
            list.add(scan.nextInt());
        }

        // 리스트 정렬
        Collections.sort(list);

        // 출력할 값 append
        for (Integer a : list){
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}