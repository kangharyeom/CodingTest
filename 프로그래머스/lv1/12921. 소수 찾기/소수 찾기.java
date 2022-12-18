class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        // 0과 1은 소수가 될 수 없다.
        for (int i = 2; i <= n; ++i) {
            //배열 값이 1인 경우 소수가 아님, 반복문을 벗어남 
            if (arr[i] == 1) continue;
            
            // i+i부터 n까지 증감
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 1;
            }
            ++answer;
        }

        return answer;
    }
}