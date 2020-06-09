package club.banyuan;

public class ArrayDeduplication {

  /**
   * 编写一个方法用于int数组去重，将数组中重复的元素只保留一个
   *
   * @param arr
   * @return
   */
  static int[] filterArray(int[] arr) {

    int count = arr.length;
    for (int i = 0; i < count; i++) {
      for (int j = i + 1; j < count; j++) {
        if (arr[i] == arr[j]) {
          for (int k = j; k < count - 1; k++) {
            arr[k] = arr[k + 1];
          }
          count--;
          j--;
        }
      }
    }

    int[] rlt = new int[count];
    for (int i = 0; i < count; i++) {
      rlt[i] = arr[i];
    }

    for (int i = 0; i < count; i++) {
      System.out.print(" " + rlt[i] + " ");
    }
    return rlt;
  }

  public static void main(String[] args) {
    int[] array = {2, 3, 1, 3, 1, 4, 5, 6};
    filterArray(array);
  }
}


