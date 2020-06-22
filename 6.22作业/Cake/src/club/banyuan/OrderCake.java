package club.banyuan;

public class OrderCake extends Cake {

  private double weightInKG;

  public OrderCake(int n, double r, double weightInKG) {
    super(n, r);
    this.weightInKG = weightInKG;
  }

  public double getWeightInKG() {
    return weightInKG;
  }

  public void setWeightInKG(double weightInKG) {
    this.weightInKG = weightInKG;
  }

  @Override
  public double calcPrice() {
    return price * weightInKG;
  }
}
