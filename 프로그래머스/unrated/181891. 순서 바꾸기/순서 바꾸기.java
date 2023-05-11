import java.util.*;
class Solution {
    public Queue<Integer> solution(int[] num_list, int n) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i =n ; i<num_list.length; i++){
            queue.add(num_list[i]);
        }
        for(int j =0 ; j<n; j++){
            queue.add(num_list[j]);
        }
        
        return queue;
    }
}