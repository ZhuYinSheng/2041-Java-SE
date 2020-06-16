package club.banyuan;

public class ReverseLetter {

  public String reverse(String str) {

    char[] charsHead = str.toCharArray();
    char[] charsTail = new char[charsHead.length];
    for (int i = 0; i < charsHead.length; i++) {
      charsTail[charsHead.length - i - 1] = charsHead[i];
    }
    return String.valueOf(charsTail);
  }

  public static void main(String[] args) {
    ReverseLetter reverseLetter = new ReverseLetter();
    String word = "To be or not to be";
    String[] words = word.split(" ");

    for (int i = 0; i < words.length; i++) {
      reverseLetter.reverse(words[i]);
    }
    System.out.println(reverseLetter.toString());
  }
}
