class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelElements = new char[jewels.length()];
        char[] stoneElements = new char[stones.length()];
        
        for(int i = 0; i < jewels.length(); i++) {
            jewelElements[i] = jewels.charAt(i);
        }
        
        for(int j = 0; j < stones.length(); j++) {
            stoneElements[j] = stones.charAt(j);
        }
        
        int counter = 0;
        for(int k = 0; k < stoneElements.length; k++) {
            for(int l = 0; l < jewelElements.length; l++) {
                if(stoneElements[k] == jewelElements[l]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}