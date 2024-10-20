import java.util.*;
import java.util.stream.Collectors;

class Solution {
    static Map<String, Integer> map;

    public String[] solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>();
        
        // 각 코스 길이에 대해 처리
        for (int menuCount : course) {
            map = new HashMap<>();
            
            // 각 주문에 대해 처리
            for (String order : orders) {
                // 메뉴 조합을 만들기 위해 문자열을 정렬
                char[] chars = order.toCharArray();
                Arrays.sort(chars);
                order = String.valueOf(chars);
                
                // 해당 길이의 모든 조합을 구함
                combine(order, "", 0, menuCount);
            }
            
            // 가장 많이 주문된 조합을 찾음
            if (!map.isEmpty()) {
                int maxCount = Collections.max(map.values());  // 최다 빈도 찾기
                if (maxCount > 1) {  // 2번 이상 주문된 조합만 추가, set은 중복을 허용하지 않음
                    for (String key : map.keySet()) {
                        if (map.get(key) == maxCount) {
                            answerList.add(key);
                        }
                    }
                }
            }
        }
        
        // 결과를 정렬
        Collections.sort(answerList);
        
        // 리스트를 배열로 변환하여 반환
        return answerList.toArray(new String[0]);
    }

    // 재귀를 이용한 조합 생성
    public static void combine(String order, String current, int index, int menuCount) {
        if (current.length() == menuCount) {
            map.put(current, map.getOrDefault(current, 0) + 1);  // 조합의 등장 횟수 기록
            return;
        }
        if (index >= order.length()) return;

        // 현재 문자를 포함하거나 포함하지 않는 두 가지 선택
        combine(order, current + order.charAt(index), index + 1, menuCount);  // 포함
        combine(order, current, index + 1, menuCount);  // 미포함
    }
}
