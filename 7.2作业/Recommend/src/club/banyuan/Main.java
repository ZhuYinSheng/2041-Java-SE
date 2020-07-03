package club.banyuan;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    PersonalRecommender personalRecommender = new PersonalRecommender();

    personalRecommender.addLikes("小金", "1");
    personalRecommender.addLikes("小金", "2");
    personalRecommender.addLikes("小金", "3");
    personalRecommender.addLikes("小金", "4");

    personalRecommender.addLikes("小木", "2");
    personalRecommender.addLikes("小木", "3");
    personalRecommender.addLikes("小木", "5");

    personalRecommender.addLikes("小水", "4");

    System.out.println(personalRecommender.recommendByPerson("小木"));
    System.out.println(personalRecommender.likeBoth("小金", "2", "3"));
    System.out.println(personalRecommender.recommendByProject("3"));
  }
}
