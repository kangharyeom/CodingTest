import java.util.*;

class Solution {
    boolean solution(String s) {
       String str = s.toLowerCase();
       ArrayList<String> text = new ArrayList<>();

       for (int i=0; i<str.length();i++){
             text.add(String.valueOf(str.charAt(i)));
       }
       int S = Collections.frequency(text,"p");
       int y = Collections.frequency(text,"y");

       if (S==y) return true;
       if (S!=y) return false;
    return false;
    } 
}