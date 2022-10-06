import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         int a = scan.nextInt();
         int c = scan.nextInt();
         int[] b = new int[a];

         for(int i=0; i<a; i++){
                 b[i] = scan.nextInt();
        }

         scan.close();

         for(int i=0; i<a; i++){
             if(b[i]<c){
                System.out.println(b[i]+"");
             }
         }
    }
}