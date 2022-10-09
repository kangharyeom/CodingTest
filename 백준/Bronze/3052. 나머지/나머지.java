import java.util.*;

public class Main {
    public static void main(String[] args){
        HashSet<Integer> arr = new HashSet<Integer>();
        Scanner scan = new Scanner(System.in);

        //Arr[]에 들어갈 숫자를 대입할 반복문
        for (int i=0; i<10; i++){
            arr.add(scan.nextInt()%42);
        }
        System.out.println(arr.size());
    }
}