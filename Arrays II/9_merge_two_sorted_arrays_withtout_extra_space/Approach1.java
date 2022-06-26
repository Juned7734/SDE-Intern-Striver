class Solution {
  public static void merge(long arr1[], long arr2[], int n, int m) {
    // code here
    // Input: 
    // n = 4, arr1[] = [1 3 5 7] 
    // m = 5, arr2[] = [0 2 6 8 9]
    // Output: 
    // arr1[] = [0 1 2 3]
    // arr2[] = [5 6 7 8 9]
    // Explanation:
    // After merging the two 
    // non-decreasing arrays, we get, 
    // 0 1 2 3 5 6 7 8 9.
    long[] temp = new long[n + m];
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (arr1[i] <= arr2[j]) {
        temp[k++] = arr1[i++];
      } else if (arr2[j] <= arr1[i]) {
        temp[k++] = arr2[j++];
      }
    }
    while (i < n) {
      temp[k++] = arr1[i++];
    }
    while (j < m) {
      temp[k++] = arr2[j++];
    }

    j = 0;
    k = 0;
    for (i = 0; i < temp.length; i++) {
      if (j < n) {
        arr1[j++] = temp[i];
      } else {
        arr2[k++] = temp[i];
      }
    }
  }
}
