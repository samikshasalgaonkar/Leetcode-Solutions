class Solution {
    public String truncateSentence(String s, int k) {
       String[] words = s.split(" ");
       String answer = "";
        
       for(int i = 0; i < k; i++) {
           answer = answer + words[i] + " ";
       } 
        
       return answer.trim(); 
    }
}