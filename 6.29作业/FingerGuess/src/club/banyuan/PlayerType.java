package club.banyuan;

import static club.banyuan.FingerPattern.getWinPattern;

import java.util.Random;
import java.util.Scanner;

public enum PlayerType {
  COMPUTER("电脑"),
  HUMAN("玩家");

  private final String name;

  PlayerType(String name) {
    this.name = name;
  }



  public String getName() {
    return name;
  }

  public static PlayerRefine[] getLeftPlayers(PlayerRefine[] players) {
    int left = 0;

    for (PlayerRefine player : players) {
      if (!player.isOut()) {
        left++;
      }
    }

    PlayerRefine[] playerRlt = new PlayerRefine[left];
    int count = 0;
    for (PlayerRefine player : players) {
      if (!player.isOut()) {
        playerRlt[count++] = player;
      }
    }
    if (playerRlt.length == 1) {
      System.exit(0);
    }
    return playerRlt;
  }

  public static PlayerRefine[] initPlayers() {
    int usersTotal = getUsersTotal();
    PlayerRefine[] players = new PlayerRefine[usersTotal];
    for (int i = 1; i < players.length; i++) {
      players[i] = new PlayerRefine(COMPUTER.getName(), i + "");
    }
    players[0] = new PlayerRefine(HUMAN.getName(), "");
    return players;
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

  public static String patternToString(int pattern) {
    switch (pattern) {
      case 1:
        return "石头";
      case 2:
        return "剪刀";
      case 3:
        return "布";
    }
    return null;
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


  public static int getUsersTotal() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("多少人参与猜拳（2~5人）:");
    int rlt = scanner.nextInt();
    if (rlt > 5 || rlt < 2) {
      System.out.println("输入不合法！");
      return getUsersTotal();
    }
    return rlt;
  }


  public static void setPattern(PlayerRefine[] players) {
    for (PlayerRefine player : players) {
      if (player.isOut()) {
        continue;
      }
      if (HUMAN.getName().equals(player.getType())) {
        scanUserPattern(player);
      } else {
        randomPattern(player);
      }
    }
  }

  public static void compact(PlayerRefine[] players) {
    String rlt = "";

    for (PlayerRefine player : players) {
      if (!rlt.contains(player.getPattern() + "")) {
        rlt += player.getPattern();
      }
    }

    if (rlt.length() != 2) {
      return;
    }

    int winPattern = getWinPattern(rlt);

    for (PlayerRefine player : players) {
      boolean isOut = player.getPattern() != winPattern;
      player.setOut(isOut);
    }

  }



}