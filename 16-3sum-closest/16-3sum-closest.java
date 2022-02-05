class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDistance = Integer.MAX_VALUE;
        List<Integer> sumList = new ArrayList<>();
        
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum > target && sum-target < minDistance) {
                        minDistance = sum-target;
                        sumList.add(sum);
                    } else if(sum < target && target-sum < minDistance) {
                        minDistance = target-sum;
                        sumList.add(sum);
                    } else if(sum == target) {
                        return sum;
                    }
                }
            }
        }
        
        return sumList.get(sumList.size()-1);
    }
}