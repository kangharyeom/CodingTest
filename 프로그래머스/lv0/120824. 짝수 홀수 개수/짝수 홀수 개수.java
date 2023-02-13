class Solution {
    public int[] solution(int[] num_list) {
        //짝수 홀수를 담는 배열 선언
        int[] answer = new int [2];
        int countEven = 0;
        int countOdd = 0;
        
        //num_list의 길이만큼 반복
        for(int i=0; i<num_list.length; i++){
            //짝수인 경우 짝수를 카운트
            if(num_list[i]%2==0){
                countEven += 1;
            } 
            // 나머지는 홀수이므로 홀수를 카운트
            else{
                countOdd += 1;
            }
        }
        answer[0] = countEven;
        answer[1] = countOdd;
        return answer;
    }
}