import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String,Integer> map = new LinkedHashMap<>();
        
        // name과 yearning을 hashmap에 담는다. 
        // name과 photo의 요소 값이 같으면 value를 더해주는 총합을 구해야함
        for(int i=0; i< name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        // photo를 [i][]단위로 나눠서 탐색하기 위해 arrPhotoKey 배열에 담아줌
        for(int i=0; i< photo.length; i++){
            String[] arrPhotoKey = photo[i]; 
            int sum = 0;

            // arrPhotoKey[]의 각 요소가 name의 각 요소와 일치하면 map의 value값이 sum에 더해짐
            for(int j=0; j<arrPhotoKey.length; j++){
                
                // arrPhotoKey[]의 각 요소를 strPhotoKey라고 선언
                String strPhotoKey = arrPhotoKey[j];
                if(map.containsKey(strPhotoKey)){ 
                    sum+=map.get(strPhotoKey);
                }
            }
            answer[i]=sum;
        }
        return answer;
    }
}