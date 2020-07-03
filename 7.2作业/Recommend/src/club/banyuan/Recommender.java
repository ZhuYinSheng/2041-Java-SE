package club.banyuan;

import java.util.List;

public interface Recommender<K, V> {

    void addLikes(K name, V project);

    boolean likeBoth(K name, V firstProject, V secondProject);

    List<K> recommendByPerson(K name);

    List<K> recommendByProject(V project);
}
