class Solution {
    public int solution(int a, int b) {
        String aTo = Integer.toString(a)+Integer.toString(b);
        String bTo = Integer.toString(b)+Integer.toString(a);
        a = Integer.parseInt(aTo);
        b = Integer.parseInt(bTo);
        
        if(a >= b){
            return a;
        } else {
            return b;
        }
    }
}