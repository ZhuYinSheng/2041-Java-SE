package club.banyuan;

import java.util.LinkedList;
import java.util.List;
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
    Assert.assertFalse(personalRecommender.likeBoth("小金", "2", "5"));

    List<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");

    Assert.assertTrue(list.containsAll(personalRecommender.recommendByPerson("小木")));

    Assert.assertEquals(5, personalRecommender.recommendByPerson("小木").size());

    List<String> list1 = new LinkedList<>();
    list1.add("1");
    list1.add("2");
    list1.add("4");
    list1.add("5");

    Assert.assertTrue(list1.containsAll(personalRecommender.recommendByProject("3")));
    System.out.println(personalRecommender.recommendByProject("3"));
//    Assert.assertEquals(4, personalRecommender.recommendByProject("3").size());
  }
}