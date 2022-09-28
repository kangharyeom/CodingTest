package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int partTimeJob(int k) {
        //결과값 선언
        int result = 0;

        //동전의 종류를 배열에 대입
        int[] wallet = new int[]{500, 100, 50, 10, 5, 1};

        //동전 종류만큼 배열을 순회(wallet.lenth만큼)
        for(int i = 0; i < wallet.length; i++) {

            //총 금액이 0보다 클때마다(0보다 커야 거스름돈이 발생하기 때문)
            if(k > 0) {

                //총 금액을 현재 동전으로 나눈 수를 구합니다(해당 동전의 총 갯수)
                int sum = (int)Math.floor((double)k / wallet[i]);

                //해당 동전의 갯수를 결과 더함
                result = result + sum;

                //총 금액을 사용한 동전의 금액만큼 차감
                k = k - (wallet[i] * sum);
            }
        }
        //결과를 반환합니다.
        return result;
    }
}