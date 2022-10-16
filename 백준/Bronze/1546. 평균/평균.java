import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        //과목 수 선언
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //과목을 할당받을 ArrayList선언
        ArrayList<Integer> Arr = new ArrayList<>();

        //과목의 개수만큼 과목 점수 할당하는 반복문
        for (int i=0; i<n; i++){
               Arr.add(scan.nextInt());
        }

        //최대값 찾기
        int max = Collections.max(Arr);

        Integer[] array = Arr.toArray(new Integer[0]);

        //평균을 담을 변수 선언
        double avg = 0;
        // i/max*100 반복문
        for (int i=0; i<array.length; i++){
            avg += (double)array[i]/max*100;
        }
        System.out.println(avg/n);
    }
}