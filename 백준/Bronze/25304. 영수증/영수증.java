import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt(); //토탈 금액 선언
        int num = scan.nextInt(); //품목 개수 선언

        //반복문의 결과값으로 나올 변수의 합을 담아줄 변수 선언
        int sum[][]= new int[num][2];

        int comp = 0; //금액이 맞는지 비교
        for (int i = 0; i < sum.length; i++) {
            sum[i][0] = scan.nextInt();
            sum[i][1] = scan.nextInt();
            comp += sum[i][0]*sum[i][1];
        }
        if(total == comp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}