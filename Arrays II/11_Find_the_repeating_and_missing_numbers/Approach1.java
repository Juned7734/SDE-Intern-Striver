class Solution {

  public List<Integer> repeatedAndMissingNumber(int[] nums) {
    byte[] b = new byte[nums.length + 1];
    List<Integer> li = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) b[nums[i]]++;

    for (int i = 0; i < nums.length; i++) {
      if (b[nums[i]] == 2 || b[nums[i]] == 0) li.add(nums[i]);
    }
    return li;
  }
}
