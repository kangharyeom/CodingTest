class Solution {
    public int solution(int a, int b) {
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        StringBuffer sbf = new StringBuffer();
        sbf.append(aStr); 
        sbf.append(bStr);
        String answer1Str = sbf.toString();
        int answer1 = Integer.parseInt(answer1Str);
        int answer2 = 2 * a * b;
        if(answer1 >= answer2){
            return answer1;
        }else{
            return answer2;
        }
    }
}