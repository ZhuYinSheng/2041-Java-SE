package club.banyuan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Decode {

  String encode = "/Users/edz/2041-Java-SE/7.9作业/CaesarCipher/src/alice.code";
  String decode = "/Users/edz/2041-Java-SE/7.9作业/CaesarCipher/src/alice.code.decode";

  public static void main(String[] args) throws Exception {
    BufferedReader inStream = null;
    BufferedWriter outStream = null;

    String inputFilePath = args[0];
    String outputFilePath = args[1];

    System.out.println("输入文件：" + inputFilePath);
    System.out.println("输出文件：" + outputFilePath);
    // TODO
    //完成此部分代码，调用 caesarDecode 对传入的inputFilePath文件进行解密
    //将解密后的文本输出到 outputFilePath 文件中
    //尝试将alice.code进行解密

    inStream = new BufferedReader(new FileReader(inputFilePath));
    outStream = new BufferedWriter(new FileWriter(outputFilePath));

    String s = inStream.readLine();
//    StringBuilder builder = new StringBuilder();

    while (s != null) {
      char[] chars = s.toCharArray();
      for (char one : chars) {
        outStream.write(caesarDecode(one));
//        builder.append(caesarDecode(one));
      }
//      outStream.write((builder).toString());
      outStream.newLine();
      s = inStream.readLine();
    }
    outStream.flush();
    outStream.close();

    System.out.println("解密成功！");
  }

  public static char caesarDecode(char ch) {
    if (Character.isUpperCase(ch)) {
      return (char) ((ch - Encode.FIRST_UPPER + Encode.NUM_CHARS - Encode.OFFSET) % Encode.NUM_CHARS
          + Encode.FIRST_UPPER);
    } else if (Character.isLowerCase(ch)) {
      return (char) ((ch - Encode.FIRST_LOWER + Encode.NUM_CHARS - Encode.OFFSET) % Encode.NUM_CHARS
          + Encode.FIRST_LOWER);
    } else {
      return ch;
    }
  }

}

