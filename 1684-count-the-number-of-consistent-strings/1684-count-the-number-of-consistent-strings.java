class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedCharacters = new HashSet();
        int numberOfConsistentStrings = 0;
        
        for(int i = 0; i < allowed.length(); i++) {
            allowedCharacters.add(allowed.charAt(i));
        }
        
        for(String currentWord : words) {
            int counter = 0;    
            for(int i = 0; i < currentWord.length(); i++) {
                if(allowedCharacters.contains(currentWord.charAt(i))) {
                    counter++;
                }
            }
            
            if(counter == currentWord.length()) {
               numberOfConsistentStrings++; 
            }
        }
        
        return numberOfConsistentStrings;
    }
}