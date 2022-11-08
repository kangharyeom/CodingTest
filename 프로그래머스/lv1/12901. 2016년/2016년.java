class Solution {
    public String solution(int a, int b) {
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int day = 0;
        
        //index는 0부터, 따라서 a-1해줌 
        for (int i=0; i<a-1; i++){
            day+=month[i]; //해당월이 총몇일인지 대입 
        }
        
        //index는 0부터
        day += b-1;
        
        //if(day==0) = 'FRI'
        //따라서 나머지 값이 index값임
        return week[day%7];
    }
}