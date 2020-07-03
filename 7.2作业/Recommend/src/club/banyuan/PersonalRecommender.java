package club.banyuan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonalRecommender implements Recommender<String, String> {

  private final Map<String, List<String>> likes = new HashMap<>();

  @Override
  public void addLikes(String name, String project) {
    if (!likes.containsKey(name)) {
      List<String> likeList = new LinkedList<>();
      likeList.add(project);
      likes.put(name, likeList);
    } else if (!likes.get(name).contains(project)) {
      likes.get(name).add(project);
    }
  }

  @Override
  public boolean likeBoth(String name, String firstProject, String secondProject) {
    if (!likes.containsKey(name)) {
      throw new UnknownPersonException("未找到该人。");
    } else {
      List<String> likeList = likes.get(name);
      return likeList.contains(firstProject) && likeList.contains(secondProject);
    }
  }

  @Override
  public List<String> recommendByPerson(String name) {
    List<String> list = likes.get(name);
    Set<String> result = new HashSet<>();

    for (List<String> one : likes.values()) {
      List<String> list1 = new ArrayList<>(one);
      list1.retainAll(list);
      if (list1.size() > 0) {
        result.addAll(one);
      }
    }
    result.addAll(list);
    return new LinkedList<>(result);
  }

  @Override
  public List<String> recommendByProject(String project) {
    Set<String> result = new HashSet<>();
    for (List<String> one : likes.values()) {
      if (one.contains(project)) {
        one.remove(project);
        result.addAll(one);
      }
    }
    return new LinkedList<>(result);
  }

}
