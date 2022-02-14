class Solution {
    public int maxCoins(int[] piles) {
        ArrayList<Integer> coinList = new ArrayList<>();
        for(int i : piles) {
            coinList.add(i);
        }
        
        Collections.sort(coinList);
        int sum = 0;
        int k = coinList.size() / 3;
        for(int i = coinList.size() - 2; i >= k; i-=2) {
            sum = sum + coinList.get(i);
        }
        
        return sum;
    }
}