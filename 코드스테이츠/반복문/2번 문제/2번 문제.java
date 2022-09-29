import java.util.*;

public class Solution {
    public boolean isOdd(int num) {
        //조건문을 사용하여 짝수인 경우 return false를,
        //홀수인 경우 return true;를 작성해야 합니다.
        if (num<0) num= -num;

        while (num>0){
            num -=2;
            if (num==1){
                return true;
            }
        }

        return false;
    }
}
