class Solution {
    public int solution(String my_string, String target) {
        boolean str = my_string.contains(target);
        if(str==true){
            return 1;
        } else{ return 0;}
    }
}