package club.banyuan;

import org.junit.Assert;
import org.junit.Test;

public class RecommendTest {

  @Test
  public void test() {
    PersonalRecommender personalRecommender = new PersonalRecommender();

    personalRecommender.addLikes("小金", "1");
    personalRecommender.addLikes("小金", "2");
    personalRecommender.addLikes("小金", "3");
    personalRecommender.addLikes("小金", "4");

    personalRecommender.addLikes("小木", "2");
    personalRecommender.addLikes("小木", "3");
    personalRecommender.addLikes("小木", "5");

    personalRecommender.addLikes("小水", "4");

    Assert.assertTrue(personalRecommender.likeBoth("小金", "2", "3"));

    Assert.assertEquals(5, personalRecommender.recommendByPerson("小木").size());

    Assert.assertEquals(4, personalRecommender.recommendByProject("3").size());

  }

}
