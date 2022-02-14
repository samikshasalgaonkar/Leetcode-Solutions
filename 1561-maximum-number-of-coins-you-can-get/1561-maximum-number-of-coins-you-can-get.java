class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int k = piles.length / 3;
        for(int i = piles.length - 2; i >= k; i-=2) {
            sum = sum + piles[i];
        }
        
        return sum;
    }
}