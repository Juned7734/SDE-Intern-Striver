// Time Complexity: O(N^2);
// Space Complexity: O(1);
class Solution {

  public int majorityElement(int[] nums) {
    int value = 0;
    int c = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          c++;
        }
      }
      if (c > nums.length / 3) {
        value = nums[i];
        break;
      }
    }

    return value;
  }
}
