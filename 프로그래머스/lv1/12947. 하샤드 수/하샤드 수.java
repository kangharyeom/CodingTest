class Solution {
    public boolean solution(int num) {
        //num을 받을 int 선언
        int numFinal = num;
        
        //각 자리수의 합을 받을 변수 선언
        int sum =  0;
        
        //각 자리수 합 구하는 while문
        while (num>0){
            sum += num%10;
            num/=10;
        }
        
        //numFinal이 sum으로 나눠지면 하샤드 수이므로
        if (numFinal%sum==0) return true;
        return false;
    }
}