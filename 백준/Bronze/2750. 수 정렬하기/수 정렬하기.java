import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		
        //학생수 N 선언
		int N = scan.nextInt();
		
        //N만큼 길이의 배열 선언
        int[] arr = new int[N];
		
        // 숫자를 입력 / 입력값은 배열에 담는다.
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
         
        //정렬
		Arrays.sort(arr);
		
        
		for(int num : arr) {
			System.out.println(num);
		}
 
	}
}