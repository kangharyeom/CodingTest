import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuffer resultStr = new StringBuffer();
        //인덱스 개념으로 번호를 정리하면 *은 10, #은 12
        int leftNum = 10;
        int rightNum = 12;
        
        for(int num:numbers){    
            //num이 0인 경우 인덱스로는 11임
            if(num==0) num=11;
            
            if(num%3==1){
                resultStr.append("L");
                leftNum = num;
            } else if(num%3==0){
                resultStr.append("R");
                rightNum = num;
            } else {
                     
                int distanceFromLeft = Math.abs(num-leftNum)/3+Math.abs(num-leftNum)%3;
                int distanceFromRight = Math.abs(num-rightNum)/3+Math.abs(num-rightNum)%3;
           
                if(distanceFromLeft<distanceFromRight){
                    resultStr.append("L");
                    leftNum = num;
                }else if(distanceFromLeft>distanceFromRight){
                    resultStr.append("R");
                    rightNum = num;
                }else{
                    if(hand.equals("left")){
                        resultStr.append("L");
                        leftNum = num;
                    }else{
                        resultStr.append("R");
                        rightNum = num;
                    }
                }
            }
        }    
        return resultStr.toString();
    }
}