class Solution {
    public int mostWordsFound(String[] sentences) {
        TreeSet<Integer> wordCount = new TreeSet(); 
        for(int i = 0; i < sentences.length; i++) {
            String[] stringElements = sentences[i].split(" ");
            wordCount.add(stringElements.length);   
        }
        
        return wordCount.last();
    }
}