import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
 
		int A = in.nextInt();	// 고정비
		int B = in.nextInt();	// 변동비
		int C = in.nextInt(); 	// 제품 가격
        
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
            // 손익분기 =(고정비 / (제품가격 - 변동비)) + 1 
			System.out.println((A/(C-B))+1);
		}
	}
}