class Solution {
    public String solution(String letter) {
        String[] mose = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] str;
        str = letter.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : str) {
            for (int i = 0; i < mose.length; i++) {
                if (word.equals(mose[i])) sb.append(Character.toString(i + 'a'));
            }
        }
        return sb.toString();
    }
}