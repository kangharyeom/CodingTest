import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt(); // 첫 번째, 세자리수
        String B = scan.next(); // 두 번째, 세자리수

        scan.close();

        System.out.println(A*(B.charAt(2)-'0'));
        System.out.println(A*((B.charAt(1)-'0')*1));
        System.out.println(A*((B.charAt(0)-'0')*1));
        System.out.println(A*Integer.parseInt(B));
    }
}