import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
        double a = ab.nextDouble();
        double b = ab.nextDouble();
        System.out.println((int)(a+b));
        System.out.println((int)(a-b));
        System.out.println((int)(a*b));
        System.out.println((int)(a/b));
        System.out.println((int)(a%b));
    }
}