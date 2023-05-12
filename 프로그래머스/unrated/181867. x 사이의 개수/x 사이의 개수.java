import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String myString) {
        String[] str = myString.split("x");
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<str.length; i++){
            list.add(str[i].length());
        }
        if(myString.charAt(myString.length()-1)=='x'){
            list.add(0);
        }
        return list;
    }
}