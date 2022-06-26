import java.util.*;
class Solution {
  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    int[] pair = intervals[0];
    ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
    for (int i = 1; i < intervals.length; i++) {
      if (pair[1] >= intervals[i][0]) {
        pair[1] = Math.max(pair[1], intervals[i][1]);
      } else {
        ArrayList<Integer> sli = new ArrayList<Integer>();
        sli.add(pair[0]);
        sli.add(pair[1]);
        li.add(sli);
        pair = intervals[i];
      }
    }

    ArrayList<Integer> sli = new ArrayList<Integer>();
    sli.add(pair[0]);
    sli.add(pair[1]);
    li.add(sli);

    int[][] intArray = new int[li.size()][2];

    for (int i = 0; i < li.size(); i++) {
      intArray[i][0] = li.get(i).get(0);
      intArray[i][1] = li.get(i).get(1);
    }
    return intArray;
  }
}
