class Solution {
    public int solution(String s) {
        String[] num =new String[]{"0","1","2","3","4","5","6","7","8","9"};
        String[] word =new String[]{"zero","one","two","three",
                                    "four","five","six","seven","eight","nine"};
        
        for(int i=0; i<num.length; i++){
            s=s.replace(word[i], num[i]);
        }
        return Integer.parseInt(s);
    }
}