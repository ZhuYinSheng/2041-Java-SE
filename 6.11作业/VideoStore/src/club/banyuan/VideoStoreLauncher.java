package club.banyuan;

public class VideoStoreLauncher {

  public static void main(String[] args) {
    VideoStore videoStore = new VideoStore();


    videoStore.addVideo("《黑客帝国》");
    videoStore.checkOut("《黑客帝国》");
    videoStore.receiveRating("《黑客帝国》", 2);
    videoStore.returnVideo("《黑客帝国》");

    videoStore.checkOut("《黑客帝国》");
    videoStore.receiveRating("《黑客帝国》", 3);
//    videoStore.returnVideo("《黑客帝国》");

    videoStore.listInventory();

    videoStore.addVideo("《教父》");
    videoStore.checkOut("《教父》");
    videoStore.receiveRating("《教父》", 3);
//    videoStore.returnVideo("《教父》");
    videoStore.listInventory();

    videoStore.addVideo("《星球大战》");
    videoStore.checkOut("《星球大战》");
    videoStore.receiveRating("《星球大战》", 4);
    videoStore.returnVideo("《星球大战》");
    videoStore.listInventory();

  }

}
