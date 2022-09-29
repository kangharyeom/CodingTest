import java.util.*;

ppublic class Solution {
    public String repeatString(String str, int num) {
        String result = "";
        for (int i=0; i<num;i++){
            result = result+str;
        }
        return result;
    }
}