import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int totalNums = nums.length;
        int canbeTakeNums = totalNums/2;
        HashSet<Integer> numsHashSet = new HashSet<>();
        for(int num:nums){
            numsHashSet.add(num);
        }
        
        if(numsHashSet.size()>=canbeTakeNums){
            return canbeTakeNums;
        } else {
            return numsHashSet.size();
        }
    }
}