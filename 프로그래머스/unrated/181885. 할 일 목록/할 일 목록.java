import java.util.*;
class Solution {
    public LinkedList<String> solution(String[] todo_list, boolean[] finished) {
        LinkedList<String> list = new LinkedList<>();
        
        for(int i=0; i<todo_list.length; i++){
            if(finished[i]==false){
                list.add(todo_list[i]);
            }
        }
        return list;
    }
}