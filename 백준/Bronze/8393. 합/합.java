import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   //n이 주어졌을 때 1부터 n까지의 합
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int sum = 0;
        for (int i=0; i<=A; i++){
            sum = sum+(A-i);
        }
        System.out.println(sum);
    }
}