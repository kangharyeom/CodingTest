import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        //세개가 모두 같을 때
        if (A==B && A==C){
        System.out.println(10000+(1000*A));
        }

        //세개가 모두 다를 때
        else if (A!=B && A!=C && B!=C) {
            int array[] = {A,B,C};
            int max = array[0];
            for(int i=0; i<array.length; i++){
                if(max<array[i]) {
                    max = array[i];
                }
            }
            System.out.println(max*100);
        }

        //두개만 같을 때 (A==B일때)
        else if (A==B && A!=C){
        System.out.println(1000+(A*100));
        }
        //두개만 같을 때 (A==C일때)
        else if (A!=B && A==C){
        System.out.println(1000+(A*100));
        }
        //두개만 같을 때 (B==C일때)
        else if (C==B && A!=C){
        System.out.println(1000+(B*100));
        }
    }
}