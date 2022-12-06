class Solution {
    public int solution(String s) {
        String str = s.toLowerCase();
        char x = str.charAt(0);
        int count = 0;
        int trueX = 0;
        int nonX = 0;
        for(int i=0; i<str.length(); i++){
            if (trueX==nonX){
                count+= 1;
                x=str.charAt(i); 
            }
            
            if(x==str.charAt(i)){
                trueX += 1;
            } 
            
            else {
                nonX += 1;
            }            
        }
        return count;
    }
}