import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer=0;
        int sum=0; 
        Arrays.sort(array);
        
        ArrayList<Integer> arrSum = new ArrayList<>();
        
        for(int i=0; i<array.length; i++){
            sum = array[i]-n;
            if(sum<0){
                sum = -sum;
            }
            arrSum.add(sum);
        }
        Collections.sort(arrSum);
        
        for (int j = 0; j < arrSum.size(); j++) {
            if (array[j]-n<0 && -(array[j]-n) == arrSum.get(0)){
                answer = array[j];
                break;
            }
            
            else if (array[j]-n>=0 && array[j]-n == arrSum.get(0)){
                answer = array[j];
                break;
            }
        }
        return answer;
    }
}