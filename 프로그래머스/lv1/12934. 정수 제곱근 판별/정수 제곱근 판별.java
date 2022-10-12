class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n)*10;
        long result;
        if (num%10 != 0){
            return -1;
        } 
        if (num%10 == 0){
            return result = (long)Math.pow(((num/10)+1),2);
        }
        return 0;
    } 
}