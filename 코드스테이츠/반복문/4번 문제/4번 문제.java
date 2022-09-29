import java.util.*;

public class Solution {
    public int factorial(int num) {
        int result = 1;
        //팩토리얼 n! = 1*2*3*4...*n
        // 1에서부터 1씩 증가하며 num번째 까지 곱하는 반복문
        for (int i=1; i<=num; i++){
            result *= i;
        }
        return result;
    }
}
