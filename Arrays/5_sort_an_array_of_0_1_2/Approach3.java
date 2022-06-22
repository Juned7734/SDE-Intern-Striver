public class Approach3 {

  // leetcod problem
  public void sortColors(int[] nums) {
    int low = 0, mid = 0, high = nums.length;

    for (int i = 0; i < nums.length; i++) {
      switch (nums[i]) {
        case 0:
          swap(nums, low++, mid++);
          break;
        case 1:
          mid++;
          break;
        case 2:
          swap(nums, mid, high--);
          break;
      }
    }
  }

  public void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}
