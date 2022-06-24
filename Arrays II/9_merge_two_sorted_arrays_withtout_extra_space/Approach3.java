public class Approach3 {

  // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
  // Output: [1,2,2,3,5,6]
  // Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
  // The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    while (i > -1 && j > -1) {
      if (nums1[i] < nums2[j]) {
        nums1[k--] = nums2[j--];
      } else {
        nums1[k--] = nums1[i--];
      }
    }

    while (j > -1) {
      nums1[k--] = nums2[j--];
    }
  }
}
