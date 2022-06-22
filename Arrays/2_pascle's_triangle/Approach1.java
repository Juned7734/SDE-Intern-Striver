import java.util.*;

public class Approach1 {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> mainLi = new ArrayList<List<Integer>>();
    List<Integer> row, pre = null;
    for (int i = 1; i <= numRows; i++) {
      row = new ArrayList<Integer>();
      for (int j = 0; j < i; j++) {
        if (j == 0 || j == i - 1) {
          row.add(1);
        } else {
          row.add(pre.get(j - 1) + pre.get(j));
        }
      }
      pre = row;
      mainLi.add(row);
    }
    return mainLi;
  }
  //     1
  //    1 1
  //   1 2 1
  //  1 3 3 1
  // 1 4 6 4 1
}
