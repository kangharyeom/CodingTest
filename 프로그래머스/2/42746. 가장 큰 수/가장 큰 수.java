import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(int[] numbers) { 
            return Arrays.stream(numbers)
                .mapToObj(Integer::toString)
                .sorted((s1, s2) -> {
                    int s1S2Str = Integer.parseInt(s1+s2);
                    int s2S1Str = Integer.parseInt(s2+s1);
                    return s2S1Str - s1S2Str;
                })
                .collect(Collectors.joining(""))
                .replaceAll("^0+", "0");
    }
}