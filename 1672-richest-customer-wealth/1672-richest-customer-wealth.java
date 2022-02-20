class Solution {
    public int maximumWealth(int[][] accounts) {
        Set<Integer> sum = new HashSet<>();
        
        for(int i = 0; i < accounts.length; i++) {
            int count = 0;
            for(int j = 0; j < accounts[0].length; j++) {
                count = count + accounts[i][j];
            }
            
            sum.add(count);
        }
        
        return Collections.max(sum);
    }
}