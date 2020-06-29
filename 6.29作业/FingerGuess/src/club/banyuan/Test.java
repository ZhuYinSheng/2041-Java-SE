package club.banyuan;

import static club.banyuan.PlayerType.*;

public class Test {

  public static void main(String[] args) {

    PlayerRefine[] players = initPlayers();

    while (true) {
      setPattern(players);
      compact(players);
      printRlt(players);
      players = getLeftPlayers(players);


    }
  }
}
