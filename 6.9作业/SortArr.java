package club.banyuan;

public class SortArr {

  /**
   * 根据传入的参数来将数组升序或降序排列
   *
   * @param isAsc true 升序， false 降序
   * @param arr
   */
  static void sort(int arr[], boolean isAsc) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (isAsc) {
          if (arr[j] > arr[j + 1]) {
            int temp = arr[j + 1];
            arr[j + 1] = arr[j];
            arr[j] = temp;
          }
        } else {
          if (arr[j] < arr[j + 1]) {
            int temp = arr[j + 1];
            arr[j + 1] = arr[j];
            arr[j] = temp;
          }
        }
      }
    }
  }

  /**
   * 重载方法，将数组升序
   *
   * @param arr 目标数组
   */
  static void sort(int arr[]) {
    sort(arr, true);
  }

  /**
   * 打印数组
   *
   * @param arr
   */
  static void print(int arr[]) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      System.out.print("[" + i + "]" + "=" + arr[i] + " ");
      count++;
      if (count % 5 == 0) {
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {13, 26, -3, 4, 54, 26, 37, 18, 69, -10};
    System.out.println("输入数组：");
    print(arr);
    sort(arr, false);
    System.out.println("升序排序：");
    print(arr);
    sort(arr, true);
    System.out.println("降序排序：");
    print(arr);
  }

}
