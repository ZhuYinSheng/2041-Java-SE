package club.banyuan;

import java.util.Random;
import java.util.Scanner;

public enum FingerPattern {
  ROCK("石头", "1"),
  SCISSORS("剪刀","2"),
  PAPER("布","3"),
  ;

  private final String name;

  private final String id;

  FingerPattern(String name, String id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public static int getWinPattern(String rlt) {
    if ((ROCK.getId() + SCISSORS.getId() + PAPER.getId()).contains(rlt)) {
      return 1;
    } else if ((SCISSORS.getId() + PAPER.getId() + SCISSORS.getId()).contains(rlt)) {
      return 2;
    } else {
      return 3;
    }
  }

  public static String patternToString(int pattern) {
    switch (pattern) {
      case 1:
        return ROCK.getName();
      case 2:
        return SCISSORS.getName();
      case 3:
        return PAPER.getName();
    }
    return null;
  }

  public static void printRlt(PlayerRefine[] players) {

    int left = 0;
    for (PlayerRefine player : players) {
      if (!player.isOut()) {
        left++;
      }
    }

    if (players.length == left) {
      for (PlayerRefine player : players) {
        System.out.println(player.getType() + player.getName() + "出了" + patternToString(player.getPattern()));
      }
      System.out.println("平局");
    } else {
      for (PlayerRefine player : players) {
        String msg = player.isOut() ? "被淘汰" : "胜出";
        System.out.println(player.getType() + player.getName() + "出了" + patternToString(player.getPattern()) + msg);
      }
    }

    if (left == 1) {
      for (PlayerRefine player : players) {
        if (!player.isOut()) {
          System.out.println(player.getType() + player.getName() + "胜出");
        }
      }
    }
  }

  public static void randomPattern(PlayerRefine player) {
    Random random = new Random();
    // [0,3) + 1 = [1,4) = [1,3]
    player.setPattern(random.nextInt(3) + 1);
  }

  public static void scanUserPattern(PlayerRefine player) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请出拳：\n1.石头\n2.剪刀\n3.布");
    int pattern = scanner.nextInt();
    if (pattern < 1 || pattern > 3) {
      System.out.println("输入不合法！");
      scanUserPattern(player);
    } else {
      player.setPattern(pattern);
    }
  }
}