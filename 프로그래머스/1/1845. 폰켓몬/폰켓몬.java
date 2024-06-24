import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int sameCount = 0;
        int halfNums = nums.length/2 ;

        HashSet<Integer> dupl = new HashSet<>();
        for(Integer num:nums){
            dupl.add(num);
        }
        
        sameCount = dupl.size();
        
        if(sameCount>halfNums){
            return halfNums;
        }
        
        return sameCount;
    }
}