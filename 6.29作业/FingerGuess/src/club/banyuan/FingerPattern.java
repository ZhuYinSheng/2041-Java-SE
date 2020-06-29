package club.banyuan;

public enum FingerPattern {
  ROCK("石头"),
  SCISSORS("剪刀"),
  PAPER("布"),
  STONE_WIN_PATTERN("121"),
  SCISSOR_WIN_PATTERN("232"),
  ;

  private final String name;

  FingerPattern(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static int getWinPattern(String rlt) {
    if (STONE_WIN_PATTERN.getName().contains(rlt)) {
      return 1;
    } else if (SCISSOR_WIN_PATTERN.getName().contains(rlt)) {
      return 2;
    } else {
      return 3;
    }

  }






























}
