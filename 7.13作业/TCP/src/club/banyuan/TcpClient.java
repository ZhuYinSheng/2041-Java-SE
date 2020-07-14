package club.banyuan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) {
        String path = "/Users/edz/2041-Java-SE/7.13作业/TCP/alice.code";
        try {
            Socket socket = new Socket("127.0.0.1", 5000);
            System.out.println("建立连接");
            File file = new File(path);

            OutputStream outputStream = socket.getOutputStream();

            int length = (int) file.length();

            outputStream.write(parse(length));
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int count = fileInputStream.read(bytes);
            while (count > 0) {
                outputStream.write(bytes, 0, count);
                count = fileInputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





//    InputStream resourceAsStream = FileUploadClient.class.getResourceAsStream("/alice.code");
//        try {
//            Socket socket = new Socket("127.0.0.1", 10000);
//
//            OutputStream outputStream = socket.getOutputStream();
//            byte[] bytes = "alice.code".getBytes();
//            outputStream.write(parse(bytes.length));
//            outputStream.write(bytes);
//            System.out.println("文件长度：" + resourceAsStream.available());
//            outputStream.write(parse(resourceAsStream.available()));
//            byte[] buf = new byte[1024];
//            int count = resourceAsStream.read(buf);
//            while (count != -1) {
//                outputStream.write(buf, 0, count);
//                count = resourceAsStream.read(buf);
//            }
//
//            System.out.println("程序退出");
//
//        } catch (
//                IOException e) {
//            e.printStackTrace();
//        }
    




    public static byte[] parse(int target) {
        byte[] bytes = new byte[4];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (target >> 8 * (3 - i));
        }
        return bytes;
    }

}
