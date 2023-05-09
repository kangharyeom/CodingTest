class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.length() - is_suffix.length()<0){
            return 0;
        }
        
        my_string = my_string.substring(my_string.length() - is_suffix.length(),my_string.length());
        if(my_string.equals(is_suffix)){
            return 1;
        }
        return 0;
    }
}