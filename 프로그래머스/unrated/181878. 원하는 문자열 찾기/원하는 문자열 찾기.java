class Solution {
    public int solution(String myString, String pat) {
        String myLower = myString.toLowerCase();
        String patLower = pat.toLowerCase();
        boolean str = myLower.contains(patLower);
        if( str == true){
            return 1;
        } else{
            return 0;
        }
    }
}