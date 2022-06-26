class Solution {

  class Solution {

    public int findDuplicate(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[Math.abs(nums[i]) - 1] > 0) {
          nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
        } else {
          return Math.abs(nums[i]);
        }
      }

      return -1;
    }
  }
}
