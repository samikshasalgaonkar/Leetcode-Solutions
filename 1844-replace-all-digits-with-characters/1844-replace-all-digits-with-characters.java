class Solution {
    
    private Character shift(char c, int x) {
        Map<Integer, Character> characterMap = new HashMap();
        int characterKey = 1;
        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            characterMap.put(characterKey, alphabet);
            characterKey++;
        }
        
        int currentIndex = 0;
        for(int currentCharacterKey : characterMap.keySet()) {
            if(characterMap.get(currentCharacterKey) == c) {
                currentIndex = currentCharacterKey;
            }           
        }
        
        return characterMap.get(currentIndex+x);
    }
    
    public String replaceDigits(String s) {
        String temporaryString = "";
        StringBuilder stringBuilder = new StringBuilder(s);
        
        for(int i = 1; i < s.length(); i = i+2) {
            char charIndex = s.charAt(i);
            char replacedCharacter = shift(s.charAt(i-1), Character.getNumericValue(charIndex));
            stringBuilder.setCharAt(i, replacedCharacter);
        }
        
        return stringBuilder.toString();
    }
    
}