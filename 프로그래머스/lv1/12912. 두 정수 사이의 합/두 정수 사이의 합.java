class Solution {
    public long solution(int a, int b) {
        //총합을 할당할 변수 선언
        long sum = 0;
        
        // a<b 인경우
        if (a<b){
            for (int i=a+1; i<b; i++){
                sum += i;
            }
        }
        if (a>b){
            for (int i=b+1; i<a; i++){
                sum += i;
            }
        }
        
        //서로 같은 경우 a 리턴
        if (a==b) return (long) a;
        
        return (long) a+b+sum;
    }
}