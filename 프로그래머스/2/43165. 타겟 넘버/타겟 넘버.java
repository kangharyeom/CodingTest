class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers,0,target,0);
        
        return answer;
    }
    
    // 깊이우선 탐색 풀이
    public void dfs(int[] numbers, int depth, int target, int sum){
        //깊이와 numbers의 길이가 같은경우 == 마지막 노드
        if(depth == numbers.length){
            //타겟 넘버와 numbers의 총합이 같으면 경우의 수++
            if(target == sum){
                answer += 1;
            }
        } else {
            // 해당 노드 값을 더하는 경우 
            dfs(numbers, depth +1, target, sum + numbers[depth]);
            // 해당 노드 값을 빼는 경우 
            dfs(numbers, depth +1, target, sum - numbers[depth]);
        }
    }
}