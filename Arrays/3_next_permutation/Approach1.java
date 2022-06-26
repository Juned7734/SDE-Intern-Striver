class Solution {
  public void nextPermutation(int[] arr) {
    int first = -1;
    int last = -1;
    //         first of all find the first index
    // first index such that : arr[i]< arr[i+1];

    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] < arr[i + 1]) {
        first = i;
        break;
      }
    }

    //      find the last index such that arr[i]>arr[first]
    if (first != -1) for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] > arr[first]) {
        last = i;
        break;
      }
    }
    // swap the first and last of array
    if (first != -1) {
      int temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
    }
    reverse(arr, first + 1, arr.length - 1);
  }

  public void reverse(int[] arr, int start, int last) {
    if (start < last) {
      int temp = arr[start];
      arr[start] = arr[last];
      arr[last] = temp;
      reverse(arr, start + 1, last - 1);
    }
  }
}
