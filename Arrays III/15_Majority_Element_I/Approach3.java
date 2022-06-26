// Time Complexity: O(N)
// Space Complexity: O(1)
class Solution {

  public int majorityElement(int[] nums) {
    int flag = 1, value = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (value == nums[i]) {
        flag++;
      } else {
        flag--;
      }
      if (flag == 0) {
        value = nums[i];
        flag++;
      }
    }
    return value;
  }
}
