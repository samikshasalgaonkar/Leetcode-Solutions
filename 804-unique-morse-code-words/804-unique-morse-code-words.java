class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<Integer, Character> characterMap = new HashMap();
        int characterKey = 0;
        for(char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            characterMap.put(characterKey, alphabet);
            characterKey++;
        }
        
        Set<String> uniqueMorseStrings = new HashSet();
        
        for(String word : words) {
            
            StringBuilder stringBuilder = new StringBuilder("");
            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);    
            
                int currentIndex = 0;
                for(int currentCharacterKey : characterMap.keySet()) {
                    if(characterMap.get(currentCharacterKey) == c) {
                        currentIndex = currentCharacterKey;
                    }           
                }
                stringBuilder.append(morseCodes[currentIndex]);
            }
          uniqueMorseStrings.add(stringBuilder.toString());      
        }
        
        return uniqueMorseStrings.size();
    }
}