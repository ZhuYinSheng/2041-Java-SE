package club.banyuan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileMain {

  public static void main(String[] args) throws Exception {
    File file = new File("/Users/edz/2041-Java-SE/7.9作业/SplitFile/WIN.mp3");
    File file1 = new File("/Users/edz/2041-Java-SE/7.9作业/SplitFile/WIN");
    File file2 = new File("/Users/edz/2041-Java-SE/7.9作业/SplitFile/Combine.mp3");
//    split(file, 1024 * 9, file1);
    combine(file1, file2);
  }

  public static void split(File sourceFile, int size, File targetFolder) throws Exception {

    InputStream input = new FileInputStream((sourceFile));

    if (!targetFolder.exists()) {
      targetFolder.mkdir();
    }
    byte[] bytes = new byte[size];

    int length = 0;
    int index = 0;

    while ((length = input.read(bytes)) != -1) {
      OutputStream outputStream = new FileOutputStream(
          new File(targetFolder, sourceFile.getName() + "." + index++));
      outputStream.write(bytes, 0, length);
      outputStream.close();
    }
    input.close();
  }


  public static void combine(File sourceFolder, File targetFolder) throws Exception {
    OutputStream outputStream = new FileOutputStream(targetFolder);

//    int index = 0;
//
//    while (true) {
//      File input = new File(sourceFolder.getName() + "." + (index++));
//      if (!input.exists()) {
//        break;
//      }
//    }

    byte[] bytes = new byte[9 * 1024];

    for (int i = 0; i < 10; i++) {
      File file = new File(sourceFolder.getName() + "." + i);
      InputStream inputStream = new FileInputStream(file);
      int length = 0;
      while ((length = inputStream.read(bytes)) != -1) {
        outputStream.write(bytes, 0, length);
      }
      inputStream.close();
    }
    outputStream.close();
  }
}
