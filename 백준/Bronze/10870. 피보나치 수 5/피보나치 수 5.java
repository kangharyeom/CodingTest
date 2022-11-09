import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        System.out.println(fibonacci(n));
        
    }
    static int fibonacci(int n) {
		if(n == 0) return 0; // 0이면 0을 반환
		else if(n == 1) return 1; // 1이면 1을 반환
		else {
			return fibonacci(n-1)+fibonacci(n-2); // 자신-1 + 자신-2 후 리턴
        }
	}
}