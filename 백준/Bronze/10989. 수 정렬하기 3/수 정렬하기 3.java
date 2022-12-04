import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner scan = new Scanner(System.in);
        // int N = scan.nextInt();
        // SrringBuilder 활용 append로 붙이면 됨
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 정렬할 배열 선언
        int[] arr = new int[N];

        // N만큼 넣어줄 수 입력
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 리스트 정렬
        Arrays.sort(arr);

        // 출력할 값 append
        for (int i=0; i<N; i++ ){
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}