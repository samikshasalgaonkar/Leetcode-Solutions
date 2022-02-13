class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        for(List<String> currentItem : items) {
            if(ruleKey.equals("type")) {
                if(currentItem.get(0).equals(ruleValue)){
                    count++;
                }
            } else if (ruleKey.equals("color")) {
                if(currentItem.get(1).equals(ruleValue)){
                    count++;
                }
            } else {
                if(currentItem.get(2).equals(ruleValue)){
                    count++;                        
                }
            }
        }
        return count;
    }
}