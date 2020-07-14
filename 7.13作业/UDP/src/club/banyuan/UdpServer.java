package club.banyuan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpServer {

  public static void main(String[] args) {

    while (true) {
      try {
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.equals("quit")) {
          System.out.println("程序已退出！");
          return;
        }

        String[] s = word.split(" ");

        if (s.length != 3) {
          throw new IllegalArgumentException("输入不合法。1");
        }

        String[] s1 = s[0].split("\\.");
        if (s1.length != 4) {
          throw new IllegalArgumentException("输入不合法！2");
        } else {
          try {
            int num1 = Integer.parseInt(s1[0]);
            int num2 = Integer.parseInt(s1[1]);
            int num3 = Integer.parseInt(s1[2]);
            int num4 = Integer.parseInt(s1[3]);
            if (((num1 > 255 || num1 <= 0) || (num2 > 255 || num2 < 0) || (num3 > 255 || num3 < 0)
                || (num4 > 255 || num4 < 0))) {
              throw new IllegalArgumentException("数字不合法！3");
            }
          } catch (NumberFormatException e) {
            throw new IllegalArgumentException("输入非数字！4");
          }
        }

        try {
          int port = Integer.parseInt(s[2]);
          if (port < 0 || port > 65535) {
            throw new IllegalArgumentException("数字不合法！5");
          }
        } catch (NumberFormatException e) {
          throw new IllegalArgumentException("输入非数字！6");
        }

        byte[] bytes = word.getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
            InetAddress.getByName(s[0]), Integer.parseInt(s[2]));
        socket.send(packet);
        socket.close();
      } catch (Exception e) {
        e.printStackTrace();
      }


    }
  }
}
