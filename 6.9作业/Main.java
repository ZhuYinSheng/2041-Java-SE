package club.banyuan;

public class Main {

  public static void main(String[] args) {
    /**
     *请思考验证当float类型变量中保存了超出了int所能表示的范围的数字，将这个变量强制转换为int数据类型后，int数据类型变量中保存的值是多少？
     */
    float a = 3.14E38F;
    int b = (int) a;
    System.out.println("float表示的值：" + a);
    System.out.println("int表示的值：" + b);

    /**
     * 编写示例证明||会出现短路而|是不会短路的
     */
    int m = 1;
    boolean one = false && (++m > 1);
    System.out.println(one + " 短路");
    System.out.println(m);

    m = 1;
    one = false & (++m > 1);
    System.out.println(one + " 不会短路");
    System.out.println(m);



  }
}