import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] Arr = new int[9];
        int count =0;
        int max = Arr[0];
        
        for (int i=0; i<9; i++){
            int num = scan.nextInt();
            Arr[i] = num;
        }
        for (int i=0; i< 9; i++){
            if (Arr[i]>max){
                max=Arr[i];
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}