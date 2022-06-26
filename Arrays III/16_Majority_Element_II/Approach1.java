// Time Complexity : O(N^2)
// Space Complexity : O(1)
class Solution {

  public List<Integer> majorityElement(int[] nums) {
    List<Integer> li = new ArrayList<Integer>();

    for (int i = 0; i < nums.length; i++) {
        int c=0;
        for(int j = 0; j<nums.length; j++){
            if(nums[i]==nums[j])
            c++;
        }
      if (c>nums.length/3)(
      ) li.add(nums[i]);
    }

    return li;
  }
}

