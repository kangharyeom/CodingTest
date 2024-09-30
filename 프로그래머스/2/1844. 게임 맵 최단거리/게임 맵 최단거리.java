import java.util.*;

class Solution {
    public static int n, m; // 행열 선언
    public static int answer = -1; // answer 선언(가장 빠른 길이 없는 경우가 기본 값) 
    public static int dx[] = {-1, 1, 0, 0}; // x좌표는 좌우로만 이동 가능
    public static int dy[] = {0, 0, -1, 1}; // y좌표는 상하로만 이동 가능
    public static boolean visited[][]; // visited == true == 방문경험O
    
    public int solution(int[][] maps) {
        n = maps.length; // 행
        m = maps[0].length; // 열
        visited = new boolean[n][m];
    
        return bfs(0, 0, maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        Queue<int[]> que = new LinkedList<>(); // bfs는 queue dfs는 스택 또는 재귀
        que.add(new int[]{x, y, 1}); // x,y좌표 주입
        visited[0][0] = true;

        while (!que.isEmpty()) {
            int temp[] = que.poll();
            x = temp[0];
            y = temp[1];
            int count = temp[2];
            
            // 모든 칸을 다 돌았는지 확인
            if (x == n-1 && y == m-1) {
                answer = count;
                break;
            }

            
            for (int i = 0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // nx<0: 왼쪽에 길이 없음
                // nx >= n: 오른쪽에 길이 없음
                // ny < 0: 위에 길이 없음
                // ny < 0: 아래에 길이 없음
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue; 
                // 길이 막혀있는 경우
                if(maps[nx][ny] == 0) continue; 
                // 방문경험X && 길이 있는 경우
                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true; // 방문경험O로 변경
                    que.add(new int[]{nx, ny, count+1});
                }
            }
        }

        return answer;
    }
}