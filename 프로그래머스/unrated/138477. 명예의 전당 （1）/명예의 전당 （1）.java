import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listAnswer = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            if(list.size()<k){
                list.add(score[i]);
                Collections.sort(list);
                listAnswer.add(list.get(0));
            } else if(list.size()==k){
                list.add(score[i]);
                Collections.sort(list);
                list.remove(list.get(0));
                listAnswer.add(list.get(0));
            }
        }
        return listAnswer;
    }
}