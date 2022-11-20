import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] total = new int[31];
        
        // 학생인원, 제출한 출번 입력, 제출한 번호는 1을 부여받음
		for (int i = 1; i < 29; i++) {
			int submit = sc.nextInt();
			total[submit] = 1;
		}
        
        //  1이 없는 인원은 제출하지 않은 인원, 반복문을 돌면서 1이 없는 인원 출력
		for (int i = 1; i < total.length; i++) {
			if (total[i] != 1)
				System.out.println(i);
		}

		sc.close();
	}
}