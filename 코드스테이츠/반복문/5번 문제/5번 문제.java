import java.util.*;

public class Solution {
    public String makeDigits(int num) {
        String result = "";

        for (int i=1; i<=num; i++){
            //String과 int타입을 더할 때 자동으로 int to String이됨
            result =result + i;
        }
        return result;
    }
}