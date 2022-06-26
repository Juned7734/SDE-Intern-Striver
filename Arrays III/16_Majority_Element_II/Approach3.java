// Time Complexity : O(N)
// Space Complexity : O(1)
class Solution {
  public List<Integer> majorityElement(int[] nums) {
    int c1 = 0, c2 = 0, v1 = 0, v2 = 0;
    List<Integer>  li = new ArrayList<Integer>();

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == v1)
        c1++;
      else if (nums[i] == v2)
        c2++;
      else if (c1 == 0) {
        v1 = nums[i];
        c1 = 1;
      } else if (c2 == 0) {
        v2 = nums[i];
        c2 = 1;
      } else {
        c1--;
        c2--;
      }
    }

    c1 = c2 = 0;
    for (int i = 0; i < nums.length; i++ ) {
      if (v1 == nums[i])
        c1++;
      if (v2 == nums[i])
        c2++;
    }
    if (c1 > nums.length / 3 && li.contains(v1) == false)
      li.add(v1);
    if (c2 > nums.length / 3 && li.contains(v2) == false)
      li.add(v2);
    return li;
  }
}