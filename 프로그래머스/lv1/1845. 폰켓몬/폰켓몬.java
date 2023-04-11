import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int count = nums.length/2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        set.stream().sorted();
        
        if (set.size() > count) {
             return count;
        } else {
             return set.size();
        }
    }
}