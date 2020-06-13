package club.banyuan;

public class VideoStore {

  private Video[] video = new Video[100];
  private int count = 0;

  public void addVideo(String name) {
    Video newVideo = new Video();
    newVideo.setName(name);
    video[count] = newVideo;
    count++;
  }

  public void checkOut(String name) {
    for (int i = 0; i < count; i++) {
      if (video[i].getName().equals(name)) {
        video[i].setIndex(true);
        video[i].rentCount++;
      }
    }
  }

  public void returnVideo(String name) {
    for (int i = 0; i < count; i++) {
      if (video[i].getName().equals(name)) {
        video[i].setIndex(false);
      }
    }
  }

  public void receiveRating(String name, int rate) {
    for (int i = 0; i < count; i++) {
      if (video[i].getName().equals(name)) {

        if (video[i].rentCount == 1) {
          video[i].setAverageRating(rate);
          return;
        }

        video[i].setAverageRating(
            ((video[i].getAverageRating() * (video[i].rentCount - 1) + rate) / video[i].rentCount));

      }
    }
  }

  public void listInventory() {
    for (int i = 0; i < count; i++) {
      System.out.println(video[i].getName());
      System.out.println("影片评分：" + video[i].getAverageRating());
      System.out.println("是否借出：" + video[i].isIndex());
      System.out.println();
    }
  }

}
