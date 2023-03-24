class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int [emergency.length];
        
        // 서로의 수를 비교하고 작으면 1씩 늘어남(우선순위가 1씩 밀림) 
        for (int i=0; i< emergency.length; i++){
            for(int j=0; j< emergency.length; j++){
                if(emergency[i]<emergency[j]){
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}