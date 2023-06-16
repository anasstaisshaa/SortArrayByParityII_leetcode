class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] sorted = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sorted[evenIndex] = nums[i];
                evenIndex += 2;
            } else {
                sorted[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }

        return sorted;
    }
}