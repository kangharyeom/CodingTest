import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        for(int j=1; j<=C; j++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(A+B);;
        }
    }
}