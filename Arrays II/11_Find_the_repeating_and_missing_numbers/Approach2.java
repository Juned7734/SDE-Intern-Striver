public class Approach2 {
    // function to find the right most bit of a number;
  public static int find(int n) {
    int i = 0;
    while (n > 0) {
      n = n >> 1;
      i++;
    }
    return i;
  }
    // function to check that nth bit of a number is set or not
  public static int checkNthBit(int num, int n) {
    num = num >> n - 1;
    return num & 1;
  }

  public List<Integer> repeatedAndMissingNumber(int[] nums) {
    int xor = 0;

    for (int a : arr) {
      xor = xor ^ a;
    }

    for (int i = 1; i <= arr.length; i++) {
      xor = xor ^ i;
    }

    int setBit = find(xor);

    int b1 = 0;
    int b2 = 0;

    for (int i = 0; i < arr.length; i++) {
      if (checkNthBit(arr[i], setBit) == 1) {
        b1 = b1 ^ arr[i];
      } else {
        b2 = b2 ^ arr[i];
      }
    }

    for (int i = 1; i <= arr.length; i++) {
      if (checkNthBit(i, setBit) == 1) {
        b1 = b1 ^ i;
      } else {
        b2 = b2 ^ i;
      }
    }

    System.out.println(b1);
    System.out.println(b2);
  }
}
