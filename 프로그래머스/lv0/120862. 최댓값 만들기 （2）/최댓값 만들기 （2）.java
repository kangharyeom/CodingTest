import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> intList = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            intList.add(numbers[i]);
        }
        
        Collections.sort(intList);
        int a = intList.get(intList.size()-1)*intList.get(intList.size()-2);
        int b = intList.get(0)*intList.get(1);
        
        if(a>b){ answer=a; } 
        else { answer=b; }
        
        return answer;
    }
}