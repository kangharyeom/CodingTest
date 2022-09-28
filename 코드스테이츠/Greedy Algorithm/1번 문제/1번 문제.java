package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int movingStuff(int[] stuff, int limit) {
        // TODO:
        // stuff의 합
        int sumStf = 0;

        // stuff 오름차순으로 정렬
        Arrays.sort(stuff);

        // 가장 가벼운 stuff
        int lightStf = 0;

        // 가장 무거운 stuff
        int heavyStf = stuff.length-1;

        // 작은 stuff가 큰 Stuff에 접근할 때 까지 반복(가벼운 stuff는 ++ 무거운 stuff는 --)
        // 한번 돌때마다 stuff의 합++
        while (lightStf<heavyStf){
            // stuff의 합은 limit보다 작거나 같아야함
            if (stuff[lightStf]+stuff[heavyStf]<=limit){
                lightStf++;
                heavyStf--;
                sumStf++;
            }
            // 그렇지 않으면 무거운 stuff만 대입
            else {
                heavyStf--;
            }
        }
        // stuff.length에서 stuff합을 빼준다.
        return	stuff.length-sumStf;
    }
}
