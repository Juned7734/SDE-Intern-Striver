class Solution {
  public void sortColors(int[] nums) {
    int _0s = 0, _1s = 0, _2s = 0;
    for (int i = 0; i < nums.length; i++) {
      switch (nums[i]) {
        case 0:
          _0s++;
          break;
        case 1:
          _1s++;
          break;
        case 2:
          _2s++;
          break;
      }
    }
    int i = 0;
    while (_0s > 0) {
      nums[i++] = 0;
      _0s--;
    }
    while (_1s > 0) {
      nums[i++] = 1;
      _1s--;
    }
    while (_2s > 0) {
      nums[i++] = 2;
      _2s--;
    }
  }
}
