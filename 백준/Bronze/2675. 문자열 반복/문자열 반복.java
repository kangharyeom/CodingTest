import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
        
        // 결과값을 저장할 배열
		String[] result = new String[n]; 
        
		// n번만큼 작업 진행
		for(int i=0;i<n;i++) {
			int R = scan.nextInt(); // 반복 횟수
			String P = scan.next(); 
			String str_num ="";
		
			for(int j=0;j<P.length();j++) {
				// R번만큼 반복
				for(int k=0;k<R;k++) {
					str_num += P.charAt(j);
				}
			}
			result[i] = str_num;
		}
		
		// 결과값 출력
		for(String r:result) {
			System.out.println(r);
		}
	}
}