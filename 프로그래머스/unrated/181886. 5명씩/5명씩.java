import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] names) {
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i<names.length; i++){
            if(i%5==0){
                arr.add(names[i]);    
            }
        }
        
        return arr;
    }
}