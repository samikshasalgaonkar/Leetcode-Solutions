class Solution {
    public int maxProductDifference(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums) {
            list.add(i);
        }
        int setSize = list.size();
        Collections.sort(list);
        return Math.abs((list.get(0) * list.get(1)) - (list.get(setSize-2) * list.get(setSize-1)));
    }
}