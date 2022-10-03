import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int A;
        int B;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            A= Integer.parseInt(st.nextToken());
            B =  Integer.parseInt(st.nextToken());
            System.out.println("Case #"+(i+1)+":"+" "+A+" + "+B+" = "+(A+B));
        }
        br.close();
    }
}